package com.example.voteSpring.services;
import java.util.List;
import java.util.Map;

import com.example.voteSpring.entities.Urne;

public interface IUrneService {
public List<Urne> getAll() ;

 public java.util.Optional<Urne> getUrneById( Long urneID);


 public Urne createUrne(  Urne urne) ;


 public Urne updateUrne( Long urneID,  Urne urneDetails) ;


 public Map<String, Boolean> deleteUrne( Long urneID);


}
