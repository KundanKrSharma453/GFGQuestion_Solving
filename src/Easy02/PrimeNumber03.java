package Easy02;

import java.util.Scanner;

public class PrimeNumber03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

       boolean flag =  PrimeNumber(number);
        System.out.println(flag);

    }

    private static boolean PrimeNumber(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
