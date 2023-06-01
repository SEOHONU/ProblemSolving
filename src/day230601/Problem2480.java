package day230601;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2480 {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int dice1 = Integer.parseInt(st.nextToken());
			int dice2 = Integer.parseInt(st.nextToken());
			int dice3 = Integer.parseInt(st.nextToken());
			int prize = 0;
			if (dice1 == dice2 && dice2 == dice3) {
				// System.out.println("case1");
				prize = 10000 + dice1 * 1000;
			} else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
				// System.out.println("case2");
				if (dice1 == dice2) {
					// System.out.println("case2-1");
					prize = 1000 + dice1 * 100;
				} else if (dice2 == dice3) {
					// System.out.println("case2-2");
					prize = 1000 + dice2 * 100;
				} else if (dice1 == dice3) {
					// System.out.println("case2-3");
					prize = 1000 + dice3 * 100;
				}
			} else {
				// System.out.println("case3");
				int dice = Math.max((Math.max(dice1, dice2)), dice3);
				prize = dice * 100;
			}
			bw.write(Integer.toString(prize));
			bw.newLine();
			bw.flush();
		}
	}
}

//1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
//
//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
//예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
//또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
//3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
//
//입력
//첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
//예제 입력 1 
//3 3 6
//
//출력
//첫째 줄에 게임의 상금을 출력 한다.
//
//예제 출력 1 
//1300
