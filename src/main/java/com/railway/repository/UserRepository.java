package com.railway.repository;

import com.railway.entity.User;
import com.railway.enums.Exemption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
