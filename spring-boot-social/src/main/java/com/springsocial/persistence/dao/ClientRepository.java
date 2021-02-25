package com.springsocial.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springsocial.persistence.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Query("select client_id from client")
    String findClientId();
   
    @Query("select client_secret from client")
    String findClientSecret();
    
}
