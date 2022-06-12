package com.example.voteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.voteSpring.entities.Vote;


@RepositoryRestResource
public interface IVoteDao extends JpaRepository<Vote,Long> {

}
