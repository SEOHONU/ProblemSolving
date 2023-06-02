package day230602;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2739 {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			int N = Integer.parseInt(br.readLine());
			for (int i = 1; i <= 9; i++) {
				bw.write(N + " * " + i + " = " + N * i);
				bw.newLine();
			}
			bw.flush();
		}
	}
}
