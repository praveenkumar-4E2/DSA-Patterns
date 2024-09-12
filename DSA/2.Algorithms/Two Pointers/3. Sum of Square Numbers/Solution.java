class Solution {
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int) Math.sqrt(c); // Set b to the square root of c
        while (a <= b) {
            long pow = (long) a * a + (long) b * b; // Use long to avoid overflow
            if (pow == c)
                return true;
            if (pow > c)
                b--; // Decrease b if the sum is too large
            else
                a++; // Increase a if the sum is too small
        }
        return false;
    }
}
