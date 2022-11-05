package com.aninfo.model;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cbu;

    private Double balance;

    public Account(){
    }

    public Account(Double balance) {
        this.balance = balance;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Collection<TransactionOperation> getHistory() {
        return null;
    }

    public void setDeposit() {
    }

    public void setWithdraw() {
    }

}
