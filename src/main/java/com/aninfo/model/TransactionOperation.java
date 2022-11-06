package com.aninfo.model;

import javax.persistence.*;

@Entity
public class TransactionOperation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numOperation;
    
    private String operationName;
    
    private double mountOperation;
    
    private Long cbu;

    public TransactionOperation(){
    }

    public TransactionOperation(String name, Long cbu, double mount, Long id) {
        this.operationName = name;
        this.numOperation = id;
        this.cbu = cbu;
        this.mountOperation = mount;
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
  
    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }
  
    public String getNameOperation() {
        return this.operationName;
    }

    public Long getNumOperation() {    
        return this.numOperation;
    }   
    
    public double getMount() {
        return this.mountOperation;
    }

    public Long getCbu() {
        return this.cbu;
    }
}
