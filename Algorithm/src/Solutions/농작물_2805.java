//SW Expert Academy 2805

package Solutions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 농작물_2805 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input/crops_input.txt"));

		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int start = 0, end = 0, sum = 0;
		String[] farm;

		for (int n = 1; n <= num; n++) {
			int size = Integer.parseInt(sc.nextLine());
			start = size / 2;
			end = start;
			farm = new String[size];

			for (int i = 0; i < size; i++) {
				farm = sc.nextLine().split("");

				for (int k = start; k <= end; k++) {
					sum += Integer.parseInt(farm[k]);
				}

				if (i < size / 2) {
					start -= 1;
					end += 1;
				} else {
					start += 1;
					end -= 1;
				}
			}

			System.out.println("#" + n + " " + sum);

			sum = 0;
		}

		sc.close();
	}

}
