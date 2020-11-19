package com.vehicleloanapplication.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloanapplication.exceptions.RecordNotFoundException;
import com.vehicleloanapplication.model.LoanApplicationEntity;
import com.vehicleloanapplication.service.LoanApplicationServiceImpl;

@RestController
@RequestMapping("/api/vehicleloans")
public class LoanApplicationController {
@Autowired
private LoanApplicationServiceImpl loansAppService;

static Logger log = Logger.getLogger(LoanApplicationController.class.getName());
@GetMapping("/loanapplicationsByMail/{email}")
public ResponseEntity<List<LoanApplicationEntity>> showLoanApplicationByEmail(@Valid @PathVariable("email")String email) throws RecordNotFoundException{
	List<LoanApplicationEntity> loansApplied = loansAppService.showAllLoanApplicationByEmail(email);
	
	if(loansApplied.isEmpty())
	{
		
		return new ResponseEntity("Sorry! Loan not available!", 
				HttpStatus.NOT_FOUND);
		
	}
	//log.debug("Hello this is a debug message");  
    
	return new ResponseEntity<List<LoanApplicationEntity>>(loansApplied, HttpStatus.OK);
	
}

@GetMapping("/loanapplications/{chassisno}")
public ResponseEntity<LoanApplicationEntity> showLoanApplicationByChassis(@PathVariable("chassisno")String chassisNo){
	LoanApplicationEntity loansApplied = loansAppService.showLoanApplicationByChassis(chassisNo);
	if(loansApplied==null)
	{
		return new ResponseEntity("Sorry! Loan not available!", 
				HttpStatus.NOT_FOUND);
	}
	log.info("Show Loan Application by Chassis number");
	return new ResponseEntity<LoanApplicationEntity>(loansApplied, HttpStatus.OK);
	
}
@GetMapping("/Rejectedloanapplications/{email}")
public ResponseEntity<List<LoanApplicationEntity>> RejectedLoansByEmail(@PathVariable("email")String email){
	List<LoanApplicationEntity> loansApplied = loansAppService.showRejectedLoansByEmail(email);
	if(loansApplied.isEmpty())
	{
		return new ResponseEntity("Sorry! No Rejected Loans available!", 
				HttpStatus.NOT_FOUND);
	}
	
	return new ResponseEntity<List<LoanApplicationEntity>>(loansApplied, HttpStatus.OK);
	
}
@PostMapping("/loanapplications")
public ResponseEntity<List<LoanApplicationEntity>> applyLoan(
		@RequestBody LoanApplicationEntity loans){
	List<LoanApplicationEntity> loansApplied = loansAppService.applyLoan(loans);
	
	
	return new ResponseEntity<List<LoanApplicationEntity>>(loansApplied, HttpStatus.OK);
}


@GetMapping("/loanApplication/getPendingloans")
public ResponseEntity<List<LoanApplicationEntity>> getAllPendingLoans()
{              
    List<LoanApplicationEntity> loanApplications= loansAppService.getAllPendingLoans();
    if(loanApplications.isEmpty()) 
    {
        return new ResponseEntity("Sorry! There are no loans which are Pending!",
                HttpStatus.NOT_FOUND);
    }
   
    return new ResponseEntity<List<LoanApplicationEntity>>(loanApplications, HttpStatus.OK);
}

/* controller for checking rejected loans */
@GetMapping("/loanApplication/getRejectedloans")
public ResponseEntity<List<LoanApplicationEntity>> getAllRejectedLoans()
{
    List<LoanApplicationEntity> loanApplications= loansAppService.getAllRejectedLoans();
    if(loanApplications.isEmpty()) 
    {
        return new ResponseEntity("Sorry! There are no loans which are Rejected!",
                HttpStatus.NOT_FOUND);
    }
   
    return new ResponseEntity<List<LoanApplicationEntity>>(loanApplications, HttpStatus.OK);
}
/*controller for checking approved loans */

@GetMapping("/loanApplication/getApprovedloans")
public ResponseEntity<List<LoanApplicationEntity>> getAllApprovedLoans(){

	
    List<LoanApplicationEntity> loanApplications= loansAppService.getAllAcceptedLoans();
    if(loanApplications.isEmpty()) 
    {
        return new ResponseEntity("Sorry! There are no loans which are Approved!",
                HttpStatus.NOT_FOUND);
    }
   
    return new ResponseEntity<List<LoanApplicationEntity>>(loanApplications, HttpStatus.OK);
}
@PutMapping("/updatedLoans")
public ResponseEntity<List<LoanApplicationEntity>> updateLoanApplication(
		@RequestBody LoanApplicationEntity loanApp){
	List<LoanApplicationEntity> loans=loansAppService.modifyLoanApplicationStatus(loanApp);
	if(loans.isEmpty())
	{
		return new ResponseEntity("Sorry! no loan applications available!", 
				HttpStatus.NOT_FOUND);
	}
	
	return new ResponseEntity<List<LoanApplicationEntity>>(loans, HttpStatus.OK);
}
}


/*@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	
	@PutMapping("/products")
	public ResponseEntity<List<Product>> updateProduct(
			@RequestBody Product product){
		List<Product> products= productService.updateProduct(product);
		if(products.isEmpty())
		{
			return new ResponseEntity("Sorry! Products not available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	
	
	@PostMapping("/products")
	public ResponseEntity<List<Product>> insertProduct(
			@RequestBody Product product){
		List<Product> products= productService.saveProduct(product);
		if(products.isEmpty())
		{
			return new ResponseEntity("Sorry! Products not available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	*/