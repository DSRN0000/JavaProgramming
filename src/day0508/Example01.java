package day0508;

import java.io.File;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileobj = new File(
				"C:\\LeeKangHyeon\\myStudy\\WKU\\FullStackAcademy\\Java\\fullStackClass\\src\\day0508\\example01.txt");
		try {
			boolean success = fileobj.createNewFile();

			if (success) {
				System.out.println("파일 생성 성공");
			} else {
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
