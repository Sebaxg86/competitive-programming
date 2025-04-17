# Problem A - Space Elevator
 
**Time Limit:** 2 seconds

---

## Description

China is building a space elevator, which will allow the launching of probes and satellites at a much lower cost, enabling not only scientific research projects but also space tourism.

However, the Chinese are very superstitious and therefore take special care with the numbering of the floors in the elevator. They do **not** use:

- Any number containing the digit **"4"**
- Or the **sequence of digits "13"**

For example, they do not use floors 4, 13, 14, 24, 134, 113, etc.  
So, the floors are numbered like this:
    1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 15, …

As the elevator has many levels, the Chinese asked you to write a program that, given a level `N`, tells them which number should be assigned to that level according to their rules.

---

## Input

The input contains several test cases.  
Each test case consists of a single line with an integer `N`:

- `1 ≤ N ≤ 10^18`

---

## Output

For each test case, print a single line with the floor number that should be assigned to the **N-th** level (based on the rules provided).

---

## Sample Input
`1
 4
 11
 12
 440`

---

## Sample Output
`1
 5
 12
 15
 666`
