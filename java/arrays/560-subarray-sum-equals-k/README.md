# 🧩 560. Subarray Sum Equals K

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
> 
> _Example: `Input`: nums = [1,1,1], `k` = 2
`Output`: 2

---

## 📌 Constraints

```
• 1 <= nums.length <= 2 * 10⁴
• -1000 <= nums[i] <= 1000
• -10⁷ <= k <= 10⁷
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Senior Staff`, `Hash Table`, `Prefix Sum`                                       |                                      |
| **Solved On**    | April 28, 2026                                   |
| **Attempts**     | 4                                           |

---

## 📥 Examples

### Example 1
```
Input: nums = [1,1,1], k = 2
Output: 2
```

### Example 2
```
Input: nums = [1,2,3], k = 3
Output: 2
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0,1);
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            if (hash.containsKey(prefixSum - k)){
                c += hash.get(prefixSum - k);
            }

            if (hash.containsKey(prefixSum)){
                hash.put(prefixSum, hash.get(prefixSum) + 1);
            } else {
                hash.put(prefixSum, 1);
            }
        }
        return c;
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

- Use the Prefix-Sum concept. Add the count values in hash table

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/subarray-sum-equals-k/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=xvNwoz-ufXA&list=PLgUwDviBIf0oF6QL8m22w1hIDC1vJ_BHz&index=33)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Senior Staff, Hash Table, Prefix Sum &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
