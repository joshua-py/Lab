
import java.util.Scanner;
public class Symmetric {
    public static void main(String[] args) {
        int[][] matrix;
        int rows, columns;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        columns = scanner.nextInt();
        matrix = new int[rows][columns];
        if (rows == columns) 
        {
            int flag=1;
            System.out.println("Enter elements of matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            int transpose[][]=new int[columns][rows];
            for (int i = 0; i < 
            columns; i++) {
                for (int j = 0; j < rows; j++) {    
                    transpose[i][j]=matrix[j][i];
                }

                System.out.println();
            }
            scanner.close();
                for (int i = 0; i < rows; i++) {
    
                    // Inner loop for columns
                    for (int j = 0; j < columns; j++) {
                        // Comparing two matrices
                        if (matrix[i][j] != transpose[i][j]) {
                            flag = 0;
                            break;
                        }
                    }
    
                    if (flag == 0) {
    
                        // Display message
                        System.out.print(
                            "\nThe matrix is not symmetric");
                        break;
                    }
                }
    
                if (flag == 1) {
    
                    // Display message
                    System.out.print(
                        "\nThe matrix is symmetric");
                }
        }
 
        else {
 
            // Display message
            System.out.print(
                "\nThe matrix is not symmetric");
        }
    }
}
