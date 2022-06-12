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

import com.example.voteSpring.entities.ListCandidat;
import com.example.voteSpring.services.IListCandidatService; 

@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RestController
@RequestMapping("/api")
public class ListCandidatController {
@Autowired
private IListCandidatService listCandidatService;


@GetMapping("/listCandidats") 

public List<ListCandidat> getAll() {
return listCandidatService.getAll();
} 

@GetMapping("/listCandidats/{id}") 

public java.util.Optional<ListCandidat>getListCandidatById(@PathVariable(value = "id") Long listID)
{
return listCandidatService.getListCandidatById(listID); 

}
@PostMapping("/listCandidats") 

public ListCandidat createListCandidat(@RequestBody ListCandidat listCandidat) {
return listCandidatService.createListCandidat(listCandidat);
}




@PutMapping("/listCandidats/{id}")


public ListCandidat updateListCandidat(@PathVariable(value="id") Long listID,@RequestBody ListCandidat listCandidatDetails)
{
return  listCandidatService.updateListCandidat(listID,listCandidatDetails); 

}


@DeleteMapping("/listCandidats/{id}")
public Map<String, Boolean> deleteListCandidat(@PathVariable(value="id") Long listID )
{
     return listCandidatService.deleteListCandidat(listID);
} 

}