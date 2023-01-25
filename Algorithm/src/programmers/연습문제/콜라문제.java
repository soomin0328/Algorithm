package programmers.연습문제;

public class 콜라문제 {
    public static void main(String[] args) {
        solution(3, 2, 10);
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        int totalCnt = n;

        do {
            answer += (totalCnt / a) * b;
            totalCnt = (totalCnt / a) * b + totalCnt % a;
        } while (totalCnt >= a);
        
        return answer;
    }
}
