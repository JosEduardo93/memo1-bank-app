package com.aninfo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aninfo.model.TransactionOperation;

@RepositoryRestResource
public interface TransactionRepository extends CrudRepository<TransactionOperation, Long>{
    
    @Query("Select e from TransactionOperation e")
    Collection<TransactionOperation> findTransactionOperationByCbuAccount(@Param("cbu") Long cbu);

    @Override
    List<TransactionOperation> findAll();

}
