package day230519;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem18108 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int y = Integer.parseInt(br.readLine());
		bw.write(y - 543 + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}
