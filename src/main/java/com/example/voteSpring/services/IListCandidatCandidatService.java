package com.example.voteSpring.services;
import java.util.List;
import java.util.Map;

import com.example.voteSpring.entities.ListCandidatCandidat;

public interface IListCandidatCandidatService {
public List<ListCandidatCandidat> getAll() ;

 public java.util.Optional<ListCandidatCandidat> getListCandidatCandidatById( Long listID , Long candidatID);


 public ListCandidatCandidat createListCandidatCandidat(  ListCandidatCandidat listCandidatCandidat) ;


 public ListCandidatCandidat updateListCandidatCandidat( Long listID, Long candidatID, ListCandidatCandidat listCandidatCandidatDetails) ;


 public Map<String, Boolean> deleteListCandidatCandidat( Long listID, Long candidatID);


}
