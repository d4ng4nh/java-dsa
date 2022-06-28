import java.util.Scanner;

public class BinaryGeneration {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of number you want to print: ");
        int num = input.nextInt();
        int binaryNum[] = new int[5];
        for (int i = 0; i < binaryNum.length; i++) {
            binaryNum[i] = 0;
        }
        generateBinary(binaryNum, num);
    }

    public static void generateBinary(int binaryNum[], int num) {      
        for (int i = 0; i < num; i++) {
            for (int j = binaryNum.length - 1; j >= 0; j--) {
                if (binaryNum[j] == 0) {
                    binaryNum[j] = 1;
                    while (j < binaryNum.length - 1) {
                        binaryNum[j + 1] = 0;
                        j++;
                    }

                    for (int k = 0; k < binaryNum.length; k++) {
                        System.out.print(binaryNum[k]);
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }
}