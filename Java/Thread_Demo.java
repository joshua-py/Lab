
// Java program for the above approach
import java.util.*;
class Thread_Demo {
	public static void main(String[] args)
	{
		// Array created for 5 elements
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your size: ");
        int size=sc.nextInt();
        int a[] = new int [size];
        for (int i = 0; i < size; i++)
            a[i]=sc.nextInt();
        sc.close();    
        Thread t1 = new Thread(new Runnable() {
			public void run(){
				synchronized (a)
				{
					System.out.print("The elements are : ");
                    
					for (int i = 0; i < size; i++) {
                        System.out.print(a[i]+" ");
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
            public void run()
			{
                // Here the array is being
				// synchronized
				synchronized (a)
				{
                    
                    for (int i = 0; i < size; i++) {
                        a[i] = a[i]*a[i];
					}
                    System.out.println();
                    System.out.print("The elements square  are : ");
					for (int i = 0; i < size; i++) {
                        System.out.print(a[i]+" ");
                    }

				}
			}
		});
		t1.start();
		t2.start();
	}
}
