# 🧩 54. Rotate Array

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

---

## 📌 Constraints

```
• 1 <= nums.length <= 10⁵
• -2³¹ <= nums[i] <= 2³¹ - 1
• 0 <= k <= 10⁵
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Math`, `Two Pointers`                                       |                                      |
| **Solved On**    | April 24, 2026                                   |
| **Attempts**     | 3                                           |

---

## 📥 Examples

### Example 1
```
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
```

### Example 2
```
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0){
            System.out.println(Arrays.toString(nums));
            return;
        }
        reverseArr(nums, 0, n-1);
        System.out.println(Arrays.toString(nums));
        reverseArr(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));
        reverseArr(nums,k,n-1);
        System.out.println(Arrays.toString(nums));
    }

    private void reverseArr(int[] arr, int s, int n){
        while (s < n){
            int temp = arr[s];
            arr[s] = arr[n];
            arr[n] = temp;
            s = s + 1;
            n = n - 1;
        }
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

- Prefer notes

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/rotate-array/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?t=61&v=wvcQg43_V8U&feature=youtu.be)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Math, Two Pointers &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
