package hw6;

import java.util.Scanner;

public class Calculator {
	private int x;
	private int y;
	
	public void setX(int x) throws CalException{
		Scanner sc = new Scanner(System.in);
		if(!sc.hasNextInt()) {
			throw new CalException("請輸入數字");
		}
		else if(x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		}
		else {
			this.x = x;
		}
	}
	
	public int getX() {
		return x;
	}
	
	public void getY(int y) throws CalException{
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		}else if(y < 0){
			throw new CalException("次方為負值，結果不回傳為整數");
		}
		else {
			this.y = y;
		}
	}
	
	public int getY() {
		return y;
	}
	
	public Calculator() {
		
	}
	
	public Calculator(int x , int y) throws CalException{
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		}else if(y < 0){
			throw new CalException("次方為負值，果不回傳為整數");
		}
		else {
			this.x = x;
			this.y = y;
		}
	}
	
	public int getPow() throws CalException {
		if (y < 0) {
            throw new CalException("次方為負值，結果不會是整數");
        }
        return (int) Math.pow(x, y);
	}
}
