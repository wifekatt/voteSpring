package com.example.voteSpring.services;
import java.util.List;
import java.util.Map;

import com.example.voteSpring.entities.Candidat;

public interface ICandidatService {
public List<Candidat> getAll() ;


 public java.util.Optional<Candidat> getCandidatById( Long candidatID);


 public Candidat createCandidat(  Candidat candidat) ;


 public Candidat updateCandidat( Long candidatID,  Candidat candidatDetails) ;


 public Map<String, Boolean> deleteCandidat( Long candidatID);


}
