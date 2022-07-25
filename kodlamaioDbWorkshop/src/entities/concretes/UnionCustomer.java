package entities.concretes;

public class UnionCustomer extends Customer{
    private String name;

    public UnionCustomer() {
    }

    public UnionCustomer(int id, String customerNo, Canal canal, String name) {
        super(id, customerNo, canal);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
