package com.noon.librarymanagementsystem.repository;

import com.noon.librarymanagementsystem.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Yusuf Sargin on 28/03/2022 - 22:52
 */
public interface AccountRepository extends JpaRepository<Account,Long> {
}
