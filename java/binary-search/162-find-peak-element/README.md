# 🧩 162. Find Peak Element

> **Platform:** LeetCode

---

## 📋 Problem Statement

> A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in O(log n) time.

---

## 📌 Constraints

```
• 1 <= nums.length <= 1000
• -2³¹ <= nums[i] <= 2³¹ - 1
• nums[i] != nums[i + 1] for all valid i.
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Binary Search`                                      |                                      |
| **Solved On**    | May 3, 2026                                   |
| **Attempts**     | 1                                           |

---

## 📥 Examples

### Example 1
```
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
```

### Example 2
```
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        if (nums.length == 1){
            return 0;
        }

        if (nums.length == 2){
            if (nums[0] > nums[1]){
                return 0;
            } else {
                return 1;
            }
        }

        while (low < high){
            int mid = low + (high - low)/2;
            if (nums[mid] < nums[mid+1]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
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

- Use BS

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/find-peak-element/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=cXxmbemS6XM)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Binary Search &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
