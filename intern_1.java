import java.util.Scanner;

public class intern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Array");
        // int number = sc.nextInt();
        int[] arrayNum = new int[5];

        for (int i = 0; i < 5; i++) {
            arrayNum[i] = sc.nextInt();
        }
        System.out.println("Please input your sum number :");
        int inputNum = sc.nextInt();

        System.out.println("Result :");
        for (int i = 0; i < arrayNum.length - 1; i++) {
            for (int j = i; j < arrayNum.length-1;j++) {
                if(arrayNum[i] + arrayNum[j] == inputNum && arrayNum[i] != arrayNum[j]) {
                    System.out.println(arrayNum[i]+" , "+ arrayNum[j]);
                }
                // System.out.println();
            }
        }
    }
}