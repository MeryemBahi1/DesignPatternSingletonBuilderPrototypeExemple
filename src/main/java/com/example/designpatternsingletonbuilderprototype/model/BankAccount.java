package com.example.designpatternsingletonbuilderprototype.model;

import com.example.designpatternsingletonbuilderprototype.enums.AccountStatus;
import com.example.designpatternsingletonbuilderprototype.enums.AccountType;

public class BankAccount {
    private Long accountId;
    private Long balance;
    private String currency;
    private AccountType type;
    private AccountStatus status;

    public Long getAccountId() {
        return accountId;
    }

    public Long getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountType getType() {
        return type;
    }

    public BankAccount() {
    }

    public BankAccount(Long accountId, Long balance, String currency, AccountType type, AccountStatus status) {
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
        this.type = type;
        this.status = status;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public AccountStatus getStatus() {
        return status;
    }
}
