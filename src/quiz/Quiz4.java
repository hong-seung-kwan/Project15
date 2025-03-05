package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz4 {

	public static void main(String[] args) {

		try {
			FileOutputStream stream = new FileOutputStream("quiz4.txt");

			for (int i = 65; i <= 90; i++) { // 65(a) ~ 90(z)
				stream.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}