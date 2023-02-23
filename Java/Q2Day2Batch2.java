
import java.util.Scanner;
class Matrix {


    int[][] matrix;
    int rows, columns;
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        
        System.out.print("Enter number of columns: ");
        columns = scanner.nextInt();
        
        matrix = new int[rows][columns];
        
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        scanner.close();
    }
    
    public void output() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MatTranspose extends Matrix {
    public void transpose() {
        
        System.out.println("Transpose:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}

public class Q2Day2Batch2 {
    public static void main(String[] args) {
        MatTranspose mat = new MatTranspose();
        mat.input();
        mat.output();
        mat.transpose();
    }
}
