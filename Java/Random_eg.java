import java.util.Random;
class Square extends Thread
{

	int x;
	Square(int n)
	{
		x = n;
	}
	public void run()
	{
		try
		{
			Thread.currentThread().setName("Squre");
			int sqr = x * x;
			System.out.println (Thread.currentThread().getName() +  " is running");
			System.out.println("Square of " + x + " = " + sqr );
			Thread.sleep(500);
		}
		catch (InterruptedException e) {
        		System.out.println("Main thread Interrupted");
        } 
	System.out.println( " Square exiting.");
	}
}
class Cube extends Thread
{

	int x;
	Cube(int n)
	{
		x = n;
	}
	public void run()
	{
		try
		{
			Thread.currentThread().setName("Cube");
			int cub = x * x * x;
 			System.out.println (Thread.currentThread().getName() + " is running");
			System.out.println("Cube of " + x + " = " + cub );
 			Thread.sleep(500);
		}
	catch (InterruptedException e) {
        	System.out.println("Main thread Interrupted");
        } 
	System.out.println( " Cube exiting."); 
	}
}

class Number extends Thread
{
	public void run()
	{
		Thread.currentThread().setName("Random");
		System.out.println (Thread.currentThread().getName() +   " is running");
		Random random = new Random();
		for(int i =0; i<3; i++)
		{
			int randomInteger = random.nextInt(10);
			System.out.println("Random Integer generated : " + randomInteger);
			Square s = new Square(randomInteger);
			s.start();
			Cube c = new Cube(randomInteger);
			c.start();
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				System.out.println("Main thread Interrupted");
			}
		}
	}
}
public class Random_eg 
{
 	public static void main(String args[])
 	{
 		Number n = new Number();
 		n.start();
  		try 
		{
			Thread.sleep(10000);
		} catch (InterruptedException ex) {
			System.out.println(ex);
		}
  		System.out.println( " Main thread exiting."); 
	}
 }
