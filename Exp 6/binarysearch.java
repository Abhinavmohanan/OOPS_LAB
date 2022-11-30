import java.util.Scanner;
import sort.quicksortInt;

public class binarysearch {
    static int find(int arr[], int key, int lb, int ub) {
        int mid;
        while (lb <= ub) {
            mid = (lb + ub) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of elements of array: ");
        int n = read.nextInt();
        read.nextLine();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
        }
        quicksortInt.quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        quicksortInt.display(arr, n);
        System.out.println("Enter the element to search: ");
        int key = read.nextInt();
        int pos = find(arr, key, 0, n - 1);
        if (pos != -1) {
            System.out.println("Found at : " + (pos + 1));
        } else {
            System.out.println("Not found");
        }
        read.close();

    }
}
