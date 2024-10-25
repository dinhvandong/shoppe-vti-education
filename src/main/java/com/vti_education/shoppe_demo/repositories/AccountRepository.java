package com.vti_education.shoppe_demo.repositories;

import com.vti_education.shoppe_demo.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository
        extends JpaRepository<Account, Long>
{



}
