package com.example.voteSpring.services.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voteSpring.entities.ListCandidat;
import com.example.voteSpring.exception.ResourceNotFoundException;
import com.example.voteSpring.repository.IListCandidatDao;
import com.example.voteSpring.services.IListCandidatService;

@Service
@Transactional
public class ListCandidatService implements IListCandidatService{
@Autowired
private IListCandidatDao listCandidatDao;
@Override
  public List<ListCandidat> getAll() {
return listCandidatDao.findAll(); 

} 

   @Override
  public java.util.Optional<ListCandidat> getListCandidatById(Long listID)
{
java.util.Optional<ListCandidat> lst= listCandidatDao.findById(listID);
return lst;
}


@Override
  public ListCandidat createListCandidat(  ListCandidat listCandidat) {
return listCandidatDao.save(listCandidat);
}



@Override
  public ListCandidat updateListCandidat ( Long listID,  ListCandidat listCandidatDetails) throws ResourceNotFoundException {
ListCandidat listCandidat = listCandidatDao.findById(listID).orElseThrow(() -> new ResourceNotFoundException("ListCandidat not found for this id :" + listID));
final ListCandidat updatedlistCandidat = listCandidatDao.save(listCandidat);
return updatedlistCandidat ;
}




  @Override
  public Map<String, Boolean> deleteListCandidat( Long listID ){
java.util.Optional<ListCandidat> listCandidat = listCandidatDao.findById(listID);
listCandidatDao.deleteById(listID);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return response;
}
}