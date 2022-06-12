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

import com.example.voteSpring.entities.Admin;
import com.example.voteSpring.services.IAdminService; 

@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RestController
@RequestMapping("/api")
public class AdminController {
@Autowired
private IAdminService adminService;


@GetMapping("/admins") 

public List<Admin> getAll() {
return adminService.getAll();
} 

@GetMapping("/admins/{id}") 

public java.util.Optional<Admin>getAdminById(@PathVariable(value = "id") Long adminID)
{
return adminService.getAdminById(adminID); 

}
@PostMapping("/admins") 

public Admin createAdmin(@RequestBody Admin admin) {
return adminService.createAdmin(admin);
}




@PutMapping("/admins/{id}")


public Admin updateAdmin(@PathVariable(value="id") Long adminID,@RequestBody Admin adminDetails)
{
return  adminService.updateAdmin(adminID,adminDetails); 

}


@DeleteMapping("/admins/{id}")
public Map<String, Boolean> deleteAdmin(@PathVariable(value="id") Long adminID )
{
     return adminService.deleteAdmin(adminID);
} 

}