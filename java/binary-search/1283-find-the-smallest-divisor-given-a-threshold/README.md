# 🧩 1283. Find the Smallest Divisor given a Threshold

> **Platform:** LeetCode

---

## 📋 Problem Statement

> Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
The test cases are generated so that there will be an answer.

---

## 📌 Constraints

```
• 1 <= nums.length <= 5 * 10⁴
• 1 <= nums[i] <= 10⁶
• nums.length <= threshold <= 10⁶
```

---

## 🏷️ Metadata

| Property         | Details                                      |
|------------------|----------------------------------------------|
| **Difficulty**   | 🟡 Medium                                    |
| **Topic Tags**   | `Array`, `Binary Search`, `Staff`                                      |                                      |
| **Solved On**    | May 10, 2026                                   |
| **Attempts**     | 2                                           |

---

## 📥 Examples

### Example 1
```
Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
```

### Example 2
```
Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
```
---
## 💻 Solution Code

### Java
```java
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = highestInArray(nums);
        int ans = high;

        while (low < high){
            int mid = low + (high - low)/2;
            int s = sumDiv(nums, mid);
            if (s <= threshold){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int sumDiv(int[] arr, int num){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (int) Math.ceil((double) arr[i] / num);
        }
        return sum;
    }

    private static int highestInArray(int[] piles){
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max){
                max = piles[i];
            }
        }
        return max;
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

- 🔗 [Problem Link](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/)

---

<div align="center">

**Difficulty** — 🟡 Medium &nbsp;·&nbsp; **Topic** — Array, Binary Search, Staff &nbsp;·&nbsp; **Status** — ✅ Solved

</div>
