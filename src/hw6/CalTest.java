package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		while(true) {
			System.out.println("請輸入 x 和 y 的值：");
	        
	        x = sc.nextInt();
	        y = sc.nextInt();
	        
	        try {
				Calculator c1 = new Calculator(x,y);
				int result = c1.getPow();
				System.out.printf("%d 的 %d平方為 : %d", x,y,result);
				break;
			}catch(CalException e){
				e.printStackTrace();
			}
			
		}
		sc.close();
	}
	
}
