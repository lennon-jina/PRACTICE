package practice_jn;

/**
 * class Name   : ch05_q08
 * Author       : JINA
 * Created Date : 2025. 2. 11.
 * version      : 1.0
 * Purpose      : java 확인문제
 * Description  : 전체합과 평균 구하기
 */
public class ch05_q08 {
	
	public static void main(String[] args) {
		
		 int[][] array = { 
				 {95, 86},
				  {83, 92, 96},
				  {78, 83, 93, 87, 88}
				  };
		 
				 int sum = 0;
				 double avg = 0.0;
				 
				 int count = 0;
				 for(int i=0; i<array.length; i++) {
					 for(int j=0; j<array[i].length; j++) {
						sum += array[i][j];
						count++;
					 }
				}
				avg = (double) sum / count;
				  
				System.out.println("sum: " + sum);
				System.out.println("avg: " + avg);
	}

}
