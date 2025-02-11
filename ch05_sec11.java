package practice_jn;

/**
 * class Name   : ch05_sec11
 * Author       : JINA
 * Created Date : 2025. 2. 11.
 * version      : 1.0
 * Purpose      : java 복습
 * Description  : main() 메소드의 String[] 매개변수 용도 연습 예제
 */

public class ch05_sec11 {
	
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result); 
	}
}
