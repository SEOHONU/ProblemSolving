package day230602;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem8393 {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			int result = 0;
			int n = Integer.parseInt(br.readLine());
			for (int i = 1; i <= n; i++) {
				result = result + i;
			}
			bw.write(result + "\n");
			bw.flush();
		}
	}
}
