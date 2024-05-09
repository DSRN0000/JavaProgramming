package day0508;

import java.io.File;
import java.io.FileOutputStream;

public class FileHandling02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(
				"C:\\LeeKangHyeon\\myStudy\\WKU\\FullStackAcademy\\Java\\fullStackClass\\src\\day0508\\gugudan.txt");
		try {
			if (!file.exists())
				file.createNewFile();

			FileOutputStream fos = new FileOutputStream(file);

			for (int x = 2; x <= 9; x++) {
				for (int y = 0; y < 9; y++) {
					String str = x + " X " + y + " = " + (x + y) + "\n";
					byte[] b = str.getBytes();
					fos.write(b);
				}
			}
			fos.close();
			System.out.println("파일 쓰기 성공");
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
