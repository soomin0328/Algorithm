package programmers.연습문제;

public class 문자열나누기 {

    public static void main(String[] args) {
        System.out.println("@@@@ answer: " + solution("abracadabra"));
    }

    public static int solution(String s) {
        int answer = 0;
        int xCnt = 0;
        int diffCnt = 0;
        String x = "";
        
        String[] strArr = s.split("");

        for (String c : strArr) {
            if (x == "") {
                x = c;
            }

            if (x.equals(c)) {
                xCnt++;
            } else {
                diffCnt++;
            }

            if (xCnt == diffCnt) {
                answer++;
                xCnt = 0;
                diffCnt = 0;
                x = "";
            }
        }

        if (x != "") {
            answer++;
        }

        return answer;
    }
}
