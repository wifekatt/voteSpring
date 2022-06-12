package com.example.voteSpring.services;
import java.util.List;
import java.util.Map;

import com.example.voteSpring.entities.Admin;

public interface IAdminService {
public List<Admin> getAll() ;


 public java.util.Optional<Admin> getAdminById( Long adminID);


 public Admin createAdmin(  Admin admin) ;


 public Admin updateAdmin( Long adminID,  Admin adminDetails) ;


 public Map<String, Boolean> deleteAdmin( Long adminID);


}
