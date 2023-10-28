from typing import *


def countGreater(N: int, Q: int, arr: List[int], query: List[int]) -> List[int]:
    nums = []
    for i in range(0, N):
        count = 0
        for j in range(i + 1, N):
            if arr[i] < arr[j]:
                count += 1
        nums.append(count)
    result = []
    for i in range(0, len(query)):
        result.append(nums[query[i]])

    return result
