package quiz;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz6 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("quiz6.txt");
			for (int i = 2; i < 10; i++) { // 단 2~9
				for (int j = 1; j < 10; j++) { // 곱하는 수 1~9
					writer.write(i + "*" + j + "=" + (i * j) + '\n');
				}
				writer.write("\n");
			}
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}