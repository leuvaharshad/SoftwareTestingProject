import java.util.Scanner;

public class Calculater {

    public static void main(String[] args) {

        //Take a input from user, input1, input2 as int and ask the user what you want to do, enter char +,*,/ ,%, - , you will share the result by using the switch.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input 1");
        int input1 = sc.nextInt();
        System.out.println("Enter the input 2");
        int input2 = sc.nextInt();

        System.out.println("please enter the operation from +,-,*,%");

        int operation = sc.next().charAt(0);

        switch (operation) {

            case '+':
                System.out.println(input1 + input2);
                break;

            case '-':
                System.out.println(input1 - input2);
                break;


            case '*':
                System.out.println(input1 * input2);
                break;

            case '%':
                if (input2 == 0) {
                    System.out.println("division by 0 is not allowed");
                } else {
                    System.out.println(input1 % input2);
                    break;


                }


        }
    }
}

