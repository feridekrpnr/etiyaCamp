package entities.concretes;

public class CorparateCustomer extends Customer{

     private String taxNumber;
     private String title;

     public CorparateCustomer() {
     }

     public CorparateCustomer(int id, String customerNo, Canal canal, String taxNumber, String title) {
          super(id, customerNo, canal);
          this.taxNumber = taxNumber;
          this.title = title;
     }

     public String getTaxNumber() {
          return taxNumber;
     }

     public void setTaxNumber(String taxNumber) {
          this.taxNumber = taxNumber;
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }
}
