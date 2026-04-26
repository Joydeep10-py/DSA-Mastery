# 🧩 54. Spiral Matrix

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given an m x n matrix, return all elements of the matrix in spiral order.
>
> _Example: `Input`: matrix = [[1,2,3],[4,5,6],[7,8,9]]
`Output`: [1,2,3,6,9,8,7,4,5]

---

## 📌 Constraints

```
• m == matrix.length
• n == matrix[i].length
• 1 <= m, n <= 10
• -100 <= matrix[i][j] <= 100
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Matrix`, `Simulation`                                       |                                      |
| **Solved On**    | April 26, 2026                                   |
| **Attempts**     | 2                                           |

---

## 📥 Examples

### Example 1
```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
```

### Example 2
```
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right){
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom){
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right){
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
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
| **Space** | O(1) |

---

## 📚 Key Takeaways

> patterns or tricks to remember.

- Top left bottom concept. Prefer notes

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/spiral-matrix/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=3Zv-s9UUrFM&feature=youtu.be)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Matrix, Simulation &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
