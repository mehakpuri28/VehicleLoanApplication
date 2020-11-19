package com.vehicleloanapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.vehicleloanapplication.dao.LoanApplicationJPARepository;
import com.vehicleloanapplication.dao.UserDetailsJPARepository;
import com.vehicleloanapplication.dao.UserRegisterJPARepository;
import com.vehicleloanapplication.dto.LoanApplicationDto;
import com.vehicleloanapplication.exceptions.RecordNotFoundException;
import com.vehicleloanapplication.model.LoanApplicationEntity;
import com.vehicleloanapplication.model.UserDetailsEntity;
@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {
    
	@Autowired
	private LoanApplicationJPARepository loansRepo;
	private UserRegisterJPARepository userRegisterRepo;
	
	public List<LoanApplicationEntity> showAllLoanApplicationByEmail(String email) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		List<LoanApplicationEntity> loansApp=loansRepo.showAllLoanApplicationByEmail(email);
		
		if(loansApp.isEmpty())
			throw new RecordNotFoundException("No loan with this email");
		return loansApp;
	}

	@Override
	public List<LoanApplicationEntity> showRejectedLoansByEmail(String email) {
		List<LoanApplicationEntity> loansApp=loansRepo.showAllRejectedLoansByEmail(email);
		return loansApp;
	}

	@Override
	public List<LoanApplicationEntity> modifyLoanApplicationStatus(LoanApplicationEntity loanApp) {
		boolean flag=false;
		if(loansRepo.findById(loanApp.getChassisNo()) != null) {
			loansRepo.save(loanApp);
		    flag=true;
		}	
		if(flag)
			return loansRepo.findAll() ;
		else
			return null;
		//return null;
	}
	public List<LoanApplicationEntity> getAllPendingLoans(){  
	        return loansRepo.showAllPendingLoans();}
	 
	    @Override
	    public List<LoanApplicationEntity> getAllRejectedLoans(){
	        return loansRepo.showAllRejectedLoans();}
	
	 
	    @Override  
	    public List<LoanApplicationEntity> getAllAcceptedLoans(){
	    
	        return loansRepo.showAllAcceptedLoans();}

	@Override
	public List<LoanApplicationEntity> applyLoan(LoanApplicationEntity loanApp) {
		// TODO Auto-generated method stub
		/*List<LoanApplicationDto> loansDtoList=null;
		LoanApplicationDto loanDto=null;
		loanDto.setAmount(loanApp.getAmount());
		loanDto.setAppdate(loanApp.getAppdate());
		loanDto.setBrand(loanApp.getBrand());
		loanDto.setChassisNo(loanApp.getChassisNo());
		loanDto.setColour(loanApp.getColour());
		loanDto.setExistingEMI(loanApp.getExistingEMI());
		loanDto.setExShowPrice(loanApp.getExShowPrice());
		loanDto.setInterest(loanApp.getInterest());
		loanDto.setModel(loanApp.getModel());
		loanDto.setOnRoadPrice(loanApp.getOnRoadPrice());
		loanDto.setTenure(loanApp.getTenure());
		loanDto.setStatus(loanApp.getStatus());
		loanDto.setType(loanApp.getType());*/
		//UserDetailsEntity userDetails=new UserDetailsEntity("RubyElite","Chennai","Tamil Nadu","600073","Regular",500000.0,"3248972492","VJHHGFJ5467A","yes","ayz.url");
		
		//loanApp.setUser(userDetails);
	   // loanApp.setChassisNo(loanApp.getChassisNo());
		loansRepo.saveAndFlush(loanApp);
		return loansRepo.findAll();
	}

	@Override
	public LoanApplicationEntity showLoanApplicationByChassis(String chassisNo) {
		// TODO Auto-generated method stub
		return loansRepo.findById(chassisNo).get();
	}

	

	@Override
	public List<LoanApplicationEntity> showAllLoanApplications() {
		// TODO Auto-generated method stub
		return loansRepo.findAll();
		
		
	}

}
