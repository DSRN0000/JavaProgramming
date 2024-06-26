package day0508;

import java.io.File;

public class FileHandling01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File finfo = new File("C:\\LeeKangHyeon\\myStudy\\WKU\\FullStackAcademy\\Java\\fullStackClass");

		if (finfo.exists()) {
			System.out.println("파일의 이름: " + finfo.getName());
			System.out.println("파일의 경로: " + finfo.getAbsolutePath());
			System.out.println("파일이 쓰기 가능한가?: " + finfo.canWrite());
			System.out.println("파일이 읽기 가능한가?: " + finfo.canRead());
			System.out.println("파일의 크기: " + finfo.length());
		} else {
			System.out.println("존재하는 파일이 아닙니다.");
		}

	}

}
