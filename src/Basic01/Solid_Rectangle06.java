package Basic01;

import java.util.Scanner;

public class Solid_Rectangle06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        Solid_Rectangle(row,columns);
    }

    private static void Solid_Rectangle(int row, int columns) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
