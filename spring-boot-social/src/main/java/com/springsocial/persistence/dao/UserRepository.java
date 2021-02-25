package com.springsocial.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsocial.persistence.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(final String username);

}
