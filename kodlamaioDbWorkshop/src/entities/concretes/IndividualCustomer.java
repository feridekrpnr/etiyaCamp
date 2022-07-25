package entities.concretes;

import java.util.List;

public class IndividualCustomer extends Customer {

    private String firstName;
    private String lastName;
    private String nationalityId;

    public IndividualCustomer() {
    }

    public IndividualCustomer(int id, String customerNo, Canal canal, String firstName, String lastName, String nationalityId) {
        super(id, customerNo, canal);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
