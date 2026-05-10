# 🧩 875. Koko Eating Bananas

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.

---

## 📌 Constraints

```
• 1 <= piles.length <= 10⁴
• piles.length <= h <= 10⁹
• 1 <= piles[i] <= 10⁹
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Binary Search`, `Senior Staff`                                      |                                      |
| **Solved On**    | May 9, 2026                                   |
| **Attempts**     | 2                                           |

---

## 📥 Examples

### Example 1
```
Input: piles = [3,6,7,11], h = 8
Output: 4
```

### Example 2
```
Input: piles = [30,11,23,4,20], h = 5
Output: 30
```

### Example 2
```
Input: piles = [30,11,23,4,20], h = 6
Output: 23
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

- Use BS in answers concept

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/koko-eating-bananas)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=qyfekrNni90)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Binary Search, Senior Staff &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
