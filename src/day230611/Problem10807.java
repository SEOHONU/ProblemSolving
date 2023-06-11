package day230611;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10807 {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int N = Integer.parseInt(br.readLine());
			int[] array = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < N; i++) {
				array[i] = Integer.parseInt(st.nextToken());
			}
			int v = Integer.parseInt(br.readLine());
			int count = 0;
			for (int i = 0; i < N; i++) {
				if (array[i] == v) {
					count = count + 1;
				}
			}
			bw.write(count + "\n");
		}
	}
}
