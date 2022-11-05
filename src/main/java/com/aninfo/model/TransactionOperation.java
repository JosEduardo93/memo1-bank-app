package com.aninfo.model;

import javax.persistence.*;

public class TransactionOperation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numOperation;
    
    private String operationName;
    
    private double mountOperation;

    public TransactionOperation() {
    }

    public void setNameOperation(String name) {
        this.operationName = name;
    }

    public void setNumOperation(Long ope) {    
        this.numOperation = ope;
    }   

    public void setMount(double mount) {
        this.mountOperation = mount;
    }
    public String getNameOperation() {
        return this.operationName;
    }

    public Long getNumOperation(Long ope) {    
        return this.numOperation;
    }   

    public double setMount() {
        return this.mountOperation;
    }
}
