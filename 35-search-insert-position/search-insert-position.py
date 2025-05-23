class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        low = 0
        high = len(nums) - 1
        mid = 0

        while(high >= low):
            mid = (high + low) // 2
            if(nums[mid] == target):
                return mid
            elif (nums[mid] < target):
                low = mid + 1
            elif (nums[mid] > target):
                high = mid - 1
        if(nums[mid] > target):
            return mid
        else:
            return mid + 1
            