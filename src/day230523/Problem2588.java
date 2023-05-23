package day230523;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2588 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		br.close();
		bw.write(A * (B % 10) + "\n");
		bw.write(A * (B / 10 % 10) + "\n");
		bw.write(A * (B / 100) + "\n");
		bw.write(A * B + "\n");
		bw.flush();
		bw.close();
	}
}
