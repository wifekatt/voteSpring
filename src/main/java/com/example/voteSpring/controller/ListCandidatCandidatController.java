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

import com.example.voteSpring.entities.ListCandidatCandidat;
import com.example.voteSpring.services.IListCandidatCandidatService; 

@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RestController
@RequestMapping("/api")
public class ListCandidatCandidatController {
@Autowired
private IListCandidatCandidatService listCandidatCandidatService;


@GetMapping("/listCandidatCandidats") 

public List<ListCandidatCandidat> getAll() {
return listCandidatCandidatService.getAll();
} 

@GetMapping("/listCandidatCandidats/{id}") 

public java.util.Optional<ListCandidatCandidat>getListCandidatCandidatById(@PathVariable(value = "id") Long listID,@PathVariable(value = "id") Long candidatID)
{
return listCandidatCandidatService.getListCandidatCandidatById(listID,candidatID); 

}
@PostMapping("/listCandidatCandidats") 

public ListCandidatCandidat createListCandidatCandidat(@RequestBody ListCandidatCandidat listCandidatCandidat) {
return listCandidatCandidatService.createListCandidatCandidat(listCandidatCandidat);
}




@PutMapping("/listCandidatCandidats/{id}")


public ListCandidatCandidat updateListCandidatCandidat(@PathVariable(value="id") Long listID,@PathVariable(value="id") Long candidatID,@RequestBody ListCandidatCandidat listCandidatCandidatDetails)
{
return  listCandidatCandidatService.updateListCandidatCandidat(listID,candidatID,listCandidatCandidatDetails); 

}


@DeleteMapping("/listCandidatCandidats/{id}")
public Map<String, Boolean> deleteListCandidatCandidat(@PathVariable(value="id") Long listID,@PathVariable(value="id") Long candidatID )
{
     return listCandidatCandidatService.deleteListCandidatCandidat(listID,candidatID);
} 

}