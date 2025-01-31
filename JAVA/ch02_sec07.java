package practice;

/**
 * class Name   : ch02_sec07
 * Author       : JINA
 * Created Date : 2025. 1. 31.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : 자동 타입 변환 복습
 */
public class ch02_sec07 {
	
	public static void main(String[] args) {
		
		// 자동 타입 변환
		byte bytevValue = 10;
		int intValue = bytevValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:" + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}
	
}
