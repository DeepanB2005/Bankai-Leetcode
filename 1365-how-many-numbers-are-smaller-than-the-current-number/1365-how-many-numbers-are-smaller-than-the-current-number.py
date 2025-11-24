class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        op=[]
        for i in range(len(nums)):
            c=0
            for j in range(len(nums)):
                if nums[i]>nums[j]:
                    c+=1
            op.append(c)
        return op

                
        