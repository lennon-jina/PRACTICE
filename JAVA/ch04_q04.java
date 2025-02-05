package practice_jn;

/**
 * class Name   : ch04_q04
 * Author       : JINA
 * Created Date : 2025. 2. 5.
 * version      : 1.0
 * Purpose      : java 확인문제
 * Description  : while문으로 주사위 눈의 합이 5가 되게 하기
 */

public class ch04_q04 {
	
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if( (num1+num2) == 5) {
				break;
			}
			
		}
	
	}

}
