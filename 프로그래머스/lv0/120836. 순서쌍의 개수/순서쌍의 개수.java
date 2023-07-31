class Solution {
    public int solution(int n) {
        int answer = 0;
        int x,y;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                answer++;
            }
        }
      
        return answer;
    }
}