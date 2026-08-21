package Basic01;

import java.util.Scanner;

public class Odd_or_Even03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();

        boolean flag = OddEven(number);
        System.out.println(flag);
    }

    private static boolean OddEven(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }
}
