package day230620;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
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

// �Է�
// ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
//
// ��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
//
// ���
// X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
//
// 10 5
// 1 10 4 9 2 3 8 5 7 6 	
//
// 1 4 2 3