/*. Implement a Java program to read two numbers in a file called “input.txt”. Use
“output.txt” file to display prime numbers between this given limit. */
import java.io.*;
import java.util.Scanner;

public class Q3Day2Batch2 {
    public static void main(String[] args) {
        try {
            // Read the input file
            FileReader fileReader = new FileReader("Java/input.txt");
            FileWriter fileWriter = new FileWriter("Java/output.txt");
            Scanner sc=new Scanner(fileReader);
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            for(int i=num1;i<=num2;i++){
                if(isPrime(i)){
                    fileWriter.write(String.valueOf(i)+" ");
                }
            }      
            fileReader.close();
            fileWriter.close();
            sc.close();  
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
