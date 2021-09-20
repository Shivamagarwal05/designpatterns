package com.shivam.patterna.adapter;

public class PaymentProcessorImpl implements PaymentProcessor {
    @Override
    public void pay(int dollars) {
        System.out.println("Amount in Dollars is : " + dollars);
    }
}
