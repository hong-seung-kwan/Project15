package main;

public class Factorial {

	public static void main(String[] args) {
		
		int result = factorial(5);
		System.out.println(result);

	}
	
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n-1); // 자기자신 호출(재귀...함수)
		}
	}


	// 함수는 가장 먼저 호출된 함수가 가장 마지막에 끝난다
	// 함수는 가장 나중에 호출된 함수가 제일 먼저 끝난다
	// 함수호출 순서
	// factorial(5)
	// 5 * factorial(4)
	// 5 * 4 * factorial(3)
	// 5 * 4 * 3 * factorial(2)
	// 5 * 4 * 3 * 2 * factorial(1)
	// 5 * 4 * 3 * 2 * 1
	// 함수가 끝나는 순서
	// factorial(1) > factorial(2) > factorial(3) >factorial(4) >factorial(5)
}
