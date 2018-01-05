package com.gflauta;

public class BankAccount {
    private int number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(int number, double balance, String name, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount() {
        this(00000, 0.00, "Unknown", "default@email.com", "(555) 867 - 5309");
        System.out.println("Default account created");
        System.out.println(this);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPnoneNumber(String pnoneNumber) {
        this.phoneNumber = pnoneNumber;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPnoneNumber() {
        return phoneNumber;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Deposited: " + String.format("%.2f",deposit) + ". Your current balance is: " + String.format("%.2f", this.balance) + ".");
    }

    public void withdraw(double withdrawal) {
        if (this.balance < withdrawal) {
            System.out.println("Not enough funds. Your current balance is: " + String.format("%.2f", this.balance) + ".");
        } else {
            this.balance -= withdrawal;
            System.out.println("You withdraw: " + String.format("%.2f",withdrawal) + ". Your remaining balance is: " + String.format("%.2f", this.balance) + ".");
        }
    }
}
