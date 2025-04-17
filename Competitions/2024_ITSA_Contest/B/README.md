# Problem B - Report Recovery

**Time Limit:** 1 seconds

---

## Description

At the end of the week, John asked Mary to send him an urgent sales report. Mary was in a hurry because she was leaving for her holiday. She then copy-pasted the sales sheet on an email, sent it to John and went out. She did not want to be annoyed with work issues, so she left without telling anyone where she would be. She announced that she would be simply not available for the next two weeks, turned off her cell phone, and left.

When John received the message he realized that the report had no spaces at all! 

He knew that the report should have a header line with product codes of the form:
- `P1, P2, . . ., PN` and the word Totals at the end.
 
Then there would be several lines reporting product sales for the different sellers of Mary’s office. 

---

- Each seller was identified with a name composed by one word (only alphabetical characters). 
- The line corresponding to a seller should begin with his/her name, followed by the number of sold products, according to the columns’ report. 
- The last line of the report should begin with the two letters TP followed by the totals of each column in the report (of course, no seller’s name began with the letters TP). 
- John knew that there were no negative numbers in the report, a zero quantity was reported with a single 0, and there were no leading zeros when reporting a positive quantity.

---

At this point, John decided to reconstruct Mary’s report. He knew that there could be more than one possible result, but he wanted to do it anyway with the first consistent solution that he could find (maybe he could fix any mistakes when Mary comes back).

Could you help John with the recovering of Mary’s sales report?

---

## Input

The input consists of several test cases. The first line in the input contains an integer C specifying the number of test cases. The first line of a report is a header line, containing the product codes P1, P2, . . . PN and the word Totals, as described above. The numbering of products in this header line is consecutive, from 1 to N, with 1 ≤ N ≤ 5. Then there are a number of lines, each representing a row of the report, as described above. The last line of the report starts with the letters TP and have the format described above. Consider that each seller sold less than 1000 units of each product. There are no more than 4 sellers on each test case. Each seller name will not exceed 10 characters (only uppercase and lowercase letters).

## Output

For each test case in the input your program must produce one possible Mary’s report. Each line of the answer must be left aligned, with its items separated by a single space, and with no space at its end.

## Sample Input
```
2
P1P2P3Totals
Amanda121100131
Charles5141772
Monique14121238
TP1862629241
P1P2Totals
Ingrid9519851936
Candid49212504
Peter10313
Camila000
TP145310002453
```

## Sample Output
```
P1 P2 P3 Totals
Amanda 121 10 0 131
Charles 51 4 17 72
Monique 14 12 12 38
TP 186 26 29 241
P1 P2 Totals
Ingrid 951 985 1936
Candid 492 12 504
Peter 10 3 13
Camila 0 0 0
TP 1453 1000 2453
```