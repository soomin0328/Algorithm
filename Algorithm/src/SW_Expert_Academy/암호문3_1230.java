package SW_Expert_Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class 암호문3_1230 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> numbers = new ArrayList<Integer>();

	private static void insert(int x, int y) {
		for (int i = 0; i < y; i++) {
			numbers.add(x + i, sc.nextInt());
		}
	}

	private static void delete(int x, int y) {
		for (int i = 0; i < y; i++) {
			numbers.remove(x + i);
		}
	}

	private static void add(int y) {
		for (int i = 0; i < y; i++) {
			numbers.add(sc.nextInt());
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input/암호문3_input.txt"));
		sc = new Scanner(System.in);

		int length = 0, funcNum = 0;

		for (int i = 1; i <= 10; i++) {
			length = sc.nextInt();

			for (int j = 0; j < length; j++) {
				numbers.add(sc.nextInt());
			}

			funcNum = sc.nextInt();

			for (int j = 0; j < funcNum; j++) {
				String func = sc.next();
				switch (func) {
				case "I":
					insert(sc.nextInt(), sc.nextInt());
					break;

				case "D":
					delete(sc.nextInt(), sc.nextInt());
					break;

				case "A":
					add(sc.nextInt());
					break;

				default:
					break;
				}
			}

			System.out.print("#" + i + " ");
			for (int k = 0; k < 10; k++) {
				System.out.print(numbers.get(k) + " ");
			}
			System.out.println("");

			numbers.clear();
		}

	}
}
