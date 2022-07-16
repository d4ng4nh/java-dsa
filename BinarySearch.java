import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        Random rd = new Random();
        int arr[] = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        sort(arr);
        System.out.println(binarySearch(arr, x, 0, arr.length - 1));
    }

    public static void sort(int arr[]) {
        //Bubble sort
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
    }

    public static int binarySearch(int arr[], int x, int low, int high) {
        while (low < high) {
            int mid = (low + high)/2;
            if (x == arr[mid]) {
                return mid;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }  
}