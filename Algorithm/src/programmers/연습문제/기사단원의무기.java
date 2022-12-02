package programmers.연습문제;

public class 기사단원의무기 {
    public static void main(String[] args) {
        solution(5, 3, 2);
    }

    static public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt = 0;

        for (int i = 1; i <= number; i++) {
            cnt = 0;

            if (i == 1) {
                answer += 1;
            } else {
                for (int j = 1; j * j <= i; j++) {
                    if (j * j == i)
                        cnt++;
                    else if (i % j == 0)
                        cnt += 2;
                }

                if (cnt > limit) {
                    answer += power;
                } else {
                    answer += cnt;
                }
            }
        }

        return answer;
    }
}
