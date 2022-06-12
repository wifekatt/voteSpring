package com.example.voteSpring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name ="listCandidatCandidats")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ListCandidatCandidat {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long listID;
	private long candidatID;

	
	public ListCandidatCandidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ListCandidatCandidat(long candidatID) {
		super();
		this.candidatID = candidatID;
	}


	public long getListID() {
		return listID;
	}
	public void setListID(long listID) {
		this.listID = listID;
	}
	public long getCandidatID() {
		return candidatID;
	}
	public void setCandidatID(long candidatID) {
		this.candidatID = candidatID;
	}


	@Override
	public String toString() {
		return "ListCandidatCandidat [listID=" + listID + ", candidatID=" + candidatID + "]";
	}
	


}
