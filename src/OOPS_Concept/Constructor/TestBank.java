package OOPS_Concept.Constructor;

public class TestBank {
    public static void main(String[] args) {
        BankAccount ba= new BankAccount();

        System.out.println("----------Parameterise Constructor----------");
        BankAccount ba1= new BankAccount("Harshad","SBI",1003);

        System.out.println("--------second example of parameterise Coustructor-----");
        BankAccount ba2= new BankAccount("ICICI",20001);
        BankAccount ba3= new BankAccount("HDFC Bank", 30003);
    }
}
