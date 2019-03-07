//프로그래머스 해시 '전화번호 목록'

package programmers.Hash;

public class 전화번호목록 {
	public static void main(String[] args) {
		Hash2 h2 = new Hash2();
		String[] arr = { "12232332", "12", "222222" };
		System.out.println(h2.solution(arr));
	}
}

class Hash2 {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		String pre = "", post = "";

		for (int i = 0; i < phone_book.length; i++) {
			pre = phone_book[i];
			for (int j = 0; j < phone_book.length; j++) {
				if (i != j) {
					post = phone_book[j];
					if (pre.startsWith(post)) {
						answer = false;
						break;
					}
				}
			}
		}

		return answer;
	}
}