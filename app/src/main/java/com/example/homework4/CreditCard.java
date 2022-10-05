package com.example.homework4;

public class CreditCard {


    public static void main(String[] args) {
        CreditCard firsCreditCard = new CreditCard(1, 1000);
        CreditCard secondCreditCard = new CreditCard(1, 1000);
        CreditCard thirdCreditCard = new CreditCard(1, 1000);

    }

    private int accountNumber;
    private int currentAmount;


    public  CreditCard (int accountNumber, int currentAmount){
        this.accountNumber =accountNumber;
        this.currentAmount =currentAmount;

    }

    public void chargeAmountCreditCard(int currentAmount){

    }

    public void withdrawAmountCreditCard(){

    }

    public void currentAmountCreditCard(){


    }


}
