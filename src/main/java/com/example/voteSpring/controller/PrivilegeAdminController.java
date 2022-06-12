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

import com.example.voteSpring.entities.PrivilegeAdmin;
import com.example.voteSpring.services.IPrivilegeAdminService; 

@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RestController
@RequestMapping("/api")
public class PrivilegeAdminController {
@Autowired
private IPrivilegeAdminService privilegeAdminService;


@GetMapping("/privilegeAdmins") 

public List<PrivilegeAdmin> getAll() {
return privilegeAdminService.getAll();
} 

@GetMapping("/privilegeAdmins/{id}") 

public java.util.Optional<PrivilegeAdmin>getPrivilegeAdminById(@PathVariable(value = "id") Long privilegeID)
{
return privilegeAdminService.getPrivilegeAdminById(privilegeID); 

}
@PostMapping("/privilegeAdmins") 

public PrivilegeAdmin createPrivilegeAdmin(@RequestBody PrivilegeAdmin privilegeAdmin) {
return privilegeAdminService.createPrivilegeAdmin(privilegeAdmin);
}




@PutMapping("/privilegeAdmins/{id}")


public PrivilegeAdmin updatePrivilegeAdmin(@PathVariable(value="id") Long privilegeID,@RequestBody PrivilegeAdmin privilegeAdminDetails)
{
return  privilegeAdminService.updatePrivilegeAdmin(privilegeID,privilegeAdminDetails); 

}


@DeleteMapping("/privilegeAdmins/{id}")
public Map<String, Boolean> deletePrivilegeAdmin(@PathVariable(value="id") Long privilegeID )
{
     return privilegeAdminService.deletePrivilegeAdmin(privilegeID);
} 

}