package LMS;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("which year that you want to check leap year?");
        int year = scanner.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.printf("Năm %d là năm nhuận\n",year);
                }else {
                    System.out.printf("Năm %d không phải là năm nhuận\n",year);
                }
            }else {
                System.out.printf("Năm %d là năm nhuận\n",year);
            }
        }else {
            System.out.printf("Năm %d không phải là năm nhuận\n",year);
        }
    }
}
