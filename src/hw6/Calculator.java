package hw6;



public class Calculator {
	private int x;
	private int y;
	
	public int powerXY(int x,int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
        }
		else if(y < 0) {
			throw new CalException("次方為負值，結果不會是整數");
		}
		else {return (int) Math.pow(x, y);
		}
	}
	
	
//	public void setX(int x) throws CalException{
//		if(x == 0 && y == 0){
//			throw new CalException("0的0次方沒有意義");
//		}
//		else {
//			this.x = x;
//		}
//	}
//	
//	public int getX() {
//		return x;
//	}
//	
//	public void getY(int y) throws CalException{
//		if (x == 0 && y == 0) {
//			throw new CalException("0的0次方沒有意義");
//		}else if(y < 0){
//			throw new CalException("次方為負值，結果不回傳為整數");
//		}
//		else {
//			this.y = y;
//		}
//	}
//	
//	public int getY() {
//		return y;
//	}
//	
//	public Calculator() {
//		
//	}
//	
//	public Calculator(int x , int y) throws CalException{
//		if (x == 0 && y == 0) {
//			throw new CalException("0的0次方沒有意義");
//		}else if(y < 0){
//			throw new CalException("次方為負值，果不回傳為整數");
//		}
//		else {
//			this.x = x;
//			this.y = y;
//		}
//	}
	
}
