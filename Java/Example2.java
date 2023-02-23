
class New implements Runnable{
	Thread t;
	New(){
		t =new Thread(this,"Child");
		System.out.println("Constructor");
		t.start();
	}
	@Override
	public void run() {
		try {
			for (int  i = 0; i < 5; i++) {
				System.out.println("Hey for : "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Caught Exception");
		}

	}
}
class Example2{
	public static void main(String[] args) {
		new New();
		
	}
}