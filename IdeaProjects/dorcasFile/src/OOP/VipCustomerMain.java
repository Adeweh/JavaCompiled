package OOP;

public class VipCustomerMain {
    public static void main(String[] args) {
        VipCustomer dee = new VipCustomer();
        System.out.println(dee.getCreditLimit());

        VipCustomer hae = new VipCustomer("babe", 25000.00);
        System.out.println(hae.getCreditLimit());

        VipCustomer yo = new VipCustomer("nice", 44000.00, "mybabe@gmail.com");
        System.out.println(yo.getCreditLimit());



    }
}
