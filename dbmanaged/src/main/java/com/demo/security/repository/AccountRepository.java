package com.demo.security.repository;

import com.demo.security.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByIdAndUsername(Long id, String username);

    Optional<Account> findByUsername(String username);

 }