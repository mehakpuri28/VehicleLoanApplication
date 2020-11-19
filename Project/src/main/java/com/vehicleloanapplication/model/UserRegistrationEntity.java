package com.vehicleloanapplication.model;

import javax.persistence.*;

@Entity

@Table(name="USER_REGISTRATION")
//@NamedQuery(name="UserBasic.findAll",query="SELECT u FROM UserBasic u")
public class UserRegistrationEntity {
    public UserRegistrationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
    @Column(name="user_email", length=20)
    private String email;
 	public UserRegistrationEntity(String email, String name, String gender, String mobile, int age, String password,
		UserDetailsEntity userdetails) {
	super();
	this.email = email;
	this.name = name;
	this.gender = gender;
	this.mobile = mobile;
	this.age = age;
	this.password = password;
	this.userdetails = userdetails;
}
 	@Column(name="user_name", length=20)
	private String name;
 	@Column(name="user_gender", length=20)
	private String gender;
 	@Column(name="user_mobile", length=20)
	private String mobile;
 	@Column(name="user_age")
    private int age;
 	@Column(name="user_password", length=20)
	private String password;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_Id")
	private UserDetailsEntity userdetails;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDetailsEntity getUserdetails() {
		return userdetails;
	}
	public void setUserdetails(UserDetailsEntity userdetails) {
		this.userdetails = userdetails;
	}
	
	
    
}
