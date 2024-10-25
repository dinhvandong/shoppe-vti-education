package com.vti_education.shoppe_demo.services;

import com.vti_education.shoppe_demo.entities.Account;
import com.vti_education.shoppe_demo.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public Optional<Account> findById(Long id){
        return accountRepository.findById(id);
    }
    public Account insert(Account newAccount){
        return accountRepository.save(newAccount);
    }

    public Account update(Account modifiedAccount){

        Long id = modifiedAccount.getId();

        Optional<Account> accountOptional = findById(id);

        if(accountOptional.isEmpty()){
            return null;
        }

        return accountRepository.save(modifiedAccount);

    }

    public void delete(Long id){

        accountRepository.deleteById(id);
    }

    public List<Account> findAll()
    {
        return  accountRepository.findAll();
    }

}
