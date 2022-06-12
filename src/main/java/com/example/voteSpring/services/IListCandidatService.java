package com.example.voteSpring.services;
import java.util.List;
import java.util.Map;

import com.example.voteSpring.entities.ListCandidat;

public interface IListCandidatService {
public List<ListCandidat> getAll() ;

 public java.util.Optional<ListCandidat> getListCandidatById( Long listID);


 public ListCandidat createListCandidat(  ListCandidat listCandidat) ;


 public ListCandidat updateListCandidat( Long listID,  ListCandidat listCandidatDetails) ;


 public Map<String, Boolean> deleteListCandidat( Long listID);


}
