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

import com.example.voteSpring.entities.Urne;
import com.example.voteSpring.services.IUrneService; 

@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RestController
@RequestMapping("/api")
public class UrneController {
@Autowired
private IUrneService urneService;


@GetMapping("/urnes") 

public List<Urne> getAll() {
return urneService.getAll();
} 

@GetMapping("/urnes/{id}") 

public java.util.Optional<Urne>getUrneById(@PathVariable(value = "id") Long urneID)
{
return urneService.getUrneById(urneID); 

}
@PostMapping("/urnes") 

public Urne createUrne(@RequestBody Urne urne) {
return urneService.createUrne(urne);
}




@PutMapping("/urnes/{id}")


public Urne updateUrne(@PathVariable(value="id") Long urneID,@RequestBody Urne urneDetails)
{
return  urneService.updateUrne(urneID,urneDetails); 

}


@DeleteMapping("/urnes/{id}")
public Map<String, Boolean> deleteUrne(@PathVariable(value="id") Long urneID )
{
     return urneService.deleteUrne(urneID);
} 

}