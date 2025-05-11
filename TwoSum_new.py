class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """


        res = 0
        temp = {}
 
        for i in range(len(nums)):
            res = target - nums[i]
            if res in temp:
                return [i, temp[res]]
            temp[nums[i]] = i