# 🧩 125. Valid Palindrome

> **Platform:** LeetCode

---

## 📋 Problem Statement

> A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
>
> _Example: `Input`: s = "A man, a plan, a canal: Panama"
`Output`: true

---

## 📌 Constraints

```
• 1 <= s.length <= 2 * 10⁵
• s consists only of printable ASCII characters.
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟢 Easy                                    |
| **Topic Tags**   | `String`, `Two Pointer`                                      |                                      |
| **Solved On**    | March 10, 2026                                   |
| **Attempts**     | 1                                           |

---

## 📥 Examples

### Example 1
```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
```

### Example 2
```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
```

### Example 2
```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
```

---
## 💻 Solution Code

### Java
```java
class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase();
        String newStr = palindromeStr(s,"",1);
        newStr = newStr.trim();
        newStr = newStr.toLowerCase();
        return newStr.equals(cleanStr(s,"",0));
    }

    private String cleanStr(String s, String str, int c){

        if (c == s.length()){
            return str;
        }
        if (Character.isLetterOrDigit(s.charAt(c))){
            str = str + s.charAt(c);
        }
        c = c + 1;
        return cleanStr(s,str,c);
    }

    private String palindromeStr(String s, String str, int c){
        if (c > s.length()){
            return str;
        }
        if (Character.isLetterOrDigit(s.charAt(s.length()-c))){
            str = str + s.charAt(s.length()-c);
        }
        c = c + 1;
        return palindromeStr(s, str, c);
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

- Use Recurssion

---

## 🔖 References

- 🔗 [Problem Link](https://leetcode.com/problems/valid-palindrome/description/)

---

<div align="center">

**Difficulty** — 🟢 Easy &nbsp;·&nbsp; **Topic** — String, Two Pointer &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
