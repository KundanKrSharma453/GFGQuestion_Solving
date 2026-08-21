package Easy02;

import java.util.Scanner;

public class MultiplicationTable02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        Multiplication_Table(number);
    }

    private static void Multiplication_Table(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X "+ i + " = "+ number * i);
        }
    }
}
