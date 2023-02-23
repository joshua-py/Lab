
class Multithreading extends Thread 
{ 
    public void run() 
    { 
        try
        { 
        for(int i=0;i<2;i++)
        {
            System.out.println (" Child Thread " + Thread.currentThread().getId() + " is running"); 
        }
        } 
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
class Multithreading2 extends Thread 
{ 
    public void run() 
    { 
        try
        { 
        for(int i=0;i<2;i++)
        {
            System.out.println (" Child Thread " + Thread.currentThread().getId() + " is running"); 
        }
        } 
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  

class Example3 
{ 
    public static void main(String[] args) 
    { 
    
    
        Multithreading object = new Multithreading();
        Multithreading2 object2 = new Multithreading2();
            object.start(); 
            object2.start();
    } 
} 
