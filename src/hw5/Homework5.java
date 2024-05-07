package hw5;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		Homework5 hw = new Homework5();
		Work3 w3 = new Work3();
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入四邊形的高為多少 : ");
		int x = sc.nextInt();
		System.out.print("請輸入四邊形的長為多少 : ");
		int y = sc.nextInt();
		hw.starSquare(x,y);
		
		hw.randAvg();
		
		int[][] intArray = {{1, 6, 3}, {9, 5, 2}};
	    	double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
	    	System.out.println("int陣列的最大值：" + w3.maxElement(intArray));
	    	System.out.println("double陣列的最大值：" + w3.maxElement(doubleArray));
	    	System.out.println("========================================");
	    
		hw.genAuthCode();	    
		
	}
	

	
	public void starSquare(int width,int height) {
		
		for(int i = 0 ; i < width ; i++) {
			for(int j = 0; j < height ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========================================");
	}
	
	public void randAvg() {
		int [] data = new int [10];
		int all = 0;
		System.out.println("隨機生成10個 1 ~ 100 間的亂數 : ");
		for(int i = 0 ; i < data.length; i++) {
			data[i] = (int) (Math.random()*100);
			System.out.print(data[i] + "\t");
			all += data[i];
		}
		System.out.println();
		double avg = all / data.length;
		System.out.println("這10個亂數的平均值為 : "+ avg);
		System.out.println("========================================");
		
	}
	
	// 參考資料https://stackoverflow.com/questions/41107/how-to-generate-a-random-alpha-numeric-string 
	public void genAuthCode() {
		// 做是做出來了 但感覺有點土法煉鋼 之後再想方法加強
		String abcNUM = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] randomCode = new char[8];
		
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			int index = random.nextInt(abcNUM.length());
			randomCode[i] = abcNUM.charAt(index);
		}
		System.out.print("隨機8碼為 : ");
		for(int i = 0; i < randomCode.length; i++) {
			System.out.print(randomCode[i]);
		}
		System.out.println();
		System.out.println("========================================");
		
	}
	
}
