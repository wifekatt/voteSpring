package com.example.voteSpring.services;
import java.util.List;
import java.util.Map;

import com.example.voteSpring.entities.PrivilegeAdmin;

public interface IPrivilegeAdminService {
public List<PrivilegeAdmin> getAll() ;


 public java.util.Optional<PrivilegeAdmin> getPrivilegeAdminById( Long privilegeID);


 public PrivilegeAdmin createPrivilegeAdmin(  PrivilegeAdmin privilegeAdmin) ;


 public PrivilegeAdmin updatePrivilegeAdmin( Long privilegeID,  PrivilegeAdmin privilegeAdminDetails) ;


 public Map<String, Boolean> deletePrivilegeAdmin( Long privilegeID);


}
