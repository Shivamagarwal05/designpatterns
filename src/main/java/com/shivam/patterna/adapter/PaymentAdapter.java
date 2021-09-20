package com.shivam.patterna.adapter;

public class PaymentAdapter {

    public void pay(int rupees) {
        int dollars = rupees / 75;
        PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
        paymentProcessor.pay(dollars);
    }
}
