package com.example.voteSpring.services.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voteSpring.entities.Admin;
import com.example.voteSpring.exception.ResourceNotFoundException;
import com.example.voteSpring.repository.IAdminDao;
import com.example.voteSpring.services.IAdminService;

@Service
@Transactional
public class AdminService implements IAdminService{
@Autowired
private IAdminDao adminDao;
@Override
  public List<Admin> getAll() {
return adminDao.findAll(); 

} 

   @Override
  public java.util.Optional<Admin> getAdminById(Long adminID)
{
java.util.Optional<Admin> admn= adminDao.findById(adminID);
return admn;
}


@Override
  public Admin createAdmin(  Admin admin) {
return adminDao.save(admin);
}



@Override
  public Admin updateAdmin ( Long adminID,  Admin adminDetails) throws ResourceNotFoundException {
Admin admin = adminDao.findById(adminID).orElseThrow(() -> new ResourceNotFoundException("Admin not found for this id :" + adminID));
final Admin updatedadmin = adminDao.save(admin);
return updatedadmin ;
}


  @Override
  public Map<String, Boolean> deleteAdmin( Long adminID ){
java.util.Optional<Admin> admin = adminDao.findById(adminID);
adminDao.deleteById(adminID);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return response;
}
}