/*Implement a Java program to create a class called as “Number” with a data
member called limit. A class called as “Compute” inherits this class and has a
method called “secLargest” to display the second largest of an array of
numbers. The limit for the array should be used from the “Number” class. */
import java.util.Scanner;
class Number{
    int limit=4;
}
class Compute extends Number{
    int size=super.limit;
    void secLargest(int x[]){
        int first=x[0],second=x[0],i;
        int n=size;
        for (i = 0; i < n; ++i) {
            if (first < x[i]) {
                second = first;
                first = x[i];
            } else
            if (x[i] > second && x[i] != first) {
                second = x[i];
            }
        }
        System.out.println("Second Largest is: "+second);
    }
    public static void main(String[] args) {
        Compute c=new Compute();
        int a[]=new int [c.size];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        for(int i=0;i< c.size ;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        c.secLargest(a);
    }
}  
