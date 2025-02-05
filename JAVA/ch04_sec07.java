package practice_jn;

/**
 * class Name   : ch04_sec07
 * Author       : JINA
 * Created Date : 2025. 2. 5.
 * version      : 1.0
 * Purpose      : java 복습
 * Description  : break 라벨 연습 예제
 */

public class ch04_sec07 {
	
	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
