package main;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

// 문자 단위 스트림 - Reader (입력스트림)
public class Ex8 {

	public static void main(String[] args) throws IOException {

//		FileInputStream stream = new FileInputStream("reader.txt");
//		
//		while(true) {
//			int i = stream.read();
//			if(i == -1) {
//				break;
//			}
//			System.out.println((char)i);
//		}
		// 바이트 스트림은 한글을 읽어 올 수 없다

		FileReader reader = new FileReader("reader.txt");

		while (true) {
			int i = reader.read();
			if (i == -1) {
				break;
			}
			System.out.print((char) i);
		}
		// 문자스트림은 2바이트씩 데이터를 처리하여 한글을 읽을 수 있다

	}

}
