package day230620;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10871 {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			StringTokenizer nx = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(nx.nextToken());
			int X = Integer.parseInt(nx.nextToken());
			StringTokenizer numbers = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(numbers.nextToken());
			}
			for (int i = 0; i < N; i++) {
				if (arr[i] < X) {
					bw.write(arr[i] + " ");
				}
			}
			bw.flush();
		}
	}
}
