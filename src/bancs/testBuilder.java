package bancs;

public class testBuilder {
    public static void main(String[] args) {
        account account= new account(33);
        account account1=new account(23);
        account account2=new account(13);
        account.setAgency(0);
        System.out.println(account.getAgency());
    }
}
