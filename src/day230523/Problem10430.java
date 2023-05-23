package day230523;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10430 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		if(2 <= A && 2 <= B && 2 <= C && A <= 10000 && B <= 10000 && C <= 10000) {
			bw.write((A + B) % C + "\n");
			bw.write(((A % C) + (B % C)) % C + "\n");
			bw.write((A * B) % C + "\n");
			bw.write(((A % C) * (B % C)) % C + "\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
