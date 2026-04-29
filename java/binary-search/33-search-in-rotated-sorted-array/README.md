# 🧩 33. Search in Rotated Sorted Array

> **Platform:** LeetCode

---

## 📋 Problem Statement

> There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.
>
> _Example: `Input`: nums = [4,5,6,7,0,1,2], `Target`: 0
`Output`: 4

---

## 📌 Constraints

```
• 1 <= nums.length <= 5000
• -10⁴ <= nums[i] <= 10⁴
• All values of nums are unique.
• nums is an ascending array that is possibly rotated.
• -10⁴ <= target <= 10⁴
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Binary Search`                                       |                                      |
| **Solved On**    | April 29, 2026                                   |
| **Attempts**     | 1                                           |

---

## 📥 Examples

### Example 1
```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
```

### Example 2
```
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
```

### Example 3
```
Input: nums = [1], target = 0
Output: -1
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public int search(int[] nums, int target) {
        int j = 0;
        int n = 0;
        for (int i = j+1; i < nums.length; i++) {
            if (nums[j] > nums[i]){
                n = i;
                break;
            }
            j++;
        }
        if (BinarySearchRotated(nums,target,0,n-1) == -1){
            return BinarySearchRotated(nums, target, n, nums.length - 1);
        } else {
            return BinarySearchRotated(nums,target,0,n-1);
        }
    }

    private static int BinarySearchRotated(int[] nums, int target, int low, int high){
        while (low <= high){
            int mid = low + (high -low)/2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
```
---

## ⏱️ Complexity Analysis

| Metric | Optimal |
|--------|-------------|
| **Time** | O(log n) |
| **Space** | O(n) |

---

## 📚 Key Takeaways

> patterns or tricks to remember.

- Find the postion where the array is rotated, then perform Binary Search

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/search-in-rotated-sorted-array/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=r3pMQ8-Ad5s&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=65)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Binary Search &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
