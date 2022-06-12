package com.example.voteSpring.services.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voteSpring.entities.Electeur;
import com.example.voteSpring.exception.ResourceNotFoundException;
import com.example.voteSpring.repository.IElecteurDao;
import com.example.voteSpring.services.IElecteurService;

@Service
@Transactional
public class ElecteurService implements IElecteurService{
@Autowired
private IElecteurDao electeurDao;
@Override
  public List<Electeur> getAll() {
return electeurDao.findAll(); 

} 

   @Override
  public java.util.Optional<Electeur> getElecteurById(Long electeurID)
{
java.util.Optional<Electeur> elect= electeurDao.findById(electeurID);
return elect;
}


@Override
  public Electeur createElecteur(  Electeur electeur) {
return electeurDao.save(electeur);
}



@Override
  public Electeur updateElecteur ( Long electeurID,  Electeur electeurDetails) throws ResourceNotFoundException {
Electeur electeur = electeurDao.findById(electeurID).orElseThrow(() -> new ResourceNotFoundException("Electeur not found for this id :" + electeurID));
final Electeur updatedelecteur = electeurDao.save(electeur);
return updatedelecteur ;
}




  @Override
  public Map<String, Boolean> deleteElecteur( Long electeurID ){
java.util.Optional<Electeur> electeur = electeurDao.findById(electeurID);
electeurDao.deleteById(electeurID);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return response;
}
}