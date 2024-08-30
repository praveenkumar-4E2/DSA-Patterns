class Solution {
    public int countGoodSubstrings(String s) {
        int result = 0;
        
        // Check for substrings of length 3
        for (int i = 1; i < s.length() - 1; i++) {
            // Check if all three characters in the substring are different
            if (s.charAt(i - 1) != s.charAt(i) && s.charAt(i) != s.charAt(i + 1) && s.charAt(i - 1) != s.charAt(i + 1)) {
                result++;
            }
        }
        
        return result;
    }
}
