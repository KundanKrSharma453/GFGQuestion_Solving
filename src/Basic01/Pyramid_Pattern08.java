package Basic01;

import java.util.Scanner;

public class Pyramid_Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        PyramidPattern(number);

    }

    private static void PyramidPattern(int number) {
        for (int i = 1; i <= number; i++) {

            for (int space = 1; space <= number - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
