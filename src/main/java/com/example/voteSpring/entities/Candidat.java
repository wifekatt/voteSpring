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
@Table(name ="candidats")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Candidat {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long candidatID;
	private String candidatName;
	
	
	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Candidat(String candidatName) {
		super();
		this.candidatName = candidatName;
	}


	public long getCandidatID() {
		return candidatID;
	}
	public void setCandidatID(long candidatID) {
		this.candidatID = candidatID;
	}
	public String getCandidatName() {
		return candidatName;
	}
	public void setCandidatName(String candidatName) {
		this.candidatName = candidatName;
	}


	@Override
	public String toString() {
		return "Candidat [candidatID=" + candidatID + ", candidatName=" + candidatName + "]";
	}
	
}
