package day230525;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			int score = Integer.parseInt(br.readLine());
			String rank = (90 <= score && score <= 100) ? "A"
					: (80 <= score && score <= 89) ? "B"
							: (70 <= score && score <= 79) ? "C" : (60 <= score && score <= 69) ? "D" : "F";
			bw.write(rank);
			bw.flush();
			// if (90 <= score && score <= 100) {
			// bw.write("A");
			// } else if (80 <= score && score <= 89) {
			// bw.write("B");
			// } else if (70 <= score && score <= 79) {
			// bw.write("C");
			// } else if (60 <= score && score <= 69) {
			// bw.write("D");
			// } else {
			// bw.write("F");
			// }
		}
	}
}
