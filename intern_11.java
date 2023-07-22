import java.util.Scanner;

public class intern_11 {
    public static void main(String[] args) {
        sortNum(10);

    }

    public static void sortNum(int num) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNum = new int[10];

        System.out.println("Please input your number :");
        for (int i = 0; i < num; i++) {
            arrayNum[i] = sc.nextInt();
        }
        System.out.println("Result :");
        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = i + 1; j < arrayNum.length; j++) {
 
                int temp = 0;
                if (arrayNum[j] < arrayNum[i]) {

                    temp = arrayNum[i];
                    arrayNum[i] = arrayNum[j];
                    arrayNum[j] = temp;
                }
            }
            System.out.print(arrayNum[i] + " ");
        }

    }
}