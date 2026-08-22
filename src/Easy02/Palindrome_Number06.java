package Easy02;

import java.util.Scanner;

public class Palindrome_Number06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean flag = IsPalindromeNumber(num);
        if (flag)
            System.out.println("This is Palindrome Number: "+num);
        else
            System.out.println("No this is not palindrome number: "+num);
    }

    private static boolean IsPalindromeNumber(int num) {
        int temp = num;
        int reverse = 0;
        while (temp != 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        System.out.println("This is temp: "+num);
        System.out.println("This is reverse: "+reverse);

        if (reverse == num)
            return true;
        else
            return false;
    }
}
