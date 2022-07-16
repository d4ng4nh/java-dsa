import java.util.Random;

public class BubbleSort {
    public static void main(String args[]) {
        Random rd = new Random();
        int arr[] = new int[25];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(50);
        }

        bubbleSort(arr);
    }

    public static void bubbleSort(int arr[]) {
        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}