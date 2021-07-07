class Solution:

    def twoSum(nums, target):
        seen = {}
        for i, v in enumerate(nums):
            newTarget = target - v
            if newTarget in seen:
                return [seen[newTarget], i]
            seen[v] = i
        return []