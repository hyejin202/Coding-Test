class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int leng = my_string.length();
        
        for(int i=0; i<leng; i++) {
            for (int j = 1; j<=n; j++){
                 answer += (my_string.substring(i, i+1));
            }
           
        }
        return answer;
    }
}