package entities.concretes;

import java.util.List;

public class Address {
    private int id;
    private Customer customer;
    private String addressDetail;

    public Address() {
    }

    public Address(int id, Customer customer, String addressDetail) {
        this.id = id;
        this.customer = customer;
        this.addressDetail = addressDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }
}
