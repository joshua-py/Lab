

import java.util.Scanner;
class Display extends Thread{
    int n;
    int array[]=new int[20];
    Display(int array[],int n){
        this.n=n;
        for (int i = 0; i < n; i++) {
            this.array[i]=array[i];
        }
    }
    void display(){
        for (int i = 0; i < n; i++) {
            
            System.out.print(array[i]+" ");
        }
    }
    public void run() {
        display();
    }
}
class Squareew extends Thread{
    int n;
    int array[]= new int[20];
    Squareew(int array[],int n){
        this.n=n;
        for (int j = 0; j < n; j++) {
            this.array[j]=array[j]*array[j];
        }
    }
    public void run() {
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}
public class Sqaure_Display{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your size: ");
        int size=sc.nextInt();
        int array[] = new int [size];
        for (int i = 0; i < size; i++)
        array[i]=sc.nextInt();    
        Display disp = new Display(array,size);
        disp.start();
        Squareew s= new Squareew(array, size);
        s.start();
        sc.close();
    }
}