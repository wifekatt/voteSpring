
package com.example.voteSpring.services;
import java.util.List;
import java.util.Map;

import com.example.voteSpring.entities.Vote;

public interface IVoteService {
public List<Vote> getAll() ;


 public java.util.Optional<Vote> getVoteById( Long voteID);


 public Vote createVote(  Vote vote) ;


 public Vote updateVote( Long voteID,  Vote voteDetails) ;


 public Map<String, Boolean> deleteVote( Long voteID);


}
