package com.exampleStock.StockQRApi.Service;

import com.exampleStock.StockQRApi.Entity.UserDetails;
import com.exampleStock.StockQRApi.Entity.Loans;
import com.exampleStock.StockQRApi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    @Autowired
    private Loans loanss;
    private UserDetailsService employerservice;
    private UserRepository employerrepository;
    private UserDetails userDetails;


    public String CreateLoan() {

        if (userDetails.getId_employer() == null) {
            throw new RuntimeException("userDetails is null");
        }
        //chamando o metodo findbyId do JPA
        employerrepository.findById(userDetails.getId_employer());


        //vo chamar um jwt aki pra o sistema autorizar a transacao


        return null;
    }


}
