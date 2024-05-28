package com.example.demomvc.Repository;

import com.example.demomvc.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
