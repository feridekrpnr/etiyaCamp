package entities.concretes;

import java.time.LocalDate;


public class CommercialActivity extends IndividualCustomer{
    private int id;
    private IndividualCustomer individualCustomer;
    private LocalDate startedDate;

    public CommercialActivity() {
    }

    public CommercialActivity(int id, String customerNo, Canal canal, String firstName, String lastName, String nationalityId, int id1, IndividualCustomer individualCustomer, LocalDate startedDate) {
        super(id, customerNo, canal, firstName, lastName, nationalityId);
        this.id = id1;
        this.individualCustomer = individualCustomer;
        this.startedDate = startedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IndividualCustomer getIndividualCustomer() {
        return individualCustomer;
    }

    public void setIndividualCustomer(IndividualCustomer individualCustomer) {
        this.individualCustomer = individualCustomer;
    }

    public LocalDate getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(LocalDate startedDate) {
        this.startedDate = startedDate;
    }
}
