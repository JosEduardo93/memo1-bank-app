package com.aninfo.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aninfo.repository.TransactionRepository;
import com.aninfo.model.TransactionOperation;

@Service
public class TransactionService {
 
    @Autowired 
    private TransactionRepository transactionRepository;

    public Collection<TransactionOperation> getHistory() {
        return transactionRepository.findAll();
    }

}
