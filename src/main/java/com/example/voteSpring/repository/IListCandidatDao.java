package com.example.voteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.voteSpring.entities.ListCandidat;


@RepositoryRestResource
public interface IListCandidatDao extends JpaRepository<ListCandidat, Long> {

}
