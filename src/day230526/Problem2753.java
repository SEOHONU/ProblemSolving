package day230526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2753 {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int year = Integer.parseInt(br.readLine());
			int result = 0;
			if (year % 4 == 0) {
				result = 0;
				if (year % 100 != 0) {
					result = 1;
				}
			}
			if (year % 400 == 0) {
				result = 1;
			}
			bw.write(result + "\n");
			bw.flush();
		}
	}
}
