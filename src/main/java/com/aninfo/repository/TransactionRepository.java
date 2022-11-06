package com.aninfo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.aninfo.model.TransactionOperation;

@RepositoryRestResource
public interface TransactionRepository extends CrudRepository<TransactionOperation, Long>{
    
    List<TransactionOperation> findTransactionOperationByCbu(Long cbu);
    
    @Override
    List<TransactionOperation> findAll();

}
