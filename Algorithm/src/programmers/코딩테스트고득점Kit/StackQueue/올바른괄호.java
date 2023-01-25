package programmers.코딩테스트고득점Kit.StackQueue;

public class 올바른괄호 {
    public static void main(String[] args) {
        solution("()()");
    }

    static boolean solution(String s) {
        int sum = 0;

        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (sum == 0 && ch == ')') {
                return false;
            }

            sum += ch == '(' ? 1 : -1;
        }

        if (sum > 0) {
            return false;
        }

        return true;
    }
}
