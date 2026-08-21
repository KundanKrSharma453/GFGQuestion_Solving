package Basic01;

import java.util.Scanner;

public class If_Else02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if_Else(number);
    }

    private static void if_Else(int number) {
        if(number >= 100){
            System.out.println("Big");
        } else if (number <= 10) {
            System.out.println("Small");
        }else {
            System.out.println("Number");
        }
    }
}
