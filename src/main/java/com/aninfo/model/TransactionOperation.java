package com.aninfo.model;

public class TransactionOperation {
    
    private String operationName;

    private int numOperation;
    
    private double mountOperation;

    public TransactionOperation(String name, int ope, double mount) {
        this.operationName = name;
        this.numOperation = ope;
        this.mountOperation = mount;
    }


}
