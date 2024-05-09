package day0508;

import java.io.File;
import java.io.FileWriter;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File(
					"C:\\LeeKangHyeon\\myStudy\\WKU\\FullStackAcademy\\Java\\fullStackClass\\src\\day0508\\example03.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter mywriter = new FileWriter(file);

			mywriter.write("Hello\n");
			mywriter.write("Java Programming \n");
			mywriter.close();

			System.out.println("\n파일 쓰기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
