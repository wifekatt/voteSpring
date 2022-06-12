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

import com.example.voteSpring.entities.Electeur;
import com.example.voteSpring.services.IElecteurService; 

@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RestController
@RequestMapping("/api")
public class ElecteurController {
@Autowired
private IElecteurService electeurService;


@GetMapping("/electeurs") 

public List<Electeur> getAll() {
return electeurService.getAll();
} 

@GetMapping("/electeurs/{id}") 

public java.util.Optional<Electeur>getElecteurById(@PathVariable(value = "id") Long electeurID)
{
return electeurService.getElecteurById(electeurID); 

}
@PostMapping("/electeurs") 

public Electeur createElecteur(@RequestBody Electeur electeur) {
return electeurService.createElecteur(electeur);
}




@PutMapping("/electeurs/{id}")


public Electeur updateElecteur(@PathVariable(value="id") Long electeurID,@RequestBody Electeur electeurDetails)
{
return  electeurService.updateElecteur(electeurID,electeurDetails); 

}


@DeleteMapping("/electeurs/{id}")
public Map<String, Boolean> deleteElecteur(@PathVariable(value="id") Long electeurID )
{
     return electeurService.deleteElecteur(electeurID);
} 

}