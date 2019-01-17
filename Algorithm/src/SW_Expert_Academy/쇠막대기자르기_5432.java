//SW Expert Academy 5432

package SW_Expert_Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Stack2 {
	int top;
	String[] stack;
	int size;

	public Stack2(int size) {
		top = -1;
		stack = new String[size];
		this.size = size;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public void push(String value) {
		stack[++top] = value;
	}

	public String pop() {
		if (!isEmpty()) {
			return stack[top--];
		} else {
			return "";
		}
	}

	public int getSize() {
		return top + 1;
	}
}

public class 쇠막대기자르기_5432 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input/쇠막대기자르기_input.txt"));
		Scanner sc = new Scanner(System.in);
		Stack2 st;

		int answer = 0, pre = 0;
		int n = Integer.parseInt(sc.nextLine());
		String[] arr;

		for (int i = 1; i <= n; i++) {
			String str = sc.nextLine();
			arr = str.split("");

			st = new Stack2(arr.length);

			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("(")) {
					st.push(arr[j]);
				} else {
					st.pop();
					if (arr[j - 1].equals("(")) {
						answer += st.getSize();
					} else {
						answer += 1;
					}
				}
			}

			System.out.println("#" + i + " " + answer);
			answer = 0;
		}
	}
}
