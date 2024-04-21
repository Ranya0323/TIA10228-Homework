package hm2;

public class homework2 {

	public static void main(String[] arg) {

		evenNumber_Sum_1to1000();

		multiPlication_1to10_for();

		multiPlication_1to10_while();

		square_1to10();

		theHater4();

		pyramid_Reverse();

		pyramid_ABC();

		ninenine_Forwhile();

		ninenine_Fordowhile();
		
		ninenine_Whiledowhile();

	}

	public static void evenNumber_Sum_1to1000() {

		int total = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		System.out.println("1~1000裡的偶數合為 :" + total);
		System.out.println("=============================================");

	}

	public static void multiPlication_1to10_for() {

		int total = 1;

		for (int i = 1; i <= 10; i++) {
			total *= i;

		}

		System.out.println("1~10的連乘積 :" + total + " (for迴圈)");
		System.out.println("=============================================");
	}

	public static void multiPlication_1to10_while() {

		int i = 1;
		int total = 1;

		while (i <= 10) {

			total *= i;
			i++;

		}

		System.out.println("1~10的連乘積 :" + total + " (while迴圈)");
		System.out.println("=============================================");
	}

	public static void square_1to10() {

		int total = 1;

		for (int i = 1; i <= 10; i++) {

			total = i * i;

			System.out.print(total + " ");
		}

		System.out.println();
		System.out.println("=============================================");
	}

	public static void theHater4() {

		// string ABC = string.valueOf(i) 似乎有這個東西可以用? 

		int count = 0;
		System.out.print("阿文可以選的數字為 :");

		for (int i = 1; i <= 49; i++) {

			if (i != 4 && i % 10 != 4 && !(i >= 40 && i <= 49)) { // 發現最後可以用 i <= 39 總感覺這方法很土法煉鋼

				System.out.print(i + " ");

				count++;
			}
		}

		System.out.println();
		System.out.println("總共有 :" + count + "個數字可以選");
		System.out.println("=============================================");

	}
	
	// Remaster為測試用途string ABC = string.valueOf(i) 請忽略
	public static void theHater4_Remaster() { 
		int count = 0;
		
		for (int i = 1; i <= 49 ; i++) {
			String hater4 = String.valueOf(i);
			
			if (!hater4.contains("4")) {
				System.out.print(i + " ");
				
				count++;
			}
			
		}
		System.out.println();
		System.out.println("總共有 :" + count + "個數字可以選");
		System.out.println("=============================================");
	}

	public static void pyramid_Reverse() {

		for (int y = 10; y >= 1; y--) {

			for (int x = 1; x <= y; x++) {

				System.out.print(x + " ");
			}

			System.out.println();
		}

		System.out.println("=============================================");
	}

	public static void pyramid_ABC() {

		char z = 'A';

		for (int y = 1; y <= 6; y++) {

			for (int x = 1; x <= y; x++) {

				System.out.print(z + "\t");
			}

			z++;
			System.out.println();
		}
		System.out.println("=============================================");
	}

	public static void ninenine_Forwhile() {

		int x, total;

		for (int y = 1; y <= 9; y++) {

			x = 1;
			while (x <= y) {
				total = y * x;
				System.out.print(x + " * " + y + " = " + total + "\t");
				x += 1;
			}
			System.out.println();
		}

		System.out.println("=======================");
	}

	public static void ninenine_Fordowhile() {

		int x, total;

		for (int y = 1; y <= 9; y++) {

			x = 1;
			do {
				total = y * x;
				System.out.print(y + " * " + x + " = " + total + "\t");
				x++;
			} while (x <= 9);
			System.out.println();
		}

		System.out.println("=======================");
	}
	
	public static void ninenine_Whiledowhile() {
		
		int y = 1;
		int x, total;

		while (y <= 9) {

			x = 1;
			do {
				total = x * y;
				System.out.print(x + " * " + y + " = " + total + "\t");
				x++;
			} while (x <= 9);
			y++;
			System.out.println();
		}
		
	}

}
