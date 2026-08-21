package Basic01;

import java.util.Scanner;

public class Factorial07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int fact = Factorial(number);
        System.out.println("Factorial of "+ number + " is: "+fact);
    }

    private static int Factorial(int number) {
        int fac = 1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
        }
        return fac;
    }
}
