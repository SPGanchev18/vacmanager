package com.banica.vacmanager.dao;

import com.banica.vacmanager.model.Team;
import com.banica.vacmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByNicknameAndPassword(String username, String password);
}