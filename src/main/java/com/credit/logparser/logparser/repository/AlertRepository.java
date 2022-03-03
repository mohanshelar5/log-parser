package com.credit.logparser.logparser.repository;

import com.credit.logparser.logparser.model.persistence.Alert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends CrudRepository<Alert, String> {
}
