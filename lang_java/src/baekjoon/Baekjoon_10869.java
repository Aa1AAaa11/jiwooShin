package baekjoon;

import java.util.Scanner;

import common.Solution;

public class Baekjoon_10869 extends Solution {
	
	@Override
	public void solution() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.print((A+B)+"\n"+(A-B)+"\n"+(A*B)+"\n"+(A/B)+"\n"+(A%B));
	}
}
