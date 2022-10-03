package Basic_Java;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        double a,b,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number (A): ");
        a = input.nextDouble();
        System.out.print("Enter Second Number (B): ");
        b = input.nextDouble();
        sum = a+b;
        System.out.println("Sum of (A+B) = "+sum);
    }
}
