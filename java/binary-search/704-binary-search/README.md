# 🧩 704. Binary Search

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
> _Example: `Input`: nums = [-1,0,3,5,9,12], `target` = 9, `Output`: 4

---

## 📌 Constraints

```
• 1 <= nums.length <= 10⁴
• -10⁴ <= nums[i] <= 10⁴
• nums contains distinct values sorted in ascending order.
• All the integers in nums are unique.
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟢 Easy                                    |
| **Topic Tags**   | `Array`, `Binary Search`                                       |                                      |
| **Solved On**    | March 20, 2026                                   |
| **Attempts**     | 1                                            |

---

## 📥 Examples

### Example 1
```
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
```

### Example 2
```
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
```

---
## 💻 Solution Code

### Java
```java
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else  {
                return mid;
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
| **Space** | O(1) |

---

## 📚 Key Takeaways

> patterns or tricks to remember.

- Use the concept of Binary Search

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/binary-search/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=6zhGS79oQ4k&feature=youtu.be)

---

<div align="center">

**Difficulty** — 🟢 Easy &nbsp;·&nbsp; **Topic** — Arrays, Binary Search &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
