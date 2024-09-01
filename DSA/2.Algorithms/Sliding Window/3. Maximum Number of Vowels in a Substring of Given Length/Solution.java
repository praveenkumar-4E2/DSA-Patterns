class Solution {
    public int maxVowels(String s, int k) {
        // Length of the input string
        int n = s.length();
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int vowels = 0;
        int maxVowels = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            // If the character at the right boundary is a vowel, increment the vowel
            // counter
            if (set.contains(s.charAt(right))) {
                vowels++;
            }

            // If the window size equals k, check if we have found a new maximum number of
            // vowels
            if (right - left + 1 == k) {
                maxVowels = Math.max(maxVowels, vowels);

                // Before moving the left boundary, if the character at the left boundary is a
                // vowel, decrement the vowel counter
                if (set.contains(s.charAt(left))) {
                    vowels--;
                }

                // Move the left boundary to slide the window to the right
                left++;
            }
        }

        // Return the maximum number of vowels found in any window of size k
        return maxVowels;
    }
}
