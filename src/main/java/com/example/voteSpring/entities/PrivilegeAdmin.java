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
@Table(name ="privilegeAdmins")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PrivilegeAdmin {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long privilegeID;
	private String privilegeName;
	private boolean reead;
	private boolean wriite;
	
	
	public PrivilegeAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PrivilegeAdmin(String privilegeName, boolean reead, boolean wriite) {
		super();
		this.privilegeName = privilegeName;
		this.reead = reead;
		this.wriite = wriite;
	}


	public long getPrivilegeID() {
		return privilegeID;
	}
	public void setPrivilegeID(long privilegeID) {
		this.privilegeID = privilegeID;
	}
	public String getPrivilegeName() {
		return privilegeName;
	}
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	public boolean isReead() {
		return reead;
	}
	public void setRead(boolean reead) {
		this.reead = reead;
	}
	public boolean isWriite() {
		return wriite;
	}
	public void setWrite(boolean wriite) {
		this.wriite = wriite;
	}


	@Override
	public String toString() {
		return "PrivilegeAdmin [privilegeID=" + privilegeID + ", privilegeName=" + privilegeName + ", reead=" + reead
				+ ", wriite=" + wriite + "]";
	}

	
}
