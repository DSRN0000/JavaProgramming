package day0508;

import java.io.File;
import java.io.FileReader;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File(
					"C:\\LeeKangHyeon\\myStudy\\WKU\\FullStackAcademy\\Java\\fullStackClass\\src\\day0508\\example03.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileReader fr = new FileReader(file);

			if (file.exists()) {
				System.out.println("파일 읽기 성공");
			} else {
				System.out.println("존재하는 파일이 아닙니다.");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
