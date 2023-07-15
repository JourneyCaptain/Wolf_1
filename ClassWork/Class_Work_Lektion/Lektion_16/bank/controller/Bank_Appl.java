package Lektion_16.bank.controller;

import bank.model.Bank_Account;

public class Bank_Appl {
    public static void main(String[] args) {

        Bank_Account acc1 = new Bank_Account(1000L, "Dmitriy", "Volksbank", 101, 100);
        // acc1 - obiektanoe peremenaea, v cotoroi sobrani vse polea klassa i ih znacenia
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getOwner());
        acc1.display();
        acc1.deposit(500);
        acc1.display();
        acc1.withdraw(100);
        acc1.display();
        acc1.withdraw(1000);
        acc1.display();
        acc1.withdraw(200);
        acc1.display();

        Bank_Account acc2 = new Bank_Account( 1000L, "Dmitriy", "Volksbank", 101, 100);
        acc2.display();


    }



}
