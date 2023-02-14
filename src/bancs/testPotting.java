package bancs;

public class testPotting {
    public static void main(String[] args) {
//        account account= new account();
        customer customer= new customer();
        customer.setName("David Costas");
        customer.setDocument("9115902");
//        account.setHeadline(customer);
//        customer customer1= account.getHeadline();
        System.out.println(customer);
//        System.out.println(account.getHeadline());
//        System.out.println(customer1);
    }
}
