package hw9;

public class Eatter implements Runnable{
	int counter = 1;
	String name ;
	public Eatter(String name) {
		this.name = name;
	}
	
	public void run() {
		while (counter <= 10) {
			System.out.println(name + " 吃了第 " + counter + " 碗飯");
			counter++;
			
			try {
				Thread.sleep((long) (500 + Math.random()*3000));
				if (counter >= 10) {
					System.out.println(name + " 吃完飯了");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]) {
		Eatter e1 = new Eatter("饅頭人");
		Thread t1 = new Thread(e1);
		Eatter e2 = new Eatter("詹姆士");
		Thread t2 = new Thread(e2);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("================");
		System.out.println("大胃王比賽結束");
	}
}
