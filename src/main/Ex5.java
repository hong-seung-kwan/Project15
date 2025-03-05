package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 바이트 스트림 - 배열 읽기
public class Ex5 {

	public static void main(String[] args) {
		
		try {
			// 입력 스트림 생성
			FileInputStream stream = new FileInputStream("input3.txt");
			
			byte[] arr = new byte[10];
			
			int size = 0;
			
			while(true) {
				// 배열을 사용하여 데이터 한번에 읽어오기
				// 배열의 크기만큼 데이터를 읽어올 수 있음
				size = stream.read(arr);
				
				if(size == -1) { // 파일에 끝에 도달하면 종료
					break;
				}
				// 배열에 담겨있는 문자를 하나씩 출력
				for(int i = 0; i < size; i ++) { // 읽어온 크기만큼 (size)
					System.out.print((char)arr[i]+ " ");
				}
				System.out.println(": " + size + "바이트 읽음");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
