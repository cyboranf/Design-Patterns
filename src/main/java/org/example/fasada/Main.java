package org.example.fasada;

public class Main {
    public static void main(String[] args) {
        AtmApi api = new AtmApi();
        api.depositMoney();
        api.withdrawMoney();
        api.loanMoney();
        api.rechargePhone();
        api.transferSomeMoney();
    }
}
