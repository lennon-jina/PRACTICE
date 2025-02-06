
### 속도 증속, 감속, 그리고 종료
1. 첫번째로 입력을 받을 스캐너를 입력한다다

```js
public class ch04_sec05 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
```

2. 화면에 출력할 메뉴를 생성한다
```js		
	while(run) { 
		System.out.println("-------------------------");
		System.out.println("1. 증속 | 2. 감속 | 3. 중지");
		System.out.println("-------------------------");
		System.out.println("선택: ");
			
		String strNum = scanner.nextLine();
```
3. 속도 식 쓰기
```js			
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
```

## ❓ 헤맸던 부분
```shell
> 어쩌구 저쩢구 어쩌구
> 어쩌구 저쩢구 어쩌구
> 어쩌구 저쩢구 어쩌구
```

## 💯 해결 방안
```shell
> 냐냐냔냐냐냐냐냐냐냔냐냐냐냐냐냐냐ㅑ냐냐
> 냐냐냔냐냐냐냐냐냐냔냐냐냐냐냐냐냐ㅑ냐냐
> 냐냐냔냐냐냐냐냐냐냔냐냐냐냐냐냐냐ㅑ냐냐
> 냐냐냔냐냐냐냐냐냐냔냐냐냐냐냐냐냐ㅑ냐냐
> 냐냐냔냐냐냐냐냐냐냔냐냐냐냐냐냐냐ㅑ냐냐
> 냐냐냔냐냐냐냐냐냐냔냐냐냐냐냐냐냐ㅑ냐냐
> 냐냐냔냐냐냐냐냐냐냔냐냐냐냐냐냐냐ㅑ냐냐
```