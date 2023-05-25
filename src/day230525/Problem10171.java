package day230525;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Problem10171 {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			bw.write("\\    /\\\n");
			bw.write(" )  ( ')\n");
			bw.write("(  /  )\n");
			bw.write(" \\(__)|");
			bw.flush();
		}
	}
}
