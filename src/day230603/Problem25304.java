//입력
//첫째 줄에는 영수증에 적힌 총 금액 
//X가 주어진다.
//
//둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 
//N이 주어진다.
//
//이후 
//N개의 줄에는 각 물건의 가격 
//a와 개수 
//b가 공백을 사이에 두고 주어진다

//출력
//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 
//일치하지 않는다면 No를 출력한다.

package day230603;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25304 {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int X = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				X = X - (a * b);
			}
			if (X == 0) {
				bw.write("Yes");
			} else {
				bw.write("No");
			}
			bw.newLine();
			bw.flush();
		}
	}
}
