package com.example.voteSpring.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="votes")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Vote {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long voteID;
	private String voteName; 
	private int MaxNumChoices;
	private Date BeginDate;
	private Date ExpiryDate;
	
	
	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Vote(String voteName, int maxNumChoices, Date beginDate, Date expiryDate) {
		super();
		this.voteName = voteName;
		MaxNumChoices = maxNumChoices;
		BeginDate = beginDate;
		ExpiryDate = expiryDate;
	}


	public long getVoteID() {
		return voteID;
	}
	public void setVoteID(long voteID) {
		this.voteID = voteID;
	}
	public String getVoteName() {
		return voteName;
	}
	public void setVoteName(String voteName) {
		this.voteName = voteName;
	}
	public int getMaxNumChoices() {
		return MaxNumChoices;
	}
	public void setMaxNumChoices(int maxNumChoices) {
		MaxNumChoices = maxNumChoices;
	}
	public Date getBeginDate() {
		return BeginDate;
	}
	public void setBeginDate(Date beginDate) {
		BeginDate = beginDate;
	}
	public Date getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}


	@Override
	public String toString() {
		return "Vote [voteID=" + voteID + ", voteName=" + voteName + ", MaxNumChoices=" + MaxNumChoices + ", BeginDate="
				+ BeginDate + ", ExpiryDate=" + ExpiryDate + "]";
	}

	
}
