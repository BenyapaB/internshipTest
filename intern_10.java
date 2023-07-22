import java.util.Scanner;

public class intern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number :");
        int inputNum = sc.nextInt();

        System.out.println("Result :");
        
        for(int i = 0; i < inputNum ; i++) {
            for(int j = 0 ; j < (inputNum-i-1) ; j++) {
                System.out.print(" ");
            }
            for(int j = 0 ; j < (2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}