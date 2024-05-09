package hw3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Homework3 {

	public static void main(String[] atgs) {

		System.out.println("請輸入三角形三個邊 : ");
		Scanner input = new Scanner(System.in);

		Homework3 tri = new Homework3();
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		tri.triangle(a, b, c);

		tri.randomTo9();

		System.out.println("不想要讓 0~9 哪個數字出現? :");
		int x = input.nextInt();

		tri.theHater(x);
		input.close();
	}

	public void triangle(int a, int b, int c) {

		if (a + b > c && a + c > b && b + c > a) {
			if (a == b && a == c && b == c) {
				System.out.println("正三角形");
			} else if (a == b || a == c || b == c) {
				System.out.println("等邀三角形");
			} else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)
					|| Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)
					|| Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
				System.out.println("直角三角形");
			}

			else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}

		System.out.println("=======================================");

	}

	public void randomTo9() {
		int number = (int) (Math.random() * 101);
		Scanner input = new Scanner(System.in);
		input.close();
		while (true) {
			System.out.println("猜一個 0 ~ 101 的數字吧 :");
			int x = input.nextInt();

			if (x == number) {
				System.out.printf("猜對嚕 答案就是 %d \n", x);
				break;
			}

			else if (x > number) {
				System.out.println("猜錯嚕 答案再小一點 再試一次吧 !");
				System.out.println("-------------------");
			}

			else if (x < number) {
				System.out.println("猜錯嚕 答案再大一點 再試一次吧 !");
				System.out.println("-------------------");
			}
		}
	}

	// 似乎會用到Random(); 抽選6數來源
	// https://blog.idontwannarock.me/2017/11/java_lottery_algorithm_basic/
	public void theHater(int x) {
		int count = 0;
		int[] y = new int[49];
		for (int i = 1; i <= 49; i++) {

			int one = i % 10;
			int ten = i / 10;

			if (one != x && ten != x && !(i >= x * 10 && i <= x * 10 + 9)) {
				y[count++] = i;
				System.out.printf("%2d\t", i);
			}
		}
		System.out.println();
		System.out.printf("總共有%d個數字可以選 \n", count);
		Random r = new Random();

		for (int j = 0; j < 6; j++) {
			int index = r.nextInt(count);
			boolean check = true; // 確認數字有沒有被選過 true = 沒有
			int a = y[index];

			for (int k = 0; k < j; k++) {
				if (a == y[k]) {
					check = false; // 選過了 重選
					j--;
					break;
				}
			}
			if (check) {
				System.out.println(y[index]);
			}
		}
	}

//	一樣是測試用 還沒跑過 可能會過吧? 誰看到可以自己試試看 我就算了
//	public void theHater1(int x) {
//	int count = 0;
//	System.out.println("不想要讓 0~9 哪個數字出現? :");
//	
//	String ban = String.valueOf(x);
//	
//	for(int i = 1; i <= 49 ; i++) {
//		String number = String.valueOf(i);
//		
//		if ( !number.contains(ban) ) {
//			System.out.print(i + "\t");
//			count++;
//		}
//	}
//	
//	System.out.printf("總共有%d個數字可以選", count);
//}
}
