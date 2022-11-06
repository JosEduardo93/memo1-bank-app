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

    public Optional<TransactionOperation> findTransactionOperation(Long id, Long cbu) {
        Collection<TransactionOperation> transactionOperations = this.getHistory(cbu);
        Optional<TransactionOperation> tOptional = null;
        for (TransactionOperation transactionOperation : transactionOperations) {
            if (transactionOperation.getNumOperation() == id) {
                tOptional = Optional.of(transactionOperation);
            }
        }
        return tOptional;
    }
    
}
