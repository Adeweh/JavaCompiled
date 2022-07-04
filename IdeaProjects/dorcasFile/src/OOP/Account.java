package OOP;

public class Account {
    public static void main(String[] args) {
        BankAccount dee = new BankAccount(); //(1234, 0.00, "Dee", "myemail@dee.com",5467);

        BankAccount adeh = new BankAccount("Babe", "myemail@babe.com", 14789);
        System.out.println(adeh.getAccountNumber());

        System.out.println(dee.getName());
        System.out.println(dee.getEmail());

        dee.withdrawFunds(100.00);

        dee.depositFunds(50.00);
        dee.withdrawFunds(100.00);

        dee.depositFunds(51.00);
        dee.withdrawFunds(100.00);


    }
}
