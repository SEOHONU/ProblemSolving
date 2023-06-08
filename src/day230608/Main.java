package day230608;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int N = Integer.parseInt(br.readLine());
			int T = 1;
			for (int i = 0; i < N; i++) {
				for (int t = 0; t < (N - T); t++) {
					bw.write(" ");
				}
				for (int n = 1; n <= i + 1; n++) {
					bw.write("*");
				}
				bw.newLine();
				T = T + 1;
			}
			bw.flush();
		}
	}
}
