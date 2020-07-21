package com.archana.demospringboot16thdec.repository;

import com.archana.demospringboot16thdec.model.BalanceSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceSheetRepo extends JpaRepository<BalanceSheet,Integer> {
}
