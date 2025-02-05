package practice;

import java.util.Scanner;

/**
 * class Name   : ch04_sec06
 * Author       : JINA
 * Created Date : 2025. 2. 5.
 * version      : 1.0
 * Purpose      : java 복습
 * Description  : do-while 연습 예제
 */

public class ch04_sec06 {
	
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q") );
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
