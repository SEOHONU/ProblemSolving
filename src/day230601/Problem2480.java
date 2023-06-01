package day230601;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2480 {
	public static void main(String[] args) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int dice1 = Integer.parseInt(st.nextToken());
			int dice2 = Integer.parseInt(st.nextToken());
			int dice3 = Integer.parseInt(st.nextToken());
			int prize = 0;
			if (dice1 == dice2 && dice2 == dice3) {
				// System.out.println("case1");
				prize = 10000 + dice1 * 1000;
			} else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
				// System.out.println("case2");
				if (dice1 == dice2) {
					// System.out.println("case2-1");
					prize = 1000 + dice1 * 100;
				} else if (dice2 == dice3) {
					// System.out.println("case2-2");
					prize = 1000 + dice2 * 100;
				} else if (dice1 == dice3) {
					// System.out.println("case2-3");
					prize = 1000 + dice3 * 100;
				}
			} else {
				// System.out.println("case3");
				int dice = Math.max((Math.max(dice1, dice2)), dice3);
				prize = dice * 100;
			}
			bw.write(Integer.toString(prize));
			bw.newLine();
			bw.flush();
		}
	}
}

//1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�. 
//
//���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
//���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
//��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.  
//���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 1,300���� �ް� �ȴ�.
//�� 3���� ���� 2, 2, 2�� �־����� 10,000+2��1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 
//3���� ���� 6, 2, 5�� �־����� ���� ���� ū ���� 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
//
//3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
//
//�Է�
//ù° �ٿ� 3���� ���� ��ĭ�� ���̿� �ΰ� ���� �־�����.
//���� �Է� 1 
//3 3 6
//
//���
//ù° �ٿ� ������ ����� ��� �Ѵ�.
//
//���� ��� 1 
//1300
