package org.example.fasada;

public class BankAccount {
    public void deposit(){
        System.out.println(getClass().getSimpleName() + ": deposited");
    }
    public void payOut(){
        System.out.println(getClass().getSimpleName() + ": payed out");
    }
}
