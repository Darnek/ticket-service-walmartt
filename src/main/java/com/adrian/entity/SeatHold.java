package com.adrian.entity;

import java.sql.Timestamp;
import java.util.List;

public class SeatHold {

    private int id;
    private int customerId;
    private Timestamp holdTime;
    private String customerEmail;
    private List<Integer> seatsHolded;

    public SeatHold(){}

    public SeatHold(int id, String email, List<Integer> seatsHolded){
        this.id=id;
        this.customerEmail = email;
        this.seatsHolded = seatsHolded;
        this.holdTime = new Timestamp(System.currentTimeMillis());
    }


    public List<Integer> getSeatsHolded() {
        return seatsHolded;
    }

    public void setSeatsHolded(List<Integer> seatsHolded) {
        this.seatsHolded = seatsHolded;
    }


    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Timestamp getHoldTime() {
        return holdTime;
    }

    public void setHoldTime(Timestamp holdTime) {
        this.holdTime = holdTime;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setId(int id) {
        this.id = id;
    }
}