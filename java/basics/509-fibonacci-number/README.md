# 🧩 509. Fibonacci Number

> **Platform:** LeetCode

---

## 📋 Problem Statement

> The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
>
> _Example: `Input`: n = 2
`Output`: 1

---

## 📌 Constraints

```
• 0 <= n <= 30
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟢 Easy                                    |
| **Topic Tags**   | `Math`, `Dynamic Programming`, `Recurssion`, `Memoization`                                       |                                      |
| **Solved On**    | March 11, 2026                                   |
| **Attempts**     | 1                                           |

---

## 📥 Examples

### Example 1
```
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
```

### Example 2
```
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
```

### Example 2
```
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public int fib(int n) {
        if (n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
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

- Use Notes

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/fibonacci-number/)

---

<div align="center">

**Difficulty** — 🟢 Easy &nbsp;·&nbsp; **Topic** — Math, Dynamic Programming, Recurssion, Memoization &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
