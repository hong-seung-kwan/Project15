package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 보조 스트림
public class Ex12 {

	public static void main(String[] args) throws IOException {
		
		// 보조 스트림을 사용하여 파일 복사하기
		
		long start = 0;
		long end = 0;
		FileInputStream inputStream = new FileInputStream("a.txt");
		FileOutputStream outputStream = new FileOutputStream("copy2.txt");
		
		// 보조 스트림
		// 보조 스트림은 기반 스트림 없이 생성할 수 없다
		// Buffered~ 보조스트림: 내용을 8kb씩 한번에 가져옴
		BufferedInputStream bis = new BufferedInputStream(inputStream);
		BufferedOutputStream bos = new BufferedOutputStream(outputStream);
		
		// 복사를 시작하는 시간 저장
		start = System.currentTimeMillis();
		
		while(true) {
			int i = bis.read(); // a.txt에서 내용을 읽고
			if(i == -1) {
				break;
			}
			bos.write(i); // copy2.txt.에 내용을 쓰기
		}
		end = System.currentTimeMillis();
		long time = end - start;
		
		System.out.println("파일을 복사하는데 " + time/1000.0 + " 초가 걸렸습니다");
		
		// 보조스트림을 사용하여 파일을 복사하는데 0.04초가 걸림
		// 왜? 데이터를 한번에 읽고 쓰기때문에 파일을 왔다갔다하는 횟수가 적음
	}

}
