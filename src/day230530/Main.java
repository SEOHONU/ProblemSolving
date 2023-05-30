package day230530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if (M - 45 < 0) {
				H = H - 1;
				if (H < 0) {
					H = 23;
				}
				int plus = 60 - 45;
				M = M + plus;
			} else {
				M = M - 45;
			}
			bw.write(H + " " + M + "\n");
			bw.flush();
		}
	}
}
