package com.aninfo.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aninfo.model.TransactionOperation;
import com.aninfo.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
    
    public TransactionOperation createOperation(String name, Long cbu, Double sum) {
        return transactionRepository.save(new TransactionOperation(name, cbu, sum,
                                    (this.transactionRepository.count() + 1)));    
    }

    public Collection<TransactionOperation> getHistory() {
        return transactionRepository.findAll();
    }
    
    public Collection<TransactionOperation> getHistory(Long cbu) {
        return transactionRepository.findTransactionOperationByCbu(cbu);
    }

    public Optional<TransactionOperation> findById(Long id) {
        return transactionRepository.findById(id);
    }

    public void deleteById(Long id) {
        transactionRepository.deleteById(id);
    }
    
}
