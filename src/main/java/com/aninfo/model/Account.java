package com.aninfo.model;

import java.util.Vector;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cbu;

    private Double balance;

    private Vector<TransactionOperation> history;

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

    public void setOperation(String name, double mount) {
        this.history.add(new TransactionOperation(name, this.history.size() + 1, mount));
    }

    public void deleteOperation(int numOperation) {
        this.history.remove(numOperation - 1);
    }

    public TransactionOperation getOperation(int numOperation) {
        return this.history.elementAt(numOperation - 1);
    }

}
