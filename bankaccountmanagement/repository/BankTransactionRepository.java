/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.ensi.ilsi.bankaccountmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.ensi.ilsi.bankaccountmanagement.domain.BankTransaction;

/**
 *
 * @author GROUP_2
 */
public interface BankTransactionRepository extends JpaRepository<BankTransaction, Long>{
    
}
