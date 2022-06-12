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
@Table(name ="admins")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Admin {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long adminID;
	private String adminName;
	private String adminPassword;
	private int privilegeID;
	
	
	public Admin() {
		super();

	}
	
	public Admin(String adminName, String adminPassword, int privilegeID) {
		super();
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.privilegeID = privilegeID;
	}


	public long getAdminID() {
		return adminID;
	}
	public void setAdminID(long adminID) {
		this.adminID = adminID;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public int getPrivilegeID() {
		return privilegeID;
	}
	public void setPrivilegeID(int privilegeID) {
		this.privilegeID = privilegeID;
	}


	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", privilegeID=" + privilegeID + "]";
	}

	
	
}
