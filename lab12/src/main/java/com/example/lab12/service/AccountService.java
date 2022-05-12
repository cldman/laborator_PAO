package com.example.lab12.service;

import com.example.lab12.model.Account;
import com.example.lab12.model.AccountType;
import com.example.lab12.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.nonNull;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountService {
    //instance is autowired using @Autowired is redundant
    private final AccountRepository repository;

   public Account getAccountById(long id) {
       log.info("retrieving account for id: {}", id);
       return repository.getById(id);
   }

   public List<Account> getAllAccounts() {
       log.info("retrieving all accounts");
       return repository.findAll();
   }

   public Account saveAccount(Account account) {
       return repository.save(account);
   }

   public Account updateAccount(Long id, Account newAccount) throws Exception{
       Account accFromDb = repository.getById(id);
       if(nonNull(accFromDb)) {
           accFromDb.setAccountNumber(newAccount.getAccountNumber());
           accFromDb.setBalance(newAccount.getBalance());
           accFromDb.setCardNumber(newAccount.getCardNumber());

           return repository.save(accFromDb);
       } else {
           throw new Exception(String.format("No account was found for given id: %s", id.toString()));
       }
   }

   public void deleteById(Long id) {
       repository.deleteById(id);
   }

   public long getTotalNumberOfAccountByStudentId(Long studentId){
       return repository.countAccountByStudentId(studentId);
   }

}
