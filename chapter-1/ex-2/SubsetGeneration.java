import java.util.Scanner;

public class SubsetGeneration {
    // Print all possible combinations of k elements in a given array of size n
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = input.nextInt();
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        generateSubset(arr, k, n);
    }

    public static void generateSubset(int arr[], int k, int n) {
        int arr1[] = new int[k];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i +1;
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");

        while (arr1[0] < n-k+1) {
            for (int i = k-1; i >= 0; i--) {
                if (arr1[i] < n-k+i+1) {
                    arr1[i] += 1;
                    if (i == k-1) {
                        for (int j = 0; j < arr1.length; j++) {
                            System.out.print(arr1[j] + " ");
                        }
                        System.out.println("");
                        break;
                    } else {
                        for (int j = i+1; j <= arr1.length-1; j++) {
                            arr1[j] = arr1[i] + j - i;
                        }
                        for (int m = 0; m < arr1.length; m++) {
                            System.out.print(arr1[m] + " ");
                        }
                        System.out.println(""); 
                        break;
                    }
                }
            }
        }
    }
}