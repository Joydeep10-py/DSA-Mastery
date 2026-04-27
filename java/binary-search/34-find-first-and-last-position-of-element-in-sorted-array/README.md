# 🧩 34. Find First and Last Postion of Element in Sorted Array

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.
>
> _Example: `Input`: [5,7,7,8,8,10], `target` = 8 `Output`: [3,4]

---

## 📌 Constraints

```
• 0 <= nums.length <= 10⁵
• -10⁹ <= nums[i] <= 10⁹
• nums is a non-decreasing array.
• -10⁹ <= target <= 10⁹
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Binary Search`                                       |                                      |
| **Solved On**    | March 27, 2026                                   |
| **Attempts**     | 2                                            |

---

## 📥 Examples

### Example 1
```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
```

### Example 2
```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
```

### Example 3 _(Edge Case)_
```
Input: nums = [], target = 0
Output: [-1,-1]
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
      int[] arr = {-1,-1};

        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid] > target){
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                arr[0] = lower(nums, target);
                if (upper(nums, target) == -1){
                    arr[1] = nums.length - 1;
                } else {
                    arr[1] = upper(nums, target) - 1;
                }
                return arr;
            }
        }
        return arr;
    }

    private static int lower(int[] arr, int target){
        int n = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] >= target){
                n = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return n;
    }

    private static int upper(int[] arr, int target){
        int n = -1;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] > target){
                n = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return n;
    }
}
```
---

## ⏱️ Complexity Analysis

| Metric | Optimal |
|--------|-------------|
| **Time** | O(log n) |
| **Space** | O(1) |

---

## 📚 Key Takeaways

> patterns or tricks to remember.

- Use the concept of Upper Bound and Lower Bound

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=hjR1IYVx9lY)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Arrays, Binary Search &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
