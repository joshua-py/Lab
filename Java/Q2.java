import java.io.*;
import java.util.Scanner;
/*Implement a Java program to read a number in a file called “input.txt”. Read
that number from the file and display Fibonacci series up to that limit in
another file called “output.txt”. */
class Q2
    {
    public static void main(String ar[]) throws IOException{
        FileInputStream fr=new FileInputStream("input.txt");
        Scanner sc = new Scanner(fr);
        int n = sc.nextInt();
        System.out.println(n);
        FileWriter fw= new FileWriter("output.txt");
        int  firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        String str="";
        for (int i = 1; i <= n; ++i) {
            str+=firstTerm+",";
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        fw.write(str);
        fw.close();
        sc.close();
        }
}