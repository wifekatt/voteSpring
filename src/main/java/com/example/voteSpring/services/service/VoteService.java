package com.example.voteSpring.services.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voteSpring.entities.Vote;
import com.example.voteSpring.exception.ResourceNotFoundException;
import com.example.voteSpring.repository.IVoteDao;
import com.example.voteSpring.services.IVoteService;

@Service
@Transactional
public class VoteService implements IVoteService{
@Autowired
private IVoteDao voteDao;
@Override
  public List<Vote> getAll() {
return voteDao.findAll(); 

} 

   @Override
  public java.util.Optional<Vote> getVoteById(Long voteID)
{
java.util.Optional<Vote> vot= voteDao.findById(voteID);
return vot;
}


@Override
  public Vote createVote(  Vote vote) {
return voteDao.save(vote);
}



@Override
  public Vote updateVote ( Long voteID,  Vote voteDetails) throws ResourceNotFoundException {
Vote vote = voteDao.findById(voteID).orElseThrow(() -> new ResourceNotFoundException("Vote not found for this id :" + voteID));
final Vote updatedvote = voteDao.save(vote);
return updatedvote ;
}




  @Override
  public Map<String, Boolean> deleteVote( Long voteID ){
java.util.Optional<Vote> vote = voteDao.findById(voteID);
voteDao.deleteById(voteID);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return response;
}
}