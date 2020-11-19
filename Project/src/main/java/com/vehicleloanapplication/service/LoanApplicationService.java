package com.vehicleloanapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vehicleloanapplication.exceptions.RecordNotFoundException;
import com.vehicleloanapplication.model.LoanApplicationEntity;

@Service
public interface LoanApplicationService {

	public List<LoanApplicationEntity> showAllLoanApplicationByEmail( String email) throws RecordNotFoundException;	
	public List<LoanApplicationEntity> showRejectedLoansByEmail(String email);
	public List<LoanApplicationEntity> modifyLoanApplicationStatus(LoanApplicationEntity loanapp);
	public List<LoanApplicationEntity> applyLoan(LoanApplicationEntity loanapp);
	public LoanApplicationEntity showLoanApplicationByChassis(String chassisNo);
	public List<LoanApplicationEntity> showAllLoanApplications();
	public List<LoanApplicationEntity> getAllPendingLoans();
    public List<LoanApplicationEntity> getAllRejectedLoans();
    public List<LoanApplicationEntity> getAllAcceptedLoans();
	
}
