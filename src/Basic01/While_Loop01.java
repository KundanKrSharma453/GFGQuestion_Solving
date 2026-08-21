package Basic01;

import java.util.Scanner;

public class While_Loop01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();

        ReverseOrderPrint(number);
    }

    private static void ReverseOrderPrint(int number) {
        int i = number;
        while (i >= 0){
            System.out.println(i);
            i--;
        }
    }
}
