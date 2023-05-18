package day230516;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1001 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		if(0 < A && A < 10 && 0 < B && B < 10) {
			bw.write(A - B +"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
