package lab1;

public class Calculator {

    public Calculator() {

    }

    public static double Mult(double num1, double num2) {
        return (num1 * num2);
    }

    public static double div(double num1, double num2) {
        return (num1 / num2);
    }

    public static double mod(double num1, double num2) {
        return (num1 % num2);
    }

    public static double add(double num1, double num2) {
        return (num1 + num2);
    }

    public static double sub(double num1, double num2) {
        return (num1 - num2);
    }

    public static double max(double num1, double num2) {
        double max = num1;
        if (num2 > num1) {
            max = num2;
        }
        return max;
    }

    public static double min(double num1, double num2) {
        double min = num1;
        if (num2 < num1) {
            min = num2;
        }
        return min;
    }

    public static double fact(double num1) {
        int fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact *= i;

        }
        return fact;
    }

    public static double changesign(double num1) {
        return (num1 * -1);
    }

}
