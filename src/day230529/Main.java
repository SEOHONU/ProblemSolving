package day230529;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			int result = (x > 0 && y > 0) ? 1 : (x < 0 && y > 0) ? 2 : (x < 0 && y < 0) ? 3 : (x > 0 && y < 0) ? 4 : 0;
			bw.write(result + "\n");
			bw.flush();
		}
	}
}
