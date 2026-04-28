# 🧩 1752. Check if Array is Sorted and Rotated

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
> There may be duplicates in the original array.
> Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.
>
> _Example: `Input`: nums = [3,4,5,1,2]
`Output`: true

---

## 📌 Constraints

```
• 1 <= nums.length <= 100
• 1 <= nums[i] <= 100
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟢 Easy                                   |
| **Topic Tags**   | `Array`, `Mid Level`                                       |                                      |
| **Solved On**    | April 5, 2026                                   |
| **Attempts**     | 1                                           |

---

## 📥 Examples

### Example 1
```
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
```

### Example 2
```
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
```

### Example 3
```
Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int c = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i-1]>nums[i]){
                c = c + 1;
            }
        }
        
        if (nums[n-1] > nums[0]){
            c = c + 1;
        }
        return c <= 1;
    }

}
```
---

## ⏱️ Complexity Analysis

| Metric | Optimal |
|--------|-------------|
| **Time** | O(n) |
| **Space** | O(n) |

---

## 📚 Key Takeaways

> patterns or tricks to remember.

- No outter pattern

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/)

---

<div align="center">

**Difficulty** — 🟢 Easy  &nbsp;·&nbsp; **Topic** — Array, Mid Level &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
