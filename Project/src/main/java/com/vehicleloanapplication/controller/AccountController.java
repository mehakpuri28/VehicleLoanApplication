/*package com.vehicleloanapplication.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vehicleloanapplication.model.AccountEntity;
import com.vehicleloanapplication.service.AccountService;
import com.vehicleloanapplication.service.AccountServiceImpl;
 
@RestController
@RequestMapping("/api/v2")
public class AccountController
{
    @Autowired
    private AccountServiceImpl Service;
    
    @GetMapping(value="/hi")
    public String sayHello() {​​​​​​​
        System.out.println("heelo........");
        return "Hello Cg! from Spring Framework! thanku...";
    }​​​​​​​
    @GetMapping("/AccountEntity/{​​​​​​​email}​​​​​​​")
    public ResponseEntity<AccountEntity> findAccount(@PathVariable("email")String email){​​​​​​​
        AccountEntity accounts= Service.getAccountByEmail(email);
        if(accounts==null) {​​​​​​​
            return new ResponseEntity("Sorry! Accounts not found!", 
                    HttpStatus.NOT_FOUND);
        }​​​​​​​
        
        return new ResponseEntity<AccountEntity>(accounts, HttpStatus.OK);
    }​​​​​​​
 
    @PostMapping("/addAccount")
    public ResponseEntity<List<AccountEntity>> insertAccount( @RequestBody AccountEntity account){​​​​​​​
       List<AccountEntity> accounts=Service.AddAccount(account);
       if(accounts.isEmpty())
        {​​​​​​​
            return new ResponseEntity("Sorry! Accounts not available!",
                    HttpStatus.NOT_FOUND);
        }​​​​​​​
       
        return new ResponseEntity<List<AccountEntity>>(accounts, HttpStatus.OK);
    }​​​​​​​
    @PutMapping("/editAccount")
    public ResponseEntity<List<AccountEntity>> updateAccount(@RequestBody AccountEntity account){​​​​​​​
        List<AccountEntity> accounts= Service.UpdateAccount(account);
        if(accounts.isEmpty())
        {​​​​​​​
            return new ResponseEntity("Sorry! Users not available!",
                    HttpStatus.NOT_FOUND);
        }​​​​​​​
       
        return new ResponseEntity<List<AccountEntity>>(accounts, HttpStatus.OK);
    }​​​​​​​
    @DeleteMapping("/deleteAccount")
    public ResponseEntity<List<AccountEntity>> deleteAllAccounts(){​​​​​​​
        List<AccountEntity> accounts= Service.DeleteAccount(null);//DeleteAccount(AccountEntity email);
        if(accounts.isEmpty() || accounts==null) {​​​​​​​
            return new ResponseEntity("Sorry! Users not available!", 
                    HttpStatus.NOT_FOUND);
        }​​​​​​​
        
        return new ResponseEntity<List<AccountEntity>>(accounts, HttpStatus.OK);
    }​​​​​​​
 
}​​​​​​​
*/