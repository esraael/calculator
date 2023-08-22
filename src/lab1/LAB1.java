package lab1;

import java.util.Scanner;

public class LAB1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter two number: ");
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();

        System.out.println("press 1 : for multiplay (*) ");
        System.out.println("press 2 : for division (/) ");
        System.out.println("press 3 : to get num1 % num2 ");
        System.out.println("press 4 : for addition (+) ");
        System.out.println("press 5 : for substraction (-) ");
        System.out.println("press 6 : to get max of these numbers ");
        System.out.println("press 7 : to get min of these numbers ");
        System.out.println("press 8 : to change sign of these numbers ");
        System.out.println("press 9 : to get factorial of one of these numbers ");

        int choose = s.nextInt();
        switch (choose) {
            case 1:
                System.out.println(num1 + " * " + num2 + " = " + Calculator.Mult(num1, num2));
                break;
            case 2:
                System.out.println(num1 + " / " + num2 + " = " + Calculator.div(num1, num2));
                break;
            case 3:
                System.out.println(num1 + " % " + num2 + " = " + Calculator.mod(num1, num2));
                break;
            case 4:
                System.out.println(num1 + " + " + num2 + " = " + Calculator.add(num1, num2));
                break;
            case 5:
                System.out.println(num1 + " - " + num2 + " = " + Calculator.sub(num1, num2));
                break;
            case 6:
                System.out.println("the max of these numbers is : " + Calculator.max(num1, num2));
                break;
            case 7:
                System.out.println("the min of these numbers is : " + Calculator.min(num1, num2));
                break;
            case 8:
                System.out.println("number 1 after changing sign is : " + Calculator.changesign(num1));
                break;
            case 9:
                System.out.println("the factorial of num1 is : " + Calculator.fact(num1));
                break;
            default:
                System.out.println("try again!");

        }

    }

}
