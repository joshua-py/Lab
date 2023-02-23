public class GPT_evenodd {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumbers());
        Thread oddThread = new Thread(new OddNumbers());
        evenThread.start();
        oddThread.start();
    }
}

class Number{
   
    void print(){
        Thread evenThread = new Thread(new EvenNumbers());
        Thread oddThread = new Thread(new OddNumbers());
        evenThread.start();
        oddThread.start();
    }
    public void run(){
        print();
    }
}

class EvenNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 20; i <= 40; i += 2) {
            System.out.println("Even number: " + i);
        }
    }
}

class OddNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 21; i <= 39; i += 2) {
            System.out.println("Odd number: " + i);
        }
    }
}
