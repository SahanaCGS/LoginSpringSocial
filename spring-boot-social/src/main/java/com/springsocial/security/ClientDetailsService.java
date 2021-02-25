package com.springsocial.security;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsocial.persistence.dao.ClientRepository;
import com.springsocial.persistence.dao.UserRepository;
import com.springsocial.persistence.model.User;

@Service
public class ClientDetailsService {

    @Autowired
    private ClientRepository clientRepository;

	public ClientDetailsService() {
		super();
	}
    
    public String findId() {
        final String client = clientRepository.findClientId();
        if (client == null) {
            System.out.println("no client present");
        }
        return client;
    }
    
    public String findSecret() {
        final String client = clientRepository.findClientSecret();
        if (client == null) {
            System.out.println("no client secret present");
        }
        return client;
    }
    
}
