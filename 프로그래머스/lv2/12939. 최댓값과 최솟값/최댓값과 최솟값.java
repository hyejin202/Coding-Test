class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(String s1 : arr) {
            max = Math.max(max, Integer.parseInt(s1));
            min = Math.min(min, Integer.parseInt(s1));
        }
        answer = answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}