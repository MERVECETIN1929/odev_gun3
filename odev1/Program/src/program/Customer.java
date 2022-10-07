package program;

public class Customer {
    private int id;
    
    
    public Customer(){
        System.out.println("müşteri nesnesi başlatıldı");
    }

    public Customer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

  
}
