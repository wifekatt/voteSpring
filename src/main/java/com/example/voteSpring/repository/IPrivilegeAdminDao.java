package com.example.voteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.voteSpring.entities.PrivilegeAdmin;


@RepositoryRestResource
public interface IPrivilegeAdminDao extends JpaRepository<PrivilegeAdmin,Long> {

}
