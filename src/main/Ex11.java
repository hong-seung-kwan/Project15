package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 보조 스트림
public class Ex11 {

	public static void main(String[] args) throws IOException {
		
		// 파일 복사하여 걸린 시간 측정하기
		
		long start = 0; // 시작 시간
		long end = 0; // 종료 시간
		
	
			FileInputStream inputStream = new FileInputStream("a.txt");
			FileOutputStream outputStream = new FileOutputStream("copy.txt");
			
			// 복사를 시작하는 시간
			start = System.currentTimeMillis(); // 현재시간은 ms단위로 반환
			// 복사 시작
			while(true) {
				int i = inputStream.read();
				if(i == -1) {
					break;
				}
				outputStream.write(i);
			}
			
			end = System.currentTimeMillis();
			
			long time = end - start; // 소요 시간
			System.out.println("파일을 복사하는데 " + time/1000 + " s가 소요되었습니다");
			
			// 기반 스트림만 사용하여 파일을 복사하면 16초가 걸림
	}

}
