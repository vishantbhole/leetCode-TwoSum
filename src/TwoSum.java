package src;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int myArray[] = new int[2];
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for(int i= 0; i<nums.length;i++){
            int diff = target - nums[i];
            if(newMap.containsKey(diff)) {
               myArray[0] = i;
               myArray[1] = newMap.get(diff);
            } else{
                newMap.put(nums[i], i);
            }
        }
        return myArray;
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