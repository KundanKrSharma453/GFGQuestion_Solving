package Basic01;

import java.util.Scanner;

public class Hollow_Rectangle10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter Column: ");
        int column = sc.nextInt();

        Hollow_Rectangle(row,column);
    }

    private static void Hollow_Rectangle(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i==1 || i == row || j == column|| j == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
