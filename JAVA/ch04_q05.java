package practice_jn;

/**
 * class Name   : ch04_q05
 * Author       : JINA
 * Created Date : 2025. 2. 5.
 * version      : 1.0
 * Purpose      : java 확인문제
 * Description  : 중첩 for문 응용 문제
 */

public class ch04_q05 {

	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			for(int y=1; y <=10; y++) {
				if( (4*x + 5*y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
	
}
