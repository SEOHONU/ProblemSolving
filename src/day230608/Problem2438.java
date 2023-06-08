package day230608;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2438 {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int N = Integer.parseInt(br.readLine());
			for (int i = 1; i <= N; i++) {
				for (int n = 0; n < i; n++) {
					bw.write("*");
				}
				bw.newLine();
			}
			bw.flush();
		}
	}
}
