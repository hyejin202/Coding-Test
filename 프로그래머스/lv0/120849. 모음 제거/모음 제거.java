class Solution {
    public String solution(String my_string) {
        //1
        // return my_string.replaceAll("[aeiou]", "");
        
        //2
        String answer = "";
        for (int i=0; i<my_string.length(); i++) {
            char[] c = my_string.toCharArray();
            switch (c[i]) {
                    case 'a', 'e', 'i', 'o', 'u' -> answer += "";
                    default -> answer += c[i];
            }
        }
        return answer;
    }
}