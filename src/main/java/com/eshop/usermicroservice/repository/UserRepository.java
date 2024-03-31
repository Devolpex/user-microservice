package com.eshop.usermicroservice.repository;

import com.eshop.usermicroservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByEmail(String email);
    boolean esistsByPhone(String phone);
}
