class Mythread implements Runnable{
	public void run(){
		for (int i = 0;i < 4;i++) {
			System.out.println("User thread");
		}
	}
}

public class Multithread{
	public static void main(String[] args) {
		Mythread r = new Mythread();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0;i < 4;i++) {
			System.out.println("main thread");
		}
	}

}