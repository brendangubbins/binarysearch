import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }
            else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        return largest > 2 * secondLargest && largest != 0;
    }
}
