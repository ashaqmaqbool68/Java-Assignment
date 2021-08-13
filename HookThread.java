class Mythread implements Runnable{
	public void run(){
			System.out.println("User thread");
		
	}
}

public class HookThread{
	public static void main(String[] args) {
		Mythread u = new Mythread();
		Thread t = new Thread(u);
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(t);
		//t.start();
		for (int i = 0;i < 4;i++) {
			if( i == 3){
			System.out.println("main thread");
			break;
			}
		}
	}

}