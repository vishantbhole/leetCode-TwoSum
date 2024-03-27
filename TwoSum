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