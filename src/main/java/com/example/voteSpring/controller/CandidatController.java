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

import com.example.voteSpring.entities.Candidat;
import com.example.voteSpring.services.ICandidatService; 

@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RestController
@RequestMapping("/api")
public class CandidatController {
@Autowired
private ICandidatService candidatService;


@GetMapping("/candidats") 

public List<Candidat> getAll() {
return candidatService.getAll();
} 

@GetMapping("/candidats/{id}") 

public java.util.Optional<Candidat>getCandidatById(@PathVariable(value = "id") Long candidatID)
{
return candidatService.getCandidatById(candidatID); 

}
@PostMapping("/candidats") 

public Candidat createCandidat(@RequestBody Candidat candidat) {
return candidatService.createCandidat(candidat);
}




@PutMapping("/candidats/{id}")


public Candidat updateCandidat(@PathVariable(value="id") Long candidatID,@RequestBody Candidat candidatDetails)
{
return  candidatService.updateCandidat(candidatID,candidatDetails); 

}


@DeleteMapping("/candidats/{id}")
public Map<String, Boolean> deleteCandidat(@PathVariable(value="id") Long candidatID )
{
     return candidatService.deleteCandidat(candidatID);
} 

}