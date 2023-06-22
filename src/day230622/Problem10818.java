package day230622;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10818 {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			bw.write(arr[0] + " " + arr[N - 1]);
			bw.flush();
		}
	}
}
//����
//N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. 
//��° �ٿ��� N���� ������ �������� �����ؼ� �־�����.
//��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
//
//���
//ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
//
//���� �Է� 1 
//5
//20 10 35 30 7
//
//���� ��� 1 
//7 35

//�����Ʈ - �ð��ʰ�
//for (int i = 0; i < N - 1; i++) {
//	for (int j = 0; j < N - 1; j++) {
//		if (arr[j] > arr[j + 1]) {
//			int temp = arr[j];
//			arr[j] = arr[j + 1];
//			arr[j + 1] = temp;
//		}
//	}
//}
//- Arrays.sort() �޼��尡 �ִ��� ������.... Bubble Sort�� Ǯ���µ�....