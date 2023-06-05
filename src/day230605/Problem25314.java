package day230605;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem25314 {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			String result = "";
			int N = Integer.parseInt(br.readLine());
			N = N / 4;
			for (int i = 0; i < N; i++) {
				result = result + "long ";
			}
			bw.write(result + "int\n");
			bw.flush();
		}
	}
}
