package day0508;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileHandling06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File(
				"C:\\LeeKangHyeon\\myStudy\\WKU\\FullStackAcademy\\Java\\fullStackClass\\src\\day0508\\member.txt");

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String str;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

			fr.close();
			System.out.println("파일 읽기 성공");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
