package day230515;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		if(a >= -10000 && a <= 10000 && b >=-10000 && b <= 10000) {
			if(a < b) {
				System.out.println("<");
			}else if(a > b) {
				System.out.println(">");
			}else {
				System.out.println("==");
			}
		}
	}
}
