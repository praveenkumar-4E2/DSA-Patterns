class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        // Calculate the initial sum of the first 'k' cards from the left
        for (int left = 0; left < k; left++)
            leftSum += cardPoints[left];
        maxSum = leftSum;

        int right = cardPoints.length - 1;

        // Adjust the window by moving cards from the right end to the left end
        for (int left = k - 1; left >= 0; left--) {
            leftSum -= cardPoints[left]; // Remove the card from the left end
            rightSum += cardPoints[right--]; // Add the card from the right end
            int sum = leftSum + rightSum; // Calculate the new score
            if (sum > maxSum)
                maxSum = sum; // Update maxSum if the new score is higher
        }

        return maxSum; // Return the maximum score found
    }
}
