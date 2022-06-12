package com.example.voteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.voteSpring.entities.Electeur;


@RepositoryRestResource
public interface IElecteurDao extends JpaRepository<Electeur, Long> {

}
