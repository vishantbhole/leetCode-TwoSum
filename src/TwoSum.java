package src;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i}; // Return immediately when solution is found
            }
            map.put(nums[i], i); // Store the current number and its index
        }
        return null;
    }
}

class TwoSum {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Input array and target value
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method and get the result
        int[] result = solution.twoSum(nums, target);

        // Print the result
        System.out.println("Indices: " + Arrays.toString(result));
    }
}