package practice;

/**
 * class Name   : ch04_sec02
 * Author       : JINA
 * Created Date : 2025. 2. 4.
 * version      : 1.0
 * Purpose      : java if문 복습
 * Description  : if문 + 랜덤뽑기
 */
public class ch04_sec02 {
	
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학정: " + grade);
		
	}

}
