package com.example.homework4;

public class CreditCard {


    public static void main(String[] args) {
        CreditCard firsCreditCard = new CreditCard(1, 1000);
        CreditCard secondCreditCard = new CreditCard(2, 500);
        CreditCard thirdCreditCard = new CreditCard(3, 560);

        firsCreditCard.chargeAmountCreditCard(144);
        secondCreditCard.chargeAmountCreditCard(450);
        thirdCreditCard.withdrawAmountCreditCard(60);

        firsCreditCard.currentAmountCreditCard();
        secondCreditCard.currentAmountCreditCard();
        thirdCreditCard.currentAmountCreditCard();
    }

    private int accountNumber;
    private int currentAmount;


    public  CreditCard (int accountNumber, int currentAmount){
        this.accountNumber =accountNumber;
        this.currentAmount =currentAmount;

    }

    public void chargeAmountCreditCard(int addMoney){
        currentAmount = currentAmount + addMoney;
    }


    public void withdrawAmountCreditCard (int sendMoney){
        currentAmount = currentAmount - sendMoney;
    }

    public void currentAmountCreditCard(){
        System.out.println("Номер карточки  " + accountNumber + "\n" + "Сумма " + currentAmount + "\n");

    }

}
