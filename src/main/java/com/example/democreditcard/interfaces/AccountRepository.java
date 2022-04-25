package com.example.democreditcard.interfaces;

import com.example.democreditcard.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
