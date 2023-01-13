public class 삼총사 {
    public static void main(String[] args) {
        solution(new int[]{-1, 1, -1, 1});
    }

    public static int solution(int[] number) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    sum = number[i] + number[j] + number[k];

                    if (sum == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}
