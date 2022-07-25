package entities.concretes;

import java.util.List;

public class Customer {
    private int id;
    private String customerNo;
    private Canal canal;

    public Customer() {
    }

    public Customer(int id, String customerNo, Canal canal) {
        this.id = id;
        this.customerNo = customerNo;
        this.canal = canal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }
}
