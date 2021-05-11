package programmers.월간코드챌린지_시즌1;

public class 쿼드압축후개수세기 {
	static int zeroCnt = 0;
	static int oneCnt = 0;
	
	public static void main(String[] args) {
		int[][] arr = {
						{1,1,0,0},
						{1,0,0,0},
						{1,0,0,1},
						{1,1,1,1},
					};
		solution(arr);
	}
	
    public static int[] solution(int[][] arr) {
        int[] answer = new int[2];
        
        compression(arr, arr.length, 0, 0);
        answer[0] = zeroCnt;
        answer[1] = oneCnt;
        
        return answer;
    }
    
    private static void compression(int[][] arr, int length, int start, int end) {
    	boolean bolChk = true;
    	int flagNum = arr[start][end];
    	
    	for (int i = start; i < start + length; i++) {
			for (int j = end; j < end + length; j++) {
				if (arr[i][j] != flagNum) {
					bolChk = false;
					break;
				}
			}
		}
    	
    	if (bolChk) {
			if (flagNum == 1) {
				oneCnt++;
			} else if (flagNum == 0) {
				zeroCnt++;
			}
		} else {
			compression(arr, length/2, start, end);
			compression(arr, length/2, start, end + length/2);
			compression(arr, length/2, start + length/2, end);
			compression(arr, length/2, start + length/2, end + length/2);
		}
	}
}
