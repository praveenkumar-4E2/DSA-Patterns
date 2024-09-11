class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); // Sort people by weight to use the two-pointer approach
        int light = 0; // Pointer for the lightest person
        int heavy = people.length - 1; // Pointer for the heaviest person
        int count = 0; // Count of boats

        while (light <= heavy) {
            int sum = people[light] + people[heavy]; // Check the sum of the lightest and heaviest
            if (sum > limit) { // If the combined weight exceeds the limit
                heavy--; // Only the heavier person can go in this boat
            } else { // If they can share a boat
                heavy--; // Move both pointers
                light++;
            }
            count++; // Each iteration requires one boat
        }
        return count; // Return the total number of boats needed
    }
}
