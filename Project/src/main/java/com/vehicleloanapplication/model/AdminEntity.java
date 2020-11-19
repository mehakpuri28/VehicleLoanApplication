package com.vehicleloanapplication.model;

import javax.persistence.*;


@Entity
@Table (name="ADMIN_REGISTRATION")
public class AdminEntity  {
	public AdminEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminEntity(String email, String name, String password) {
		super();
		
		this.email = email;
		this.name = name;
		this.password = password;
	}
	@Id
	@Column(name="admin_email", length=20)
	private String email;
	@Column(name="admin_name",length=20)
	private String name;
	@Column(name="admin_password",length=20)
	private String password;
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
		public String getPassword() {
		return password;
	}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	
	
	

}
