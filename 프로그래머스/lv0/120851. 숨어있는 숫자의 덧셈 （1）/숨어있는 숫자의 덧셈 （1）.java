class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split("");
        for (int i=0; i<strArr.length; i++) {
            if (strArr[i].matches("\\d")) {
                int a = Integer.parseInt(strArr[i]);
                answer += a;
            }
        }
        return answer;
    }
}