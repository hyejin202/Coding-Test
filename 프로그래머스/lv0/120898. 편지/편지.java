class Solution {
    public int solution(String message) {
       
        String[] strArr = message.split("");
        int len = strArr.length;
        return len*2;
    }
}