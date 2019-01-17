package SW_Expert_Academy;

//SW Expert Academy 1218
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Stack {
	int top;
	String[] stack;
	int size;

	public Stack(int size) {
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

	public String getTop() {
		return stack[top];
	}
}

public class 괄호짝짓기_1218 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input/괄호짝짓기_input.txt"));
		Scanner sc = new Scanner(System.in);

		Stack st = new Stack(10000);

		int answer = 1, index = 0;

		String[] arr;
		String[] start = { "(", "<", "[", "{" };
		String[] end = { ")", ">", "]", "}" };

		for (int i = 1; i <= 10; i++) {

			arr = new String[Integer.parseInt(sc.nextLine())];
			arr = sc.nextLine().split("");

			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("(") || arr[j].equals("<") || arr[j].equals("[") || arr[j].equals("{")) {
					st.push(arr[j]);
				} else {
					for (int k = 0; k < 4; k++) {
						if (st.getTop().equals(start[k])) {
							index = k;
							break;
						}
					}
					if (arr[j].equals(end[index])) {
						st.pop();
					} else {
						answer = 0;
					}
				}
			}

			System.out.println("#" + i + " " + answer);
			answer = 1;
		}
		sc.close();
	}
}