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
@Table(name ="urnes")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Urne {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long urneID;
	private String urneName;
	
	public Urne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Urne(String urneName) {
		super();
		this.urneName = urneName;
	}


	public long getUrneID() {
		return urneID;
	}
	public void setUrneID(long urneID) {
		this.urneID = urneID;
	}
	public String getUrneName() {
		return urneName;
	}
	public void setUrneName(String urneName) {
		this.urneName = urneName;
	}


	@Override
	public String toString() {
		return "Urne [urneID=" + urneID + ", urneName=" + urneName + "]";
	}
	
	
	

}
