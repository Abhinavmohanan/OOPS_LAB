import java.util.Scanner;

public class quicksort {
    static void swap(String arr[], int i, int j) {
        String temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(String arr[], int low, int high) {
        int p;
        if (low < high) {
            p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(String arr[], int low, int high) {
        String pivot;
        pivot = arr[high];

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareToIgnoreCase(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void display(String arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of names");
        int n = read.nextInt();
        read.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter the names");
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextLine();
        }
        quickSort(arr, 0, n - 1);
        display(arr, n);
        read.close();

    }
}
