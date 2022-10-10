import java.util.Scanner;

class bubblesort{
        public static void main(String args[]){
                int n,i;
                int arr[];
                Scanner read = new Scanner(System.in);
                System.out.println("Enter number of element of array: ");
                n = read.nextInt();
                arr = new int[n];
                System.out.println("Enter elements of the array: ");
                for(i=0;i<n;i++){
                        arr[i] = read.nextInt();
                }
                sort(arr);
                System.out.println("Sorted elements of the array: ");
                for(i=0;i<n;i++){
                        System.out.print(String.format("%d ",arr[i]));
                }
                 System.out.println();

        }

        private static void sort(int arr[]){
                        int temp,n= arr.length;
                        for(int i=0;i<n-1;i++){
                                for(int j=0;j<n-i-1;j++){
                                        if(arr[j]>arr[j+1]){
                                            temp = arr[j+1];
                                            arr[j+1]=arr[j];
                                            arr[j] = temp;    
                                        }
                                }
                        }
        }
}