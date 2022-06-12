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
@Table(name ="listCandidats")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ListCandidat {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long listID;
	private String listName;
	
	
	public ListCandidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ListCandidat(String listName) {
		super();
		this.listName = listName;
	}


	public long getListID() {
		return listID;
	}
	public void setListID(long listID) {
		this.listID = listID;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}


	@Override
	public String toString() {
		return "ListCandidat [listID=" + listID + ", listName=" + listName + "]";
	}
	





}
