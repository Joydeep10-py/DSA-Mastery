# 🧩 35. Search Insert Postion

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
> _Example: `Input`: nums = [1,3,5,6], `target` = 5, `Output`: 2

---

## 📌 Constraints

```
• 1 <= nums.length <= 10⁴
• -10⁴ <= nums[i] <= 10⁴
• nums contains distinct values sorted in ascending order.
• -10⁴ <= target <= 10⁴
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟢 Easy                                    |
| **Topic Tags**   | `Array`, `Binary Search`                                       |                                      |
| **Solved On**    | March 21, 2026                                   |
| **Attempts**     | 1                                            |

---

## 📥 Examples

### Example 1
```
Input: nums = [1,3,5,6], target = 5
Output: 2
```

### Example 2
```
Input: nums = [1,3,5,6], target = 7
Output: 4
```

### Example 3 
```
Input: nums = [1,3,5,6], target = 2
Output: 1
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
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

- 🔗 [Problem Link](https://leetcode.com/problems/search-insert-position/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=6zhGS79oQ4k&feature=youtu.be)

---

<div align="center">

**Difficulty** — 🟢 Easy &nbsp;·&nbsp; **Topic** — Arrays, Binary Search &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
