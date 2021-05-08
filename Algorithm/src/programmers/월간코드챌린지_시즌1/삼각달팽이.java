package programmers.월간코드챌린지_시즌1;

public class 삼각달팽이 {
	public static void main(String[] args) {
		solution(5);
	}
	
    public static int[] solution(int n) {
        int[] answer = {};
        int[][] arr = new int[n][n];
        int x = -1, y = 0;
        int num = 0;
        
        for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (i % 3 == 0) {
					x++;
				} else if (i % 3 == 1) {
					y++;
				} else if (i % 3 == 2) {
					x--;
					y--;
				}
				arr[x][y] = ++num;
			}
		}
        
        answer = new int[n*(n+1)/2];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > 0) {
					answer[idx] = arr[i][j];
					idx++;
				}
			}
		}
        
        return answer;
    }
}
