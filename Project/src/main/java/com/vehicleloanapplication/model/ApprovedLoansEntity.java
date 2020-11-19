package com.vehicleloanapplication.model;

import java.time.LocalDate;
import javax.persistence.*;
@Entity
@Table(name="APPROVED_LOANS")
public class ApprovedLoansEntity  {
	public ApprovedLoansEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="approved_loan_id")
	private int loanId;
	@Column(name="emi_amount")
	private double emi;
	@Column(name="emi_starting_date")
	private LocalDate emidate;
	@ManyToOne(cascade={CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
	@JoinColumn(name="accountNo")
	private AccountEntity account;
	@OneToOne(cascade={CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
	@JoinColumn(name="chassis_no")
	private LoanApplicationEntity loanapp;
	public ApprovedLoansEntity(int loanId, double emi, LocalDate emidate, AccountEntity account, LoanApplicationEntity loanapp) {
		super();
		this.loanId = loanId;
		this.emi = emi;
		this.emidate = emidate;
		this.account = account;
		this.loanapp = loanapp;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public LocalDate getEmidate() {
		return emidate;
	}
	public void setEmidate(LocalDate emidate) {
		this.emidate = emidate;
	}
	public AccountEntity getAccount() {
		return account;
	}
	public void setAccount(AccountEntity account) {
		this.account = account;
	}
	public LoanApplicationEntity getLoanapp() {
		return loanapp;
	}
	public void setLoanapp(LoanApplicationEntity loanapp) {
		this.loanapp = loanapp;
	}
	
	
}
