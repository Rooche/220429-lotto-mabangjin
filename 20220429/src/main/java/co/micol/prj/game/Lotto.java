package co.micol.prj.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lotto {

	public void logame() {
		List<Integer[]> list = new ArrayList<Integer[]>();
		
		Scanner lsc = new Scanner(System.in);
		System.out.println("로또 게임을 시작합니다");
		System.out.println("금액을 입력해주세요");
		int won = lsc.nextInt();
		lsc.nextLine();
		
		int[] lottoNum = new int[6];
		int money = won/1000;
		for(int k = 0; k < money; k++) {
			
		}

		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lottoNum);

	}

	public void run() {
		System.out.println("로또게임");
	}

}
