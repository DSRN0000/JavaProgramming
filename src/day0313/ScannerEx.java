package day0313;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("이름은 " + name + ", ");
		
		String city = sc.next();
		System.out.println("도시는 " + name + ", ");
		
		int age = sc.nextInt();
		System.out.println("나이는 " + age + "살");
		
		double weight = sc.nextDouble();
		System.out.println("체중은 " + weight + "kg");
		
		boolean isSingle  = sc.nextBoolean();
		System.out.println("독신 여부는 " + isSingle + "입니다.");
		sc.close();
	}

}
