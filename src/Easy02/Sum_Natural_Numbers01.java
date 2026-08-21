package Easy02;

import java.util.Scanner;

public class Sum_Natural_Numbers01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

//        int naturalNumber = Sum_of_Natural_Numbers(number);
//        System.out.println("Sum of Natural Numbers: "+naturalNumber);


        Sum_of_Natural_Numbers(number);
    }

    private static void Sum_of_Natural_Numbers(int number) {

        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
            System.out.print(i+", ");
            System.out.println("Sum = "+sum);
        }
    }

//    private static int Sum_of_Natural_Numbers(int number) {
//        int sum = 0;
//        for (int i = 0; i <= number; i++) {
//            sum += i;
//        }
//        return sum;
//    }
}
