
/*Implement a java program that shows thread synchronisation in which
 2 threads print thr multiplication table */
class One extends Thread{
    int n;
    One(int n){
        this.n=n;
    }
    @Override
    public void run() {
        Table t= new Table();
        t.printTable(n);
        notify();
    }
}
class Two extends Thread{
    int n;
    Two(int n){
        this.n=n;
    }
    @Override
    public void run() {
        Table t= new Table();
        t.printTable(n);
        
    }
}
class Table extends Thread{
    
    synchronized void printTable(int num){
        for (int i = 0; i < 11; i++) {
            System.out.println(num+"*"+i+"="+num*i);
        }
}
}
public class Multithreading_record{
    public static void main(String[] args) {
        One o = new One(3);
        Two t = new Two(4);
        o.start();
        t.start();
    }
}