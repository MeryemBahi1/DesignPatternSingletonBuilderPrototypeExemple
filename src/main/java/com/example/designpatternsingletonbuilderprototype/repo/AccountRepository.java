package com.example.designpatternsingletonbuilderprototype.repo;

import com.example.designpatternsingletonbuilderprototype.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface AccountRepository {
     void AddAccount(Long AccountId);
     List<BankAccount> findAll();
     List<BankAccount> searchAccounts(Predicate<BankAccount> predicate);
     //Optional  peut contenir soit un compte soit rien
    Optional<BankAccount> findById(Long id);
}
