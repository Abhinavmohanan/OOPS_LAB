import java.util.Scanner;

class MatrixMult{
    static void readMatrix(int mat[][],int m,int n){
        Scanner read = new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = read.nextInt();
            }
        }
    }

    static void printMatrix(int mat[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int mat1[][],mat2[][],mat3[][];

        //Matrix #1
        System.out.println("Enter number of rows of matrix 1:");
        int m = read.nextInt();
        System.out.println("Enter number of rows of matrix 1:");
        int n = read.nextInt();
        System.out.println("Enter matrix 1:");
        mat1 = new int[m][n];
        readMatrix(mat1,m,n);


        System.out.println("Enter number of rows of matrix 2:");
        int p = read.nextInt();
        System.out.println("Enter number of rows of matrix 2:");
        int q = read.nextInt();
        System.out.println("Enter matrix 2:");
        mat2 = new int[p][q];
        readMatrix(mat2,p,q);   

        if(n!=p){
            System.out.println("Not Possible");
            System.exit(0);
        }

        mat3 = new int[m][q];

        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<n;k++){
                 mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        printMatrix(mat3,m,q);
    }
}