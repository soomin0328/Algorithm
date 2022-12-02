package programmers.연습문제;

public class 푸드파이트대회 {
    public static void main(String[] args) {
        solution(new int[]{1, 7, 1, 2});
        // {1, 3, 4, 6}, 1223330333221
        // {1, 7, 1, 2}, 111303111
    }

    static public String solution(int[] food) {
        String answer = "";
        String leftStr = "";
        int foodNum = 0;

        for (int i = 1; i < food.length; i++) {
            foodNum = food[i] / 2;

            for (int j = 0; j < foodNum; j++) {
                leftStr += i;
            }
        }

        StringBuffer sb = new StringBuffer(leftStr);
        String reverse = sb.reverse().toString();

        answer = leftStr + "0" + reverse;
        
        return answer;
    }
}
