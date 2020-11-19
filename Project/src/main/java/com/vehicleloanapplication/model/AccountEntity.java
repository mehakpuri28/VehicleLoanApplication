package com.vehicleloanapplication.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNTS")
public class AccountEntity {
	AccountEntity(){}
	public AccountEntity(int accountNo, UserDetailsEntity user) {
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
	/*public Set<ApprovedLoansEntity> getLoans() {
		return loans;
	}
	public void setLoans(Set<ApprovedLoansEntity> loans) {
		this.loans = loans;
	}*/
	@Id
	@Column(name="account_no")
	private int accountNo;	
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private UserDetailsEntity user;
	/*@OneToMany(mappedBy="account")
	private Set<ApprovedLoansEntity> loans;*/

	
}
