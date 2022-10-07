package program;

public class CustomerManager {

    private Customer customer;
    private ICreditManager ıCreditManager;
    public CustomerManager(Customer customer,ICreditManager ıCreditManager) {
        this.customer = customer;
        this.ıCreditManager=ıCreditManager;
    }

    public void save() {
        System.out.println("Müşteri eklendi: ");
    }

    public void delete() {
        System.out.println("Müşteri silindi: ");
    }
    public void giveCredit(){
        ıCreditManager.calculate();
        System.out.println("Kredi verildi");
    }
}
