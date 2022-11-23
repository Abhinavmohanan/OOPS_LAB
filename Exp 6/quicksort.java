import java.util.Scanner;

public class quicksort {
    static void quickSort(String arr[], int low, int high) {
        int p;
        if (low < high) {
            p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(String arr[], int low, int high) {
        String pivot, temp;
        pivot = arr[high];

        int i = -1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) == -1) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static void display(String arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of names");
        int n = read.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the names");
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextLine();
        }
        quickSort(arr, 0, n);
        display(arr, n);

    }
}
