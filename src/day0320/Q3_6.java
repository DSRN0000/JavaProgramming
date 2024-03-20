package day0320;

import java.util.Scanner;

public class Q3_6 {
	 public static boolean isInteger(String str) {
	        try {
	            Integer.parseInt(str); // 정수로 변환을 시도
	            return true; // 변환이 성공하면 true 반환
	        } catch (NumberFormatException e) {
	            return false; // 변환이 실패하면 false 반환
	        }
	 }

	public static void main(String[] args) {
		int sum = 0;

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료. 숫자 입력 시 합 출력 후 종료.");
		while(true) {
			System.out.print(">>");
			String text = sc.nextLine();
			sc.close();
			String[] list = text.split(" ");
			if(text.equals("exit")) {
				break;
			}else {
				for (String i : list) {
					if (isInteger(i)) {
						sum += Integer.parseInt(i);
					}else {
						break;
					}

				}
				System.out.println(sum);
				break;
			}
		}
	}
}
