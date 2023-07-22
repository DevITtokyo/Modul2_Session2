package theory_session2;

import java.util.Scanner;

public class DecisionMarking_switch_case {
    public static void main(String[] args) {
/*
Nhập vào 1 số nguyên, in ra các số dư của số nguyên khi chia cho 5
*/
        System.out.println("Nhập vào 1 số nguyên");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        System.out.printf("%d chia cho 5 dư %d",number,number%5);
        int remainder = number%5;
        switch (remainder){
            case 1:
                System.out.printf("%d chia cho 5 dư 1\n",number);
                break;
            case 2:
                System.out.printf("%d chia cho 5 dư 2\n",number);
                break;
            case 3:
                System.out.printf("%d chia cho 5 dư 3\n",number);
                break;
            case 4:
                System.out.printf("%d chia cho 5 dư 4\n",number);
                break;
            default:
                System.out.printf("%d chia hết cho 5\n",number);
        }
    }
}
