package LMS;

import com.apple.eawt.Application;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to read");
        int number = scanner.nextInt();
        System.out.printf("%d is ",number);
        String hundredsWord ="", tensWord = "", onesWord = "", readNumber = "";
//        int ones = (number%100)%10;
//        int tens = (number/10)%10;
//        int hundreds = number/100;
        int ones = number%10;
        int tens = (number/10)%10;
        int hundreds = number/100;
        switch (ones){
            case 0:
                onesWord="zero";
                break;
            case 1:
                onesWord="one";
                break;
            case 2:
                onesWord="two";
                break;
            case 3:
                onesWord="three";
                break;
            case 4:
                onesWord="four";
                break;
            case 5:
                onesWord="five";
                break;
            case 6:
                onesWord="six";
                break;
            case 7:
                onesWord="seven";
                break;
            case 8:
                onesWord="eight";
                break;
            default:
                onesWord="nine";

        }
        switch (tens){
            case 1:
                switch (ones){
                    case 0:
                        tensWord = "ten";
                        break;
                    case 1:
                        tensWord = "eleven";
                        break;
                    case 2:
                        tensWord = "twelve";
                        break;
                    case 3:
                        tensWord = "thirteen";
                        break;
                    case 5:
                        tensWord = "fifteen";
                        break;
                    default:
                        tensWord = onesWord +"teen";
                }
                break;
            case 2:
                tensWord = "twenty";
                break;
            case 3:

                tensWord = "thirty";
                break;
            case 4:
                tensWord = "forty";
                break;
            case 5:
                tensWord = "fifty";
                break;
            case 6:
                tensWord = "sixty";
                break;
            case 7:
                tensWord = "seventy";
                break;
            case 8:
                tensWord = "eighty";
                break;
            default:
                tensWord = "ninety";
                break;
            }
        switch (hundreds){
            case 1:
                hundredsWord="one";
                break;
            case 2:
                hundredsWord="two";
                break;
            case 3:
                hundredsWord="three";
                break;
            case 4:
                hundredsWord="four";
                break;
            case 5:
                hundredsWord="five";
                break;
            case 6:
                hundredsWord="six";
                break;
            case 7:
                hundredsWord="seven";
                break;
            case 8:
                hundredsWord="eight";
                break;
            default:
                hundredsWord="nine";
        }

        if (number <0 || number > 999) {
                System.out.println("Out of ability");
            } else if (number < 10)  {
                readNumber = onesWord;
            } else if (number<20) {
                readNumber = tensWord;
            } else if (number<100) {
                if (ones==0){
                    readNumber = tensWord;
                } else {
                    readNumber = tensWord + " " + onesWord;
                }
            } else {
                if (tens==0 && ones==0){
                    readNumber = hundredsWord + " hundred ";
                } else if (tens==0 && ones!=0) {
                    readNumber = hundredsWord + " hundred " + onesWord;
                } else if (tens!=0 && ones==0) {
                    readNumber = hundredsWord + " hundred " + tensWord;
                } else if (tens==1){
                    readNumber = hundredsWord + " hundered " + tensWord;
                } else {
                    readNumber = hundredsWord + " hundred " + tensWord + " " +onesWord;
                }
        }
        System.out.println(readNumber);

    }
}
