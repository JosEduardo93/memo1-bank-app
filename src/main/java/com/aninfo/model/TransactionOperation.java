package com.aninfo.model;

public class TransactionOperation {
    
    private String operationName;

    private Long numOperation;
    
    private double mountOperation;

    public TransactionOperation(String name, Long ope, double mount) {
        this.operationName = name;
        this.numOperation = ope;
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

    public double setMount() {
        return this.mountOperation;
    }

}
