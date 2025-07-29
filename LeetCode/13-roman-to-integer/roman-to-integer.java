class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);
            if (i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                int nextValue = romanValues.get(nextChar);
                if (currentValue < nextValue) {
                    total -= currentValue; 
                } 
                else {
                    total += currentValue;
                }
            } 
            else {
                total += currentValue;
            }
        }

        return total;
    }
}