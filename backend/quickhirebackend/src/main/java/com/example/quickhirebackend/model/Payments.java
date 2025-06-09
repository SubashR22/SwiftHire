package com.example.quickhirebackend.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "payments")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentid; 
    private Integer profid; 
    private Double amount; 
    private Date startdate; 
    private Date enddate; 
    private String status; 

    

    public int getPaymentId() {
        return paymentid;
    }

    // Typically, no setter for an auto-incremented field is provided
    // public void setPaymentId(int paymentId) {
    //     this.paymentId = paymentId;
    // }

    public Integer getProfId() {
        return profid;
    }

    public void setProfId(Integer profId) {
        this.profid = profId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getStartDate() {
        return startdate;
    }

    public void setStartDate(Date startDate) {
        this.startdate = startDate;
    }

    public Date getEndDate() {
        return enddate;
    }

    public void setEndDate(Date endDate) {
        this.enddate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    @Override
    public String toString() {
        return "Payments{" +
                "paymentId=" + paymentid +
                ", profId=" + profid +
                ", amount='" + amount + '\'' +
                ", startDate=" + startdate +
                ", endDate=" + enddate +
                ", status='" + status + '\'' +
                '}';
    }
}
