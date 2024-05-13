package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;

		while (true) {

			try {
				System.out.println("請輸入 x 和 y 的值：");

				x = sc.nextInt();
				y = sc.nextInt();
				Calculator c1 = new Calculator(x,y);
				int result = c1.getPow();
				System.out.printf("%d 的 %d平方為 : %d", x,y,result);
				break;
			} catch (InputMismatchException e) {
				System.out.println("格式錯誤 請重新輸入");
				e.printStackTrace();
				sc.nextLine();
			}catch(CalException e) {
				e.printStackTrace();
			}

		}
		sc.close();
	}

}
