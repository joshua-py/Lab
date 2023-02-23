/*Implement a Java program to create an interface called “Number” with a
method called “display”. Two classes “NoDuplicate” and “Sum” inherits this
class. NoDuplicate class should remove the duplicate elements in an aay.
Sum class should calculate the sum of digits of a number. Both classes should
use display method to print the result */

interface Numbers{
    abstract public void display();
}


class Sum implements Numbers{
    int a,b;
    Sum(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println("Sum is : "+(a+b));
        
    }
    
}
class NoDuplicate implements Numbers{
    int a[]=new int[10];
    int n;
    NoDuplicate(int array[],int size){
        this.n=size;
        for (int i = 0; i < size; i++) {
            a[i]=array[i];
        }
        int j=0;
        int temp[]= new int[20];
        for (int i = 0; i < n-1; i++) {
            if(a[i]!=a[i+1])
                temp[j++]=a[i];
        }
        temp[j++] = a[n-1];
        n=j;
        for (int i = 0; i < n; i++) {
            a[i]=temp[i];   
        }
    }
    public void display(){
        for (int i = 0; i < n ;i++) {
            System.out.println(a[i]);
        }
    }
}
public class Q1Day2Batch2{
    public static void main(String[] args) {
        Numbers n;
        Sum s= new Sum(3, 4);
        n=s;
        n.display();
        int size=5;
        int a[]={1,2,6,3,3};
        NoDuplicate d= new NoDuplicate(a,size);
        d.display();
    }   
}