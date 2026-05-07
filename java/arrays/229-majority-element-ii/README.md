# 🧩 229. Majority Element II

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

---

## 📌 Constraints

```
• 1 <= nums.length <= 5 * 10⁴
• -10⁹ <= nums[i] <= 10⁹
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Hash Table`, `Sorting`, `Counting`                                       |                                      |
| **Solved On**    | May 5, 2026                                   |
| **Attempts**     | 1                                           |

---

## 📥 Examples

### Example 1
```
Input: nums = [3,2,3]
Output: [3]
```

### Example 2
```
Input: nums = [1]
Output: [1]
```

### Example 3
```
Input: nums = [1,2]
Output: [1,2]
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])){
                hash.put(nums[i], hash.get(nums[i]) + 1);
            } else {
                hash.put(nums[i], 1);
            }
        }

        for (int i : hash.keySet()){
            if (hash.get(i) > nums.length/3){
                ans.add(i);
            }
        }
        return ans;
    }
}
```
---

## ⏱️ Complexity Analysis

| Metric | Optimal |
|--------|-------------|
| **Time** | O(n) |
| **Space** | O(1) |

---

## 📚 Key Takeaways

> patterns or tricks to remember.

- Use HashMap

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/majority-element-ii/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=vwZj1K0e9U8&feature=youtu.be)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Hash Table, Sorting, Counting &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
