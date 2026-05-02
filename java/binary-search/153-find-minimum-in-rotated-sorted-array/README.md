# 🧩 153. Find Minimum in Rotated Sorted Array

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Suppose an array of length n sorted in ascending order is rotated between 1 and n times. Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]]. Given the sorted rotated array nums of unique elements, return the minimum element of this array. You must write an algorithm that runs in O(log n) time

---

## 📌 Constraints

```
• n == nums.length
• 1 <= n <= 5000
• -5000 <= nums[i] <= 5000
• All the integers of nums are unique.
• nums is sorted and rotated between 1 and n times.
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Binary Search`                                      |                                      |
| **Solved On**    | May 1, 2026                                   |
| **Attempts**     | 1                                           |

---

## 📥 Examples

### Example 1
```
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
```

### Example 2
```
Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
```

### Example 3
```
Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public int findMin(int[] nums) {
        int n = 0;
        int j = 0;
        for (int i = j+1; i < nums.length; i++) {
            if (nums[j] > nums[i]){
                n = i;
                break;
            }
            j++;
        }
        return nums[n];
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

- Use break

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=nhEMDKMB44g&feature=youtu.be)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Binary Search &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
