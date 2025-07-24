class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        for (int num : nums) {
            int digitCount = 0;
            if (num == 0) {
            digitCount = 1;
        }
        else {
            int tempNum = num;
            while (tempNum > 0) {
                tempNum /= 10;
                digitCount++;
            }
        }
        if (digitCount % 2 == 0) {
            evenDigitCount++;
            }
        }
        return evenDigitCount;
    }
}
