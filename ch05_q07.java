package practice_jn;

/**
 * class Name   : ch05_q07
 * Author       : JINA
 * Created Date : 2025. 2. 11.
 * version      : 1.0
 * Purpose      : java 확인문제
 * Description  : 최대값 출력하기
 */
public class ch05_q07 {
	
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2};
		
		for(int i=0; i < array.length; i++) {
			if(max<array[i]) {
			max = array[i];
			}
		}
		System.out.println("최대값은 : " + max);
	}

}
