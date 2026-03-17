package com.exampleStock.StockQRApi.Service;


import com.exampleStock.StockQRApi.Entity.Itens;
import com.exampleStock.StockQRApi.Repository.ItensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItensService {

    @Autowired
    Itens itens;
    ItensRepository repository;



}
