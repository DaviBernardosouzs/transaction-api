package com.exampleStock.StockQRApi.Repository;

import com.exampleStock.StockQRApi.Entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, UUID> {



}
