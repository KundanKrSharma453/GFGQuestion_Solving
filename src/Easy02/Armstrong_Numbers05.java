package Easy02;

import java.util.Scanner;

public class Armstrong_Numbers05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        boolean check = ArmstrongNumbers(number);
        if (check)
            System.out.println("Is Armstrong Number: "+number);
        else
            System.out.println("No this not Armstrong Number: " +number);
    }

    private static boolean ArmstrongNumbers(int number) {

        String str = String.valueOf(number);
        int count = str.length();

        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, count);
            temp /= 10;
        }
        return sum == number;
    }
}
