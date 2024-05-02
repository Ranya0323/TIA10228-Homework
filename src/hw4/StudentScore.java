package hw4;

public class StudentScore {
	public static void main(String[] args) {

		StudentScore show = new StudentScore();		
		show.scoreCompare();
	}
	
	public void scoreCompare() {
		// Y軸為第y次考試 x軸為 第幾個學生
		int[][] data = { 
					{ 10, 35, 40, 100, 90, 85, 75, 70 },
				 	{ 35, 75, 77, 89, 64, 75, 70, 95 }, 
				 	{ 100, 70, 79, 90, 75, 70, 79, 90 },
				 	{ 77, 95, 70, 89, 60, 75, 85, 89 }, 
				 	{ 98, 70, 89, 90, 75, 90 , 89, 90}, 
				 	{ 90, 80, 100, 75, 50, 20 , 99, 75},
};
		//1~8號 幾次最高分
		int [] studentHScore = new int[8];
		
		
		for (int r = 0; r < data.length; r++) {
			
			int maxScore = 0;
			int studentNumber = 0;
			for(int c = 0 ; c < data[r].length; c++) {
				
				if(data[r][c] >= maxScore) {
					maxScore = data[r][c];
					studentNumber = c + 1;
					}
			}
			
			studentHScore[studentNumber - 1]++;
			System.out.printf("第 %d 次考試最高分的同學為 : %d號 分數為: %d \n",r+1, studentNumber ,maxScore);
		}
		
		for(int i = 0 ; i < studentHScore.length; i++) {
			System.out.printf("%d號同學獲得最高分的次數為：%d次\n", i + 1, studentHScore[i]);
		}
		
	}
	
}
