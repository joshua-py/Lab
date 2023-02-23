import java.util.Scanner;

public class Matrix_multiplication {
    public static void main(String[] args) {
        int ra,rb,ca,cb;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column size of Matrix A: ");
        ra=sc.nextInt();
        ca=sc.nextInt();
        System.out.print("Enter row and column size of Matrix B: ");
        rb=sc.nextInt();
    cb=sc.nextInt();
        if(rb!=ca){
            System.out.println("Matrix Multiplication not possible: ");
            System.exit(0);
        }
        int a[][] = new int[ra][ca];
        int b[][] = new int[rb][cb];
        System.out.println("Enter elements of Matrix A ");
        for (int i = 0; i < ra; i++) {
            for(int j=0;j<ca;j++){
                System.out.print("Enter value for "+i+" "+j+" : ");
                a[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("Enter elements of Matrix B ");
        for (int i = 0; i < rb; i++) {
            for(int j=0;j<cb;j++){
                System.out.print("Enter value for "+i+" "+j+" : ");
                b[i][j]=sc.nextInt();
            }
        }   
        sc.close();
        System.out.println("Matrix A");
        for (int i = 0; i < ra; i++) {
            for(int j=0;j<ca;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix B");
        for (int i = 0; i < rb; i++) {
            for(int j=0;j<cb;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int c[][] = new int [ra][cb];
        for (int i = 0; i < ra; i++) {
            for(int j=0;j < cb;j++){
                c[i][j]=0;
                for(int k=0;k<cb;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Matrix C");
        for (int i = 0; i < ra; i++) {
            for(int j=0;j<cb;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}