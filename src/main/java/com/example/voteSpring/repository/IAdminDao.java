package com.example.voteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.voteSpring.entities.Admin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IAdminDao extends JpaRepository<Admin,Long> {

}