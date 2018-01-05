package com.gflauta;

public class VipCustomer {
    private String name;
    private double limit;
    private String email;

    public VipCustomer() {
        this("John Doe", 1000.00, "j.doe@email.com");
    }

    public VipCustomer(String name, String email) {
        this(name, 1000.00, email);
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
