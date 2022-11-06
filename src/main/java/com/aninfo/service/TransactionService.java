package com.aninfo.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aninfo.model.TransactionOperation;
import com.aninfo.repository.AccountRepository;
import com.aninfo.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
    
    @Autowired
    private AccountRepository accountRepository;

    public TransactionOperation createOperation(String name, Long cbu, Double sum) {
        return transactionRepository.save(new TransactionOperation(name, cbu,
                                     this.transactionRepository.count() + 1, sum));    
    }

    public Collection<TransactionOperation> getHistory() {
        return transactionRepository.findAll();
    }
    
    public Collection<TransactionOperation> getHistory(Long cbu) {
        return transactionRepository.findTransactionOperationByCbuAccount(cbu);
    }
    
}
