package com.example.voteSpring.services.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voteSpring.entities.Candidat;
import com.example.voteSpring.exception.ResourceNotFoundException;
import com.example.voteSpring.repository.ICandidatDao;
import com.example.voteSpring.services.ICandidatService;

@Service
@Transactional
public class CandidatService implements ICandidatService{
@Autowired
private ICandidatDao candidatDao;
@Override
  public List<Candidat> getAll() {
return candidatDao.findAll(); 

} 

   @Override
  public java.util.Optional<Candidat> getCandidatById(Long candidatID)
{
java.util.Optional<Candidat> cand= candidatDao.findById(candidatID);
return cand;
}


@Override
  public Candidat createCandidat(  Candidat candidat) {
return candidatDao.save(candidat);
}



@Override
  public Candidat updateCandidat ( Long candidatID,  Candidat candidatDetails) throws ResourceNotFoundException {
Candidat candidat = candidatDao.findById(candidatID).orElseThrow(() -> new ResourceNotFoundException("Candidat not found for this id :" + candidatID));
final Candidat updatedcandidat = candidatDao.save(candidat);
return updatedcandidat ;
}




  @Override
  public Map<String, Boolean> deleteCandidat( Long candidatID ){
java.util.Optional<Candidat> candidat = candidatDao.findById(candidatID);
candidatDao.deleteById(candidatID);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return response;
}
}