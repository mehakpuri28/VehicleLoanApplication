/*package com.vehicleloanapplication.service;







import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.vehicleloanapplication.dao.AccountJPARepository;
 
import com.vehicleloanapplication.model.AccountEntity;
import com.vehicleloanapplication.model.UserDetailsEntity;
@Service
public class AccountServiceImpl implements AccountService
{
    @Autowired
    private AccountJPARepository AccountDao;
    @Override
    public AccountEntity getAccountByEmail(String email) 
    {
        AccountEntity account=AccountDao.getByEmail(email);
        return account;
    }​​​​​​​
    @Override
    public List<AccountEntity> AddAccount(AccountEntity account) {​​​​​​​
    //    account.setloanId(0);
        AccountDao.saveAndFlush(account);
        return  AccountDao.findAll();
    }​​​​​​​
 
    @Override
    public List<AccountEntity> UpdateAccount(AccountEntity account) {​​​​​​​
        AccountDao.save(account);
        return  AccountDao.findAll();
    }​​​​​​​
 
    @Override
    public List<AccountEntity> DeleteAccount(AccountEntity account) {​​​​​​​
        AccountDao.deleteAll();
        return  AccountDao.findAll();
    }​​​​​​​
 
}​​​​​​​
 */