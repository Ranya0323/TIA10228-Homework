package hw4;
import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		LeapYear now = new LeapYear();
		Scanner input = new Scanner(System.in);
		
		System.out.print("請輸入西元幾年(yyyy) :");
		int allyear = input.nextInt();
		
		System.out.print("請輸入西元幾月(mm) :");
		int allmonth = input.nextInt();
		
		System.out.print("請輸入西元幾日(dd) :");
		int allday = input.nextInt();

		now.yearMonthDay(allyear, allmonth, allday);
		
	}
	
	public void yearMonthDay(int a, int b, int c) {

		Homework4 y = new Homework4();
		int year = 0;
		year = y.leapYear(a);
		int sum = 0;
		sum = y.sumDay(year, b, c);
		
		if (b == 2 && c > 28 && year == 365) {
			System.out.println("非閏年 2月不可以超過28天");
		}
		
		else if ( (b == 4 || b == 6 || b == 9 || b == 11) && (year == 365 || year == 366) && c > 30){
			
			System.out.println("2 4 6 9 11月不可以超過30天");
		}
		else if(b == 2 && c > 29 && year == 366) {
			System.out.println("閏年 2月不可以超過29天");
		}
		else if((b == 1 || b == 3 || b == 5 || b == 7 || b == 8
				|| b == 10 || b == 12) && (year == 365 || year == 366) && c > 31) {
			System.out.println("1 3 5 7 8 10 12月不可以超過30天");
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
	
	
	
}
