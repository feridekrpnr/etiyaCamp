package entities.concretes;

import java.time.LocalDate;

public class FinancialStatement {
    private int id;
    private LocalDate date;
    private Customer customer;
    private double amount;

    public FinancialStatement() {
    }

    public FinancialStatement(int id, LocalDate date, Customer customer, double amount) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
