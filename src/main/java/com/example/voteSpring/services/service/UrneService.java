package com.example.voteSpring.services.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voteSpring.entities.Urne;
import com.example.voteSpring.exception.ResourceNotFoundException;
import com.example.voteSpring.repository.IUrneDao;
import com.example.voteSpring.services.IUrneService;

@Service
@Transactional
public class UrneService implements IUrneService{
@Autowired
private IUrneDao urneDao;
@Override
  public List<Urne> getAll() {
return urneDao.findAll(); 

} 

   @Override
  public java.util.Optional<Urne> getUrneById(Long urneID)
{
java.util.Optional<Urne> urn= urneDao.findById(urneID);
return urn;
}


@Override
  public Urne createUrne(  Urne urne) {
return urneDao.save(urne);
}



@Override
  public Urne updateUrne ( Long urneID,  Urne urneDetails) throws ResourceNotFoundException {
Urne urne = urneDao.findById(urneID).orElseThrow(() -> new ResourceNotFoundException("Urne not found for this id :" + urneID));
final Urne updatedurne = urneDao.save(urne);
return updatedurne ;
}




  @Override
  public Map<String, Boolean> deleteUrne( Long urneID ){
java.util.Optional<Urne> urne = urneDao.findById(urneID);
urneDao.deleteById(urneID);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return response;
}
}