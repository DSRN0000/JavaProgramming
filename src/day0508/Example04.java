package day0508;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class Example04 {

	public static void main(String[] args) {
		try {
			File file = new File(
					"C:\\LeeKangHyeon\\myStudy\\WKU\\FullStackAcademy\\Java\\fullStackClass\\src\\day0508\\example03.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileInputStream fi = new FileInputStream(file);
			int i = 0;

			while ((i = fi.read()) != -1) {
				System.out.print((char) i);
			}

			fi.close();
			System.out.println("파일 읽기 성공");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
