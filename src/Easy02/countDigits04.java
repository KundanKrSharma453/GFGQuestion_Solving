package Easy02;

import java.util.Scanner;

public class countDigits04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int counting = DigitCount(num);
        System.out.println("Total Digit of Number: "+counting);
    }

    private static int DigitCount(int num) {

     String str = String.valueOf(num);
     return str.length();
    }
}
