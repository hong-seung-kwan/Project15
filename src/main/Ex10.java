package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

// 보조 스트림
public class Ex10 {

	public static void main(String[] args) {

		// 입력 스트림 생성 (기반 스트림)
		try {
			FileInputStream fis = new FileInputStream("reader.txt");

			while (true) {
				int i = fis.read();
				if (i == -1) {
					break;
				}
				System.out.println(i + " ");
			}
			// 바이트 스트림은 한글을 읽을 수 없다

			// 기반 스트림 생성
			FileInputStream fis2 = new FileInputStream("reader.txt");
			// 보조 스트림 생성
			// 보조 스트림 생성시 기반스트림 입력
			// 보조 스트림은 기반 스트림 없이 생성 불가
			InputStreamReader streamReader = new InputStreamReader(fis2);

			while (true) {
				int i = streamReader.read();
				if (i == -1) {
					break;
				}
				System.out.print((char) i + " ");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 바이트 스트림은 한글을 읽을 수 없다
		// 하지만 보조 스트림을 이용하면 한글을 읽을 올 수 있다
	}

}
