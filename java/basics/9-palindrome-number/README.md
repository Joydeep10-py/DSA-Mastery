# 🧩 9. Palindrome Number

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given an integer x, return true if x is a palindrome, and false otherwise.
>
> _Example: `Input`: x = 121
`Output`: true

---

## 📌 Constraints

```
• -2³¹ <= x <= 2³¹ - 1
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟢 Easy                                    |
| **Topic Tags**   | `Math`                                      |                                      |
| **Solved On**    | March 16, 2026                                   |
| **Attempts**     | 1                                           |

---

## 📥 Examples

### Example 1
```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
```

### Example 2
```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```

### Example 3
```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public boolean isPalindrome(int x){
        if (x<0) return false;
        int rev =  reverse(x,0);
        return rev == x;
    }
    private int reverse(int n, int rev){
        if (n==0){
            return rev;
        }
        int r = n % 10;
        n = n / 10;
        rev = (rev*10) + r;
        return reverse(n, rev);
    }
}
```
---

## ⏱️ Complexity Analysis

| Metric | Optimal |
|--------|-------------|
| **Time** | O(1) |
| **Space** | O(1) |

---

## 📚 Key Takeaways

> patterns or tricks to remember.

- use Recurssion

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/palindrome-number/)

---

<div align="center">

**Difficulty** — 🟢 Easy &nbsp;·&nbsp; **Topic** — Array, Matrix, Simulation &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
