class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort the greed factors of children and sizes of cookies
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildren = 0;  // Number of content (satisfied) children
        int cookieIndex = 0;  // Pointer to the current cookie

        // Loop until either all cookies are used or all children are satisfied
        while (cookieIndex < s.length && contentChildren < g.length) {
            // If the current cookie can satisfy the current child's greed
            if (s[cookieIndex] >= g[contentChildren]) {
                contentChildren++;  // Satisfied child, move to the next child
            }
            cookieIndex++;  // Move to the next cookie
        }

        return contentChildren;  // Return the total number of content children
    }
}
