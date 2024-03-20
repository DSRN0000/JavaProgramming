package day0313;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q1 {
	/**
	 * 10개의 수를 입력 받아서 가장 큰 수를 출력하기
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			li.add(sc.nextInt());
		}
				
		System.out.println(Collections.max(li));
		
		

	
//	
//	Scanner scanner = new Scanner(System.in);
//    int[] numbers = new int[10];
//
//    System.out.println("정수 10개를 입력하세요:");
//
//    // 사용자로부터 10개의 정수 입력 받기
//    for (int i = 0; i < 10; i++) {
//        System.out.print("정수 " + (i + 1) + ": ");
//        numbers[i] = scanner.nextInt();
//    }
//
//    // 가장 큰 수 찾기
//    int max = numbers[0];
//    for (int i = 1; i < 10; i++) {
//        if (numbers[i] > max) {
//            max = numbers[i];
//        }
//    }
//
//    // 결과 출력
//    System.out.println("가장 큰 수는 " + max + "입니다.");
//}
		}

}
