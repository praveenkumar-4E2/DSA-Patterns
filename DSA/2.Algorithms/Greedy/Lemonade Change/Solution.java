class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;  // Number of $5 bills
        int ten = 0;   // Number of $10 bills

        // Iterate over each customer's bill
        for (int coin : bills) {
            if (coin == 5) {
                // If customer pays with $5, just collect the bill
                five++;
            } else if (coin == 10) {
                // If customer pays with $10, give back one $5 as change
                if (five > 0) {
                    five--;  // Use one $5 bill for change
                    ten++;   // Collect the $10 bill
                } else {
                    return false;  // Not enough $5 bills for change
                }
            } else {
                // If customer pays with $20, prioritize giving one $10 and one $5 as change
                if (ten > 0 && five > 0) {
                    ten--;  // Use one $10 bill
                    five--; // Use one $5 bill
                } 
                // If no $10 bill, try giving three $5 bills as change
                else if (five >= 3) {
                    five -= 3;  // Use three $5 bills for change
                } 
                // If neither condition can be satisfied, return false
                else {
                    return false;
                }
            }
        }

        // If we successfully give change to all customers, return true
        return true;
    }
}
