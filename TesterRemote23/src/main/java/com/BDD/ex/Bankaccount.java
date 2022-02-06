package com.BDD.ex;

public class Bankaccount {
    private int accountBalance;

    public Bankaccount(int accountBalance) {
        this.accountBalance = accountBalance; // intializam contul cu suma de bani accountBalance
    }
    public boolean withdraw(int amount) {
        if (amount > accountBalance) { // se verifica daca suma ce se doreste a fi extrasa este mai mare decat suma din cont
            return false; // operatia de extragere nu s-a rea;izat deoarece se doreste extragerea unei sume mai mari decat ce exista in cont
        }
        accountBalance -= amount; // accountBalance = AccountBlance -amount
        return true;
    }   public void transfer(int amount) {
        accountBalance += amount; // accountBalance = AccountBlance + amount
        // se adauga o suma de bani in cont
    }

      public int getAccountBalance() {
        return accountBalance;
    }
}

