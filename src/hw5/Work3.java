package hw5;

public class Work3 {

	public int maxElement(int [][]x) {
		int maxValue = 0;
		for(int i = 0; i < x.length; i ++) {
			for(int j = 0; j < x[i].length; j++) {
				if (x[i][j] >= maxValue) {
					maxValue = x[i][j];
				}
			}
		}
		return maxValue;
	}
	
	public double maxElement(double [][]x) {
		double maxValue = 0;
		for(int i = 0; i < x.length; i ++) {
			for(int j = 0; j < x[i].length; j++) {
				if (x[i][j] >= maxValue) {
					maxValue = x[i][j];
				}
			}
		}
		return maxValue;
	}
	
}
