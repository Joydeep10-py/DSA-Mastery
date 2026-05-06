# 🧩 118. Pascals Traingle

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given an integer numRows, return the first numRows of Pascal's triangle.

---

## 📌 Constraints

```
• 1  <= numRows <= 30
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Dynamic Programming`                                       |                                      |
| **Solved On**    | May 5, 2026                                   |
| **Attempts**     | 3                                           |

---

## 📥 Examples

### Example 1
```
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
```

### Example 2
```
Input: numRows = 1
Output: [[1]]
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ans.add(rowGenerate(i));
        }
        return ans;

    }

    private static List<Integer> rowGenerate(int n){
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans =  ans / i;
            list.add(ans);
        }
        return list;
    }
}
```
---

## ⏱️ Complexity Analysis

| Metric | Optimal |
|--------|-------------|
| **Time** | O(n²) |
| **Space** | O(n) |

---

## 📚 Key Takeaways

> patterns or tricks to remember.

- Use the the formula for ans =  (ans * (col - row))/col

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/pascals-triangle/description/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=bR7mQgwQ_o8)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Dynamic Programming &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
