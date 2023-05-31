package day230531;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2525 {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken()); // A는 시간
			int B = Integer.parseInt(st.nextToken()); // B는 분
			int C = Integer.parseInt(br.readLine()); // C는 걸리는 시간 (+)
			if ((B + C) / 60 > 0) {
				int overHour = (B + C) / 60;
				B = (B + C) - (60 * overHour);
				A = A + overHour;
				if (A >= 24) {
					A = A - 24;
				}
			} else {
				B = B + C;
			}
			bw.write(A + " " + B);
			bw.newLine();
			bw.flush();
		}
	}
}
