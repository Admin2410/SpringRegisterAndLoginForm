package com.slr.springboot.Model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class System_User {

	@Id
	@Generated(value = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(updatable = false, nullable = false)
	private String id;
	
	@Column(unique = true)
	private String userName;
	@Column(unique = true)
	private String emailId;
	
	private String userPwd;
	private String userRole;
	private String userStatus;
	
	
	public System_User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public System_User(String id, String userName, String emailId, String userPwd, String userRole, String userStatus) {
		super();
		this.id = id;
		this.userName = userName;
		this.emailId = emailId;
		this.userPwd = userPwd;
		this.userRole = userRole;
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "SystemUser [id=" + id + ", userName=" + userName + ", emailId=" + emailId + ", userPwd=" + userPwd
				+ ", userRole=" + userRole + ", userStatus=" + userStatus + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
	
}

