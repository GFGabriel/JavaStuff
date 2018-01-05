package com.gflauta;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car holden = new Car();

	    porsche.setModel("911");

        System.out.println("Model is " + porsche.getModel());

        BankAccount georgesAccount = new BankAccount();
        georgesAccount.setBalance(4500.00);
        georgesAccount.setName("George");

        System.out.println(georgesAccount.getName() + " your account balance is: " + String.format("%.2f",georgesAccount.getBalance()) + ".");

        georgesAccount.deposit(5000.00);
        georgesAccount.withdraw(1234.50);
        georgesAccount.withdraw(12350.45);

        VipCustomer georgeVip = new VipCustomer("George", 10_000.00, "george@email.com");
        System.out.println("New VIP: " + georgeVip.getName() + " with a limit of " + String.format("%.2f", georgeVip.getLimit()) + ".");

    }
}
