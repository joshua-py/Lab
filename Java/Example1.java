
class Multi implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("Child");
        for(int i=0;i<2;i++)
            System.out.println("Child Thread "+Thread.currentThread().getName());
    }
}
public class Example1{
    public static void main(String[] args) {
        Thread t= new Thread(new Multi());
        t.start();
        for(int i=0;i<2;i++)
            System.out.println("Main Thread "+Thread.currentThread().getName());
        Thread n= new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Another");
            }
        });
        n.start();
    }
}