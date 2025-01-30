package practice;

import java.lang.foreign.ValueLayout;
import java.util.Scanner;

public class Result01 {

	public static void main(String[] args) {
		
		// Q.01 문제 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>>");
		String userScore1 = scan.nextLine();
		int score1 = Integer.parseInt(userScore1);
		String grade1 = (score1 >= 90) ? "A" :
            (score1 >= 80) ? "B" :
            	(score1 >= 70 ? "C":"D");
		
		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>>");
		String userScore2 = scan.nextLine();
		int score2 = Integer.parseInt(userScore2);
		String grade2 = (score2 >= 90) ? "A" :
            (score2 >= 80) ? "B" :
            	(score2 >= 70 ? "C":"D");
		
		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>>");
		String userScore = scan.nextLine();
		int score3 = Integer.parseInt(userScore);
		String grade3 = (score3 >= 90) ? "A" :
            (score3 >= 80) ? "B" :
            	(score3 >= 70 ? "C":"D");
		
		System.out.println("평균 : " + (score1 + score2 + score3)/3);
		
		int value = (score1 + score2 + score3)/3;
		String grade4 = (value >= 90) ? "A" : 
			(value >= 80) ? "B" :
            	(value >= 70 ? "C":"D");
		System.out.println("등급 : " + grade4);
		
		
		// Q.02
		// for문을 사용해서 10 팩토리얼의 값을 출력해주세요
		int fac1 = 1;
		for(int i = 1 ; i <= 10; i++) {
			fac1 = fac1 * i;
			System.out.println("결과 : " + fac1);
			}
		
		// for문을 사용해서 15 팩토리얼의 값을 출력해주세요
				long fac2 = 1;
				for(long i = 1 ; i <= 15; i++) {
					fac2 = fac2 * i;
					System.out.println("결과 : " + fac2);
					}
	}

}
