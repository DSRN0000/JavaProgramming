package report2;

import java.util.Scanner;

class Player {
	private String name;
	private String word;
	
	Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getWord() {
		return word;
	}
	
	void getWordFromUser() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(name + ">>");
		word = sc.next();
	}
	boolean checkSucess(String word) {
		
		if(word.charAt(word.length()-1)== this.word.charAt(0)) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class ex_20212189 {
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int member = sc.nextInt();
		Player []p = new Player[member];
		
		for (int i = 0; i < member; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String playerName = sc.next();
			p[i] = new Player(playerName);
		}
		
		System.out.println("시작하는 단어는 아버지입니다");
		String w = "아버지";
		int i = 0;
		
		while(true) {
			if (i == member) {
				i = 0;
			}
			p[i].getWordFromUser();
			boolean b = p[i].checkSucess(w);

			if (b == false) {
				System.out.println(p[i].getName() + "이 졌습니다.");
				break;
			}
			w = p[i].getWord();
			i++;
		}
	}

	public static void main(String[] args) {
		ex_20212189 start = new ex_20212189();
		start.run();
	}
}
