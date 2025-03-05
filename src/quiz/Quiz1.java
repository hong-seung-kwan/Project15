package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		arr[0] = scanner.nextInt();
		arr[1] = scanner.nextInt();
		arr[2] = scanner.nextInt();
		arr[3] = scanner.nextInt();
		arr[4] = scanner.nextInt();

		System.out.println("배열: " + Arrays.toString(arr));

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("숫자 5개의 합은 " + sum + "입니다");

	}

}
