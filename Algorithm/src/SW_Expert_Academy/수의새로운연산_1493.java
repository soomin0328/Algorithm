package SW_Expert_Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 수의새로운연산_1493 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input/수의새로운연산_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[2];
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();

			arr = find(1, 1, p);
			x1 = arr[0];
			y1 = arr[1];

			arr = find(1, 1, q);
			x2 = arr[0];
			y2 = arr[1];

			p = x1 + x2;
			q = y1 + y2;

			int an = 1;
			for (int j = 1; j < p + q - 1; j++) {
				an += j;
			}

			answer = an + p - 1;
			System.out.println("#" + i + " " + answer);
		}
	}

	static int a = 0, b = 0;
	static int[] point = new int[2];

	public static int[] find(int y, int start, int num) {
		if (num >= start && num < start + y) {
			a = num - start + 1;
			b = y - a + 1;
			point[0] = a;
			point[1] = b;
			return point;
		} else {
			find(y + 1, start + y, num);
		}
		return point;
	}
}
