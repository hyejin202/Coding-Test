class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        for (int i=0; i<strArr.length; i++) {
            int a = Integer.parseInt(strArr[i]);
            answer += a;
        }
        return answer;
    }
}