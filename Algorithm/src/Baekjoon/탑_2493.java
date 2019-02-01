package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 탑_2493 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String n = bf.readLine();
		String[] str = bf.readLine().split(" ");

		int[] answer = new int[str.length];

		Stack<Integer> st = new Stack<Integer>();
		Stack<Integer> index = new Stack<Integer>();

		for (int i = str.length - 1; i >= 0; i--) {
			int num = Integer.parseInt(str[i]);

			if (st.size() == 0) {
				st.push(num);
				index.push(i);
			} else {
				while (!st.isEmpty()) {
					if (num > st.peek()) {
						answer[index.peek()] = i + 1;
						st.pop();
						index.pop();
					} else {
						break;
					}
				}
				st.push(num);
				index.push(i);
			}
		}

		for (int j = 0; j < st.size(); j++) {
			answer[index.peek()] = 0;
		}

		for (int i = 0; i < answer.length - 1; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println(answer[answer.length - 1]);
	}
}