package homework;

import java.util.Random;
import java.util.Scanner;

public class Report1 {

	public static void main(String[] args) {
		int n = 1;
		int start = 0, end = 99;
		Random ran = new Random();
		int random = ran.nextInt(100); //0 ~ 99까지 랜덤값 생성
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 결정했습니다. 맞추어 보세요");
		System.out.println(start + "-" + end);
		
		while(true) {
			System.out.print(n + ">>");
			int num = sc.nextInt();
			
			if (num == random) {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				String contin = sc.next();
				// charAt으로 하나 받아서 오기 그리고 맞는지 비교
				if (contin.equals("y")) {
					continue;
				}else if (contin.equals("n")){
					break;
				}
			}else if (num < random){
				int tmp = start;
				start = num;
				System.out.println("더 높게");
				System.out.println(start + "-" + end);
			}else {
				int tmp2 = end;
				end = num;
				System.out.println("더 낮게");
				System.out.println(start + "-" + end);
			}
		}

	}

}
