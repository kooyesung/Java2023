package s0904;

public class MultiTherad_1 {

	public static void main(String[] args) {

		MyThread my = new MyThread();
		my.start();

		K my1 = new K();
		my1.start();

		for (int i = 0; i < 10; i++) {
			System.out.print("* ");
			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(". ");
			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class K extends Thread {

	@Override
		public
		void run(){
				for(int i = 0; i<10; i++) {
					System.out.print("@ ");
					try {
						Thread.sleep(500);
						
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	
		}
}
