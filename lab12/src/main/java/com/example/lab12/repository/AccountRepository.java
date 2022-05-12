package com.example.lab12.repository;

import com.example.lab12.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository  extends JpaRepository<Account, Long> {

    long countAccountByStudentId(Long id);
}
