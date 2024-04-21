package hw1;

public class Homework1 {

	public static void main(String[] arg) {
		
		number1();

		number2();

		number3();

		number4();

		double saving = 1500000;
		double rate = 0.02;
		double total_Money = saving * Math.pow(1 + rate, 10);
		System.out.printf("本金為 : %.0f 元，且利率為 %.2f，10年後本金加利息共為 : %.10f 元", saving, rate, total_Money);
		// 感覺好像可以用For迴圈做? 20240418
		
		System.out.println();
		System.out.println("=======================");

		System.out.println(5 + 5); // 兩個int相加 所以答案是10
		System.out.println(5 + '5'); // 數值5 加上 ASCII 5 所以答案是58 (5 + 53)
		System.out.println(5 + "5"); // 因為print裡面有字串，所以裡面的整數5轉為字串 兩個字串相連因此答案為55

	}
	
	public static void number1() {
		int a = 12;
		int b = 6;
		System.out.println("12 + 6 的和為 :" + (a + b));
		System.out.println("12 + 6 的積為 :" + (a * b));

		System.out.println("=======================");
	}
	
	public static void number2() {
		int egg = 200;
		int pair = egg / 12;
		int last = egg % 12;
		System.out.println("200顆總共是 :" + pair + " 打又 " + last + " 顆 ");

		System.out.println("=======================");
	}
	
	public static void number3() {
		long total = 256559;
		long day = total / (60 * 60 * 24);
		long hour = (total / (60 * 60)) % 24;
		long minute = total / 60 % 60;
		long second = total % 60;
		System.out.println(total + " 秒總共是 :" + day + " 天 " + hour + " 小時 " + minute + " 分鐘 " + second + " 秒 ");

		System.out.println("=======================");
	}
	
	public static void number4() {
		double pai = 3.1415;
		int r = 5;
		double circle_Area = pai * Math.pow(r, 2);
		double circle_ference = 2 * pai * r;
		System.out.println("半徑為5的圓面積為 :" + circle_Area + "圓周長為 :" + circle_ference);

		System.out.println("=======================");
	}
	
	

}
