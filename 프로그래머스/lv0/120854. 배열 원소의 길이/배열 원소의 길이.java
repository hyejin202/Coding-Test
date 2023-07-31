class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int len;
        String str;
        for (int i=0; i < strlist.length; i++) {
            str = strlist[i];
            len = str.length();
            answer[i] = len;
        }
        return answer;
    }
}