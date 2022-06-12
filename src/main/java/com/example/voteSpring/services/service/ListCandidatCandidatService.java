package com.example.voteSpring.services.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voteSpring.entities.ListCandidatCandidat;
import com.example.voteSpring.exception.ResourceNotFoundException;
import com.example.voteSpring.repository.IListCandidatCandidatDao;
import com.example.voteSpring.services.IListCandidatCandidatService;

@Service
@Transactional
public class ListCandidatCandidatService implements IListCandidatCandidatService{
@Autowired
private IListCandidatCandidatDao listCandidatCandidatDao;
@Override
  public List<ListCandidatCandidat> getAll() {
	return listCandidatCandidatDao.findAll();

} 

   @Override
  public java.util.Optional<ListCandidatCandidat> getListCandidatCandidatById(Long listID , Long candidatID)
{
java.util.Optional<ListCandidatCandidat> listCand= listCandidatCandidatDao.findById(listID);
return listCand;
}


@Override
  public ListCandidatCandidat createListCandidatCandidat(  ListCandidatCandidat listCandidatCandidat) {
return listCandidatCandidatDao.save(listCandidatCandidat);
}



@Override
  public ListCandidatCandidat updateListCandidatCandidat ( Long listID, Long candidatID, ListCandidatCandidat listCandidatCandidatDetails) throws ResourceNotFoundException {
ListCandidatCandidat listCandidatCandidat = listCandidatCandidatDao.findById(listID).orElseThrow(() -> new ResourceNotFoundException("ListCandidatCandidat not found for this id :" + listID));
final ListCandidatCandidat updatedlistCandidatCandidat = listCandidatCandidatDao.save(listCandidatCandidat);
return updatedlistCandidatCandidat ;
}




  @Override
  public Map<String, Boolean> deleteListCandidatCandidat( Long listID, Long candidatID ){
java.util.Optional<ListCandidatCandidat> listCandidatCandidat = listCandidatCandidatDao.findById(listID);
listCandidatCandidatDao.deleteById(listID);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return response;
}
}