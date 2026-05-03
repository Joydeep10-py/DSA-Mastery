# 🧩 81. Search in Rotated Sorted Array II

> **Platform:** LeetCode

---

## 📋 Problem Statement

> You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once. Your solution must run in O(log n) time and O(1) space.
>

---

## 📌 Constraints

```
• 1 <= nums.length <= 10⁵
• 0 <= nums[i] <= 10⁵
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Binary Search`                                       |                                      |
| **Solved On**    | May 2, 2026                                   |
| **Attempts**     | 2                                           |

---

## 📥 Examples

### Example 1
```
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
```

### Example 2
```
Input: nums = [3,3,7,7,10,11,11]
Output: 10
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        if (nums.length == 1){
            return nums[0];
        }
        
        if (nums[1] != nums[0]){
            return nums[0];
        }
        
        if (nums[high] != nums[high-1]){
            return nums[high];
        }

        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid + 1] !=  nums[mid] && nums[mid-1] != nums[mid]){
                return nums[mid];
            } else if ((mid % 2 != 0 && nums[mid-1] == nums[mid]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
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

- Use the even-odd concept. Prefer notes

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/single-element-in-a-sorted-array/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=AZOmHuHadxQ)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Binary Search &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
