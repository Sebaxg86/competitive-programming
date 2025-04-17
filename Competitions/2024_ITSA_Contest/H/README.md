# Problem H - String Led
  
**Time Limit:** 1 second
  
---
 
## Description
Mariazinha wants to arrange her Christmas tree with the LED strings bought last year. The problem is that his younger sister cutted these strings into several pieces.

Mariazinha wants to know if after joining these pieces (listed with a label by her from 1 to N) the LED string is totally joined or not, because if any of the segments is missing, the led string lights will not work.

Write a program that, given a series of connections between segments of led strings, indicates whether the string will be Complete or Incomplete.

---
  
## Input
The first line of the input contains two integers N and L, indicating the number of LED string segments and the number of connections made (1 ≤ N ≤ 100, 1 ≤ L ≤ 100). The numbers for each of the N segments, are enumerated from 1 to N.

Each of the following L lines will contain 2 numbers X and Y, indicating that Mariazinha is connecting these 2 segments (X and Y). The connections will always be made between pieces of different led strands.

## Output
Your program should print the message 'COMPLETO' indicating that the LED string segments have all been joined together or 'INCOMPLETO' in case any segment of that LED string has not been connected.

## Sample Input
```
4 3
1 2
1 3
2 4
```
---
```
6 4
1 2
3 4
5 6
2 3
```

## Sample Output
```
COMPLETO
```
---
```
INCOMPLETO
```