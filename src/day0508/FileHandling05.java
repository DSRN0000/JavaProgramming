package day0508;

import java.io.File;
import java.io.FileReader;

public class FileHandling05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File(
				"C:\\LeeKangHyeon\\myStudy\\WKU\\FullStackAcademy\\Java\\fullStackClass\\src\\day0508\\member.txt");

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			FileReader fr = new FileReader(file);
			int i = 0;

			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}

			fr.close();
			System.out.println("파일 읽기 성공");

		} catch (Exception e) {
			e.getMessage();
		}
	}

}
