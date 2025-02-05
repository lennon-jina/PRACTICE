package practice_jn;

import java.util.function.BiConsumer;

/**
 * class Name   : ch04_q02
 * Author       : JINA
 * Created Date : 2025. 2. 5.
 * version      : 1.0
 * Purpose      : java 문제풀이
 * Description  : for문 응용문제
 */

public class ch04_q02 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
}
