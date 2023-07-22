import java.util.Scanner;

public class intern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number :");
        int inputNum = sc.nextInt();

        System.out.println("Result :");
        for (int i = inputNum; i > 0; i--) {
            
            for (int j = 0; j < inputNum - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}