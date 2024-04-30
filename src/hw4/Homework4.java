package hw4;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Homework4 hw = new Homework4();

		hw.avgAndmax();

		hw.reverseString();

		hw.planet();

		Scanner input = new Scanner(System.in);
		System.out.print("請輸入想要借多少錢? :");
		int x = input.nextInt();
		hw.borrowMoney(x);
		
		
		// 程式碼太長了 想看仔細自己去LeapYear看
		System.out.print("請輸入西元幾年(yyyy) :");
		int allyear = input.nextInt();
		System.out.print("請輸入西元幾月(mm) :");
		int allmonth = input.nextInt();
		System.out.print("請輸入西元幾日(dd) :");
		int allday = input.nextInt();

		hw.yearMonthDay(allyear, allmonth, allday);
		
		

	}
//	===============================================================
	public void avgAndmax() {

		double[] data = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		double sum = 0;

		for (int i = 0; i < data.length; i++) {

			sum += data[i];
		}
		double avg = sum / data.length;

		System.out.printf("陣列元素的平均值為 %.1f \n", avg);

		System.out.println("大於平均數的元素有 :");

		for (int j = 0; j < data.length; j++) {

			if (data[j] > avg) {
				System.out.print(data[j] + "\t");
			}
		}
		System.out.println();
		System.out.println("==================================");
	}

//  參考來源 https://code101.app/docs/algo/string/string-reverse
	public void reverseString() {

		String s = "Hello World";
		String reverse = "";
		System.out.println("Hello World相反為 :");
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i); // charAt() 是 Java 字串類 (String) 的一個方法，用於獲取字串中指定索引位置的字符
		}

		System.out.println();
		System.out.println(reverse);

//		下面的也可以 笑死超簡短 來源同個網站
		StringBuilder sb = new StringBuilder(s);
//		reverse() 是跟 StringBuilder同為 Java套件裡的東西
		sb.reverse();
		String changeString = sb.toString();
		System.out.println(changeString);

		System.out.println("==================================");
	}
	
//	同上 直接轉成字串做比對 https://code101.app/docs/algo/string/string-reverse

	public void planet() {

		String[] data = { "mercury", "venus", "earth", "marth", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';

		for (int j = 0; j < data.length; j++) {

			String stringData = data[j]; // 剛剛好上一題 可以用charAt()比對字串 反正結果也不用輸出陣列 就把內容轉成字串了

			for (int k = 0; k < stringData.length(); k++) {
				char check = stringData.charAt(k);
				if (check == a || check == e || check == i || check == o || check == u) {
					count++;
				}

			}
		}
		System.out.printf("行星字串陣列裡面總共有 : %d 個母音 \t \n", count);
		System.out.println("==================================");
	}
	
//  借錢===============================================================

	public void borrowMoney(int x) {
		int[][] data = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };

		if (x < 2500) {

			System.out.print("可以找員工編號 ");

			for (int r = 0; r < data.length; r++) {

				if (x <= data[r][1]) {
					System.out.print(data[r][0] + " ");
				}
			}

			System.out.println("借錢");
		}

		else {
			System.out.println("金額太大 沒人可以借");
		}

		System.out.println("==============================");
	}
	
//  幾年幾月 太長了 所以想看去LeapYear看================================================

	public void yearMonthDay(int a, int b, int c) {

		Homework4 y = new Homework4();
		int year = 0;
		int month = 0;
		int day = c;
		year = y.leapYear(a);
		int sum = 0;
		sum = y.sumDay(year, b, c);
		
		if (b == 2 && c > 28 && year == 365) {
			System.out.println("非閏年 2月不可以超過28天");
		}
		
		else if ( (b == 4 || b == 6 || b == 9 || b == 12) && (year == 365 || year == 366) && c > 30){
			
			System.out.println("2 4 6 9 12月不可以超過30天");
		}
		else if(b == 2 && c > 29 && year == 366) {
			System.out.println("閏年 2月不可以超過29天");
		}
		else {
			System.out.printf("輸入的日期為該天該年的第 %d 天 \n", sum);
		}
		
	}

	public int leapYear(int a) {
		if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
			return 366;
		} else {
			return 365;
		}
	}
	
	public int sumDay(int year, int b,int c) {
		
		int sum = c;
		
		for (int i = 1; i < b; i++) {
			if (i == 2 && year == 366) {
				sum += 29;
			} else if (i == 2 && year == 365) {
				sum += 28;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				sum += 30;
			}
			else {
				sum += 31;
			}
		}
		return sum;
	}
	
//	===============================================================
	
	
}
