package com.example.voteSpring.controller;

import java.util.List;
import java.util.Map; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

import com.example.voteSpring.entities.Vote;
import com.example.voteSpring.services.IVoteService; 

@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RestController
@RequestMapping("/api")
public class VoteController {
@Autowired
private IVoteService voteService;


@GetMapping("/votes") 

public List<Vote> getAll() {
return voteService.getAll();
} 

@GetMapping("/votes/{id}") 

public java.util.Optional<Vote>getVoteById(@PathVariable(value = "id") Long voteID)
{
return voteService.getVoteById(voteID); 

}
@PostMapping("/votes") 

public Vote createVote(@RequestBody Vote vote) {
return voteService.createVote(vote);
}




@PutMapping("/votes/{id}")


public Vote updateVote(@PathVariable(value="id") Long voteID,@RequestBody Vote voteDetails)
{
return  voteService.updateVote(voteID,voteDetails); 

}


@DeleteMapping("/votes/{id}")
public Map<String, Boolean> deleteVote(@PathVariable(value="id") Long voteID )
{
     return voteService.deleteVote(voteID);
} 

}