package com.example.voteSpring.services.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voteSpring.entities.PrivilegeAdmin;
import com.example.voteSpring.exception.ResourceNotFoundException;
import com.example.voteSpring.repository.IPrivilegeAdminDao;
import com.example.voteSpring.services.IPrivilegeAdminService;

@Service
@Transactional
public class PrivilegeAdminService implements IPrivilegeAdminService{
@Autowired
private IPrivilegeAdminDao privilegeAdminDao;
@Override
  public List<PrivilegeAdmin> getAll() {
return privilegeAdminDao.findAll(); 

} 

   @Override
  public java.util.Optional<PrivilegeAdmin> getPrivilegeAdminById(Long privilegeID)
{
java.util.Optional<PrivilegeAdmin> privileg= privilegeAdminDao.findById(privilegeID);
return privileg;
}


@Override
  public PrivilegeAdmin createPrivilegeAdmin(  PrivilegeAdmin privilegeAdmin) {
return privilegeAdminDao.save(privilegeAdmin);
}



@Override
  public PrivilegeAdmin updatePrivilegeAdmin ( Long privilegeID,  PrivilegeAdmin privilegeAdminDetails) throws ResourceNotFoundException {
PrivilegeAdmin privilegeAdmin = privilegeAdminDao.findById(privilegeID).orElseThrow(() -> new ResourceNotFoundException("PrivilegeAdmin not found for this id :" + privilegeID));
final PrivilegeAdmin updatedprivilegeAdmin = privilegeAdminDao.save(privilegeAdmin);
return updatedprivilegeAdmin ;
}




  @Override
  public Map<String, Boolean> deletePrivilegeAdmin( Long privilegeID ){
java.util.Optional<PrivilegeAdmin> privilegeAdmin = privilegeAdminDao.findById(privilegeID);
privilegeAdminDao.deleteById(privilegeID);
Map<String, Boolean> response = new HashMap<>();
response.put("deleted", Boolean.TRUE);
return response;
}
}