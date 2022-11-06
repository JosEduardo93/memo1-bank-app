package com.aninfo.model;

import javax.persistence.*;

@Entity
@Table(name = "Transaction")
public class TransactionOperation {
    
    @Id
    @GeneratedValue
    private Long numOperation;
    
    private String operationName;
    
    private double mountOperation;
    
    @Column(name = "cbu")
    private Long cbu;

    public TransactionOperation(){
    }

    public TransactionOperation(String name, Long cbu, Long id, double mount) {
        this.operationName = name;
        this.cbu = cbu;
        this.numOperation = id;
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
    public String getNameOperation() {
        return this.operationName;
    }

    public Long getNumOperation(Long ope) {    
        return this.numOperation;
    }   

    public double getMount() {
        return this.mountOperation;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public Long getCbu() {
        return this.cbu;
    }
}
