import java.util.Scanner;

public class intern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Number :");
        int inputNum = sc.nextInt();
        int cash = 1000;
        int change = cash - inputNum;
        int countFiveHundred = 0 ;
        int countOneHundred = 0 ;
        int countFifty = 0 ;
        int countTen = 0 ;
        int countFive = 0;
        int countOne = 0 ;


        System.out.println("จำนวนเงินทอน "+ change + " บาท");
        while(change != 0) {
            if(change >= 500) {
                countFiveHundred++;
                change = change - 500;
            }else if(change < 500 && change >=100) {
                countOneHundred++;
                change = change - 100;
            }else if(change < 100 && change >=50) {
                countFifty++;
                change = change - 50;
            }else if(change < 50 && change >= 10) {
                countTen++;
                change = change - 10;
            }else if(change < 10 && change >= 5) {
                countFive++;
                change = change - 5;
            }else if(change < 5 && change >= 1) {
                countOne++;
                change = change - 1;
            }
        }
        System.out.println("500 "+ countFiveHundred + " ใบ");
        System.out.println("100 "+ countOneHundred + " ใบ");
        System.out.println("50 "+ countFifty + " ใบ");
        System.out.println("10 "+ countTen + " เหรียญ");
        System.out.println("5 "+ countFive + " เหรียญ");
        System.out.println("1 "+ countOne + " เหรียญ");
    }
}