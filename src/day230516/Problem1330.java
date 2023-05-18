package day230516;

import java.util.Scanner;

public class Problem1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}
	// se.nextLine();은 한 줄 전체를 읽는 메서드이기 때문에,
	// 문제에서 제시한 입력 기준 (공백 한칸으로 구분된 두 개의 정수)로는 NumberFormatException이 발생하게 된다.
	// *입력,출력은 Scanner보다 BufferedReader, BufferedWriter가 더 빠르다.
}
