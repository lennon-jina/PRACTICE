package practice;

import java.util.Scanner;

/**
 * class Name   : ch04_sec05
 * Author       : JINA
 * Created Date : 2025. 2. 5.
 * version      : 1.0
 * Purpose      : java 복습
 * Description  : while문 연습 예제
 */

public class ch04_sec05 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) { 
			System.out.println("-------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-------------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("3")) {
				run = false;
			}
		}
		
		
		System.out.println("프로그램 종료");
	}

}
