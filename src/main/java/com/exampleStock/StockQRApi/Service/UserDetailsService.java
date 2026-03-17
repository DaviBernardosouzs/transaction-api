package com.exampleStock.StockQRApi.Service;

import com.exampleStock.StockQRApi.Entity.UserDetails;
import com.exampleStock.StockQRApi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserDetailsService {

    @Autowired
    UserRepository userRepository;
    UserDetails userDetails;


    public UserRepository createEmployer(UserDetails userDetails) {
        if (userDetails.getName() == null || userDetails.getName().trim().isEmpty()) {
            throw new RuntimeException("User name is empty");
        }
        if (userDetails.getCpf() == null || userDetails.getCpf().trim().isEmpty()) {
            throw new RuntimeException("User CPF is empty");
        }
        if (userDetails.getEmail() == null || userDetails.getEmail().trim().isEmpty()) {
            throw new RuntimeException("User email is empty");
        }

        if (userDetails.getId_employer() == null) {
            userDetails.setId_employer(UUID.randomUUID());
        } else {
            throw new RuntimeException("UserDetails already exists");
        }

        return (UserRepository) userRepository.save(userDetails);
    }
}
