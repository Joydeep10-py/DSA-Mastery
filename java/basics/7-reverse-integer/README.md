# 🧩 07. Reverse Integer

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range, then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
>
> _Example: `Input`: x = 123, `Output`: 321

---

## 📌 Constraints

```
• Element length    : -2³¹ <= x <= 2³¹ - 1
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Math`                                       |                                      |
| **Solved On**    | March 1, 2026                                   |
| **Attempts**     | 3                                            |

---

## 📥 Examples

### Example 1
```
Input: x = 123
Output: 321
```

### Example 2
```
Input: x = -123
Output: -321
```

### Example 3 _(Edge Case)_
```
Input: x = 120
Output: 21
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public int reverse(int x) {
        int num = 0;
        if (num>Integer.MAX_VALUE/10 || num<Integer.MIN_VALUE/10){
            return 0;
        }
        while (x!=0){
            int r = x % 10;
            x = x / 10;
            num = (num * 10) + r;
        }

        return num;
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

- Use the min-max values for 32-bit problems

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/reverse-integer/)
- 🎥 [Video Explanation](https://www.youtube.com/watch?v=1xNbjMdbjug&t=930s)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Math &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
