class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        for (int i=0; i < numbers.length; i++) {
            for (int j=0; j<=i; j++) {
                if (i == j) {
                    continue;
                }
                int mul = numbers[i] * numbers[j];
                if (max < mul) {
                    max = mul;
                } else {
                    max = max;
                }
            }
        }
        return max;
    }
}