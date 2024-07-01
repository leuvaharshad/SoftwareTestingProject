package OOPS_Concept.Constructor;

public class BankAccount {

    String BankName;
    int Acnumber;
    String bankcode;
    String CustomerName;

    void hasFixedDeposit(){
        System.out.println("Bank Fixed Deposit");
    }
    void hasADeposit(){
        System.out.println("Bank Deposit");
    }
    void openBankAccount(){
        System.out.println("Bank Account  opening is compulsory for all customer to get the service");
    }
    // Default Constructor
    BankAccount(){
       openBankAccount();
    }
    // Parameterise constructors

    BankAccount (String CustomerName,String  BankName, int Acnumber){
        this.BankName= BankName;
        this.Acnumber=Acnumber;
        this.CustomerName=CustomerName;
        System.out.println(CustomerName+ " has a account int the '"+BankName+"' and his  account number is :"+Acnumber);

    }

    BankAccount (String BankName, int Acnumber){
        this.BankName=BankName;
        this.Acnumber=Acnumber;

        System.out.println( BankName + ":" + Acnumber );
    }

}
