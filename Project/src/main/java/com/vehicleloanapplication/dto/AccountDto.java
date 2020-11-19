package com.vehicleloanapplication.dto;


import com.vehicleloanapplication.model.UserDetailsEntity;

public class AccountDto {
	
	
	AccountDto(){}
	public AccountDto(int accountNo, UserDetailsEntity user) {
		super();
		this.accountNo = accountNo;
		this.user = user;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public UserDetailsEntity getUser() {
		return user;
	}
	public void setUser(UserDetailsEntity user) {
		this.user = user;
	}
	
	private int accountNo;	
	
	private UserDetailsEntity user;

}
