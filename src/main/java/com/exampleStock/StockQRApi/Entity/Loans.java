package com.exampleStock.StockQRApi.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
//cre
@Table(name = "loans")

public class Loans {

    @Id
    private long id_loan;
    private Date date_loan;


    public long getId_loan() {
        return id_loan;
    }

    public void setId_loan(long id_loan) {
        this.id_loan = id_loan;
    }

    public Date getDate_loan() {
        return date_loan;
    }

    public void setDate_loan(Date date_loan) {
        this.date_loan = date_loan;
    }
}
