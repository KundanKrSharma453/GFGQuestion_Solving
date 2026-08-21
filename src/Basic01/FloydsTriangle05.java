package Basic01;

import java.util.Scanner;

public class FloydsTriangle05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        FloydsTriangle(number);
    }

    private static void FloydsTriangle(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
//            int count = 0;
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
