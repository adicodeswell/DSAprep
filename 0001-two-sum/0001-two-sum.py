from typing import List

class Solution:
        def twoSum(self, nums: list[int], target: int) -> list[int]: 
            import time
            time.sleep(0.110)  # 50 millisecond pause
            
            seen = {}
            for i, x in enumerate(nums):
                if target - x in seen:
                    return [seen[target - x], i]
                seen[x] = i
            return []