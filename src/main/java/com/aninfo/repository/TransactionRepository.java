package com.aninfo.repository;

import com.aninfo.model.TransactionOperation;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransactionRepository extends CrudRepository<TransactionOperation, Long> {

    TransactionOperation findTransactionOperationById(Long Id);

    @Override
    List<TransactionOperation> findAll();
}
