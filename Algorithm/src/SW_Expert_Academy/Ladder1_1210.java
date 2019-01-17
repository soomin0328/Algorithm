//SW Expert Academy 1210

package SW_Expert_Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ladder1_1210 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input/ladder_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int N = 100;

		for (int t = 1; t <= 10; t++) {
			int T = sc.nextInt();
			int[][] A = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					A[i][j] = sc.nextInt();
				}
			}

			int jIdx = 0;
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = 0; j < N; j++) {
				if (A[N - 1][j] == 1) {
					list.add(j);
				}
				if (A[N - 1][j] == 2) {
					list.add(j);
					jIdx = j;
				}
			}

			for (int i = N - 2; i >= 0; i--) {
				if (jIdx - 1 >= 0 && A[i][jIdx - 1] == 1) {
					jIdx = list.get(list.indexOf(jIdx) - 1);
				} else if (jIdx + 1 < N && A[i][jIdx + 1] == 1) {
					jIdx = list.get(list.indexOf(jIdx) + 1);
				}
			}
			System.out.println("#" + T + " " + jIdx);
		}
	}
}