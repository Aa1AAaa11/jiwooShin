package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import common.Solution;

public class Baekjoon_10986 extends Solution {
	
	
	@Override
	public void solution() throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		long[] memo = new long[N]; //  i+1 ��° ���� ���� ��
		int[] mod = new int[M]; //  memo[i] ���� �������� j �� ���� � �ִ���
		
		st = new StringTokenizer(br.readLine());

		memo[0] = Integer.parseInt(st.nextToken());
		int modM = (int)(memo[0] % M);
		mod[modM]++;
		long answer = modM == 0 ? 1 : 0; // answer �� long.. �ִ� 10^6(10^6+1)/2 ������ �� �� �����Ƿ�
		
		
		for(int i = 1; i < N; i++) { // i��° ������ ���ؼ��� ����Ѵ�.
			memo[i] = Integer.parseInt(st.nextToken()) + memo[i-1]; // i��° ������ ���� ���Ѵ�.
			modM = (int)(memo[i] % M); // i��° ���� ���� �������� ���Ѵ�.
			answer += mod[modM];  // i ��° ������ ���� �������� k�̸� �� k�� �����ϸ� ������ �������Ƿ�. i ��° ������ ���ӵ� ������ �� �� �������� k�� ���� �����ϸ� M���� ������ ��������.
			if(modM == 0) {
				answer += 1; // �ڱ� �ڽ� �ϳ��� �ִ� ���
			}
			mod[modM]++;
		}
		System.out.println(answer);
		

	}
}