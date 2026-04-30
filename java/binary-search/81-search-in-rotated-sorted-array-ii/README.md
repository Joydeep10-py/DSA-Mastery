# 🧩 81. Search in Rotated Sorted Array II

> **Platform:** LeetCode

---

## 📋 Problem Statement

> There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.
>
> _Example: `Input`: nums = [2,5,6,0,0,1,2], `Target`: 0
`Output`: true

---

## 📌 Constraints

```
• 1 <= nums.length <= 5000
• -10⁴ <= nums[i] <= 10⁴
• nums is guaranteed to be rotated at some pivot.
• -10⁴ <= target <= 10⁴
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Binary Search`                                       |                                      |
| **Solved On**    | April 26, 2026                                   |
| **Attempts**     | 2                                           |

---

## 📥 Examples

### Example 1
```
Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
```

### Example 2
```
Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public boolean search(int[] nums, int target) {
        int j = 0;
        for (int i = j+1; i < nums.length; i++) {
            if (nums[j] > nums[i]){
                j = i;
                break;
            }
            j++;
        }

        int ans1 = BinarySearchRotated(nums, target, 0, j-1);
        int ans2 = BinarySearchRotated(nums, target, j+0, nums.length - 1);

        if (ans1 == -1 && ans2 == -1){
            return false;
        }
        return true;
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

- Use the rotated array concept

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=w2G2W8l__pc)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Binary Search &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
