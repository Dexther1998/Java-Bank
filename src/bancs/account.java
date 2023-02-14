package bancs;

public class account {
//    Saldo
    private double balance ;
//    agencia
    private int agency;
//    Numero
    private int number;
//    Titular
    private customer headline=new customer();
    private static int total=0;
    public account(int agency){

        if (agency <= 0){
            System.out.println("No se permite 0");
            this.agency=1;
        }else {

            this.agency=agency;
        }
        total++;
        System.out.println("Se van creando: "+ total +" cuentas");
    }
//    Definimos el primer metodo, con void ya compila por que se va a ejecutar pero no se va a devolver ningun valor
//    No retorna valor
    void deposit(double worth){
        this.balance += worth;
    }
//    Retorna valor
    public boolean withdraw(double worth){
        if(this.balance >= worth){
            this.balance = this.balance-worth;
            return true;
        }else {
            return false;
        }
    }
    public boolean transfer(double worth, account account){
        if (this.balance>= worth){
            this.balance -= worth;
            account.deposit(worth);
            return true;
        }else {
            return false;
        }
    }
//    Obtener saldo
    public double getBalance(){
        return this.balance;
    }
    public void setAgency(int agency){
        if (agency>0){
            this.agency= agency ;
        }
    }

    public int getAgency() {
        return agency;
    }

    public void setHeadline(customer headline) {
        this.headline = headline;
    }

    public customer getHeadline() {
        return headline;
    }
}
