package com.roth.serverside.repositories;

import com.roth.serverside.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//JpaRepository(mother class, id type)
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
