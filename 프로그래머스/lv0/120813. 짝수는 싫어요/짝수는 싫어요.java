class Solution {
    public int[] solution(int n) {
        int len = 0;
        //배열 길이 구하기
       if (n % 2 == 0) {
			len = n / 2;
		} else {
			len = (n / 2) + 1;
		}
        int[] answer = new int[len];
        
        //배열에 홀수값 넣기
       
// 		for (int i = 0; i < len; i++) {
// 			answer[i] = (2 * i) + 1;
// 		}
        for (int i = 1, j=0; j<len; i+=2, j++) {
			answer[j] = i;
		}
         return answer;
        
    }
}