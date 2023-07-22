package theory_session2;

import java.util.Scanner;

public class DecisionMarking_if_else {
    public static void main(String[] args) {
        System.out.println("Nhập vào tuổi của người dùng");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if (age<6|| age>60) {
            System.out.println("Giá vé xe bus: 0 đồng");
        }else if (6<=age&&age<18){
            System.out.println("Giá vé xe bus: 3500 đồng");

        }else{
            System.out.println("Giá vé xe bus: 7000 đồng");
        }
    }
}
