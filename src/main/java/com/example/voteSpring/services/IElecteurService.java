package com.example.voteSpring.services;
import java.util.List;
import java.util.Map;

import com.example.voteSpring.entities.Electeur;

public interface IElecteurService {
public List<Electeur> getAll() ;

 public java.util.Optional<Electeur> getElecteurById( Long electeurID);


 public Electeur createElecteur(  Electeur electeur) ;


 public Electeur updateElecteur( Long electeurID,  Electeur electeurDetails) ;


 public Map<String, Boolean> deleteElecteur( Long electeurID);


}
