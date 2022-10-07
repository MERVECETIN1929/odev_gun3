package program;

public class Program {

    public static void main(String[] args) {
        //---------------------------------------------- referenas tipleri anlamak
//                int sayi1 = 10;
//                int sayi2 = 20;
//                sayi1 = sayi2;
//                sayi2 = 100;
//                System.out.println(sayi1);
//
//                int[] sayilar1 = new int[]{1, 2, 3};
//                                         //0  1  2 index:D   
//                int[] sayilar2 = new int[]{4, 5, 6};
//                sayilar1 = sayilar2;
//                sayilar2[0] = 40;
//                System.out.println(sayilar1[1]);
        //------------------------------------------------- Classlar
//                CreditManager creditManager=new CreditManager();
//                System.out.println("heap referansı: "+creditManager);
//                creditManager.calculate();
//                creditManager.save();
//
//                Customer customer=new Customer();
//                customer.setId(1);
//                CustomerManager customerManager=new CustomerManager(customer);
//
//                Company company=new Company();
//                company.setTaxtNumber("265565");
//                company.setCompanyName("arçelik");
//                company.setId(1);
//                CustomerManager customerManager1=new CustomerManager(company);
//                CustomerManager customerManager2=new CustomerManager(new Person());
//                customerManager2.save();
//                customerManager.save();
//                customerManager.delete();
        //---------------------------------------------- interfaceler
        CustomerManager customerManager=new CustomerManager(new Company(),new TeacherCreditManager());
        customerManager.giveCredit();
        customerManager.save();
        TeacherCreditManager creditManager=new TeacherCreditManager();
        creditManager.save();
    }

}
