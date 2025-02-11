package practice_jn;

import java.io.InterruptedIOException;

/**
 * class Name   : ch05_sec09
 * Author       : JINA
 * Created Date : 2025. 2. 11.
 * version      : 1.0
 * Purpose      : java 복습
 * Description  : 배열 복사 연습 예제
 */
public class ch05_sec09 {
	
	public static void main(String[] args) {
		// 길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		// 길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		// 배열 항목 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// 배열 항목 출력
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}
	}

}
