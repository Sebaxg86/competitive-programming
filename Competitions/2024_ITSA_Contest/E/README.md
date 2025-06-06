# Problem E - Trip to BH
  
**Time Limit:** 1 second
  
---
 
## Description
  
The great final of the Water Surf Nlognonian Championship is near, and in this year it will take place in the city of Bonita Horeleninha (BH)! You decided that you will travel from your hometown to BH to watch the final.

There are N cities in Nlogonia, enumerated from 1 to N. Consider that the city 1 is your hometown, and the city N is BH.

Besides that, there are M stretches through which you can travel. Each stretch can be used to travel from one city to another in the country. Some stretches are made by buses, whereas the others are made by plane. For each stretch, you know the price, in reais, of the ticket to travel that stretch.

To avoid tiredness due to commuting between bus stations and airports you decided that you will use only one mean of transportation during the whole trip. It means that you want to go to BH only by bus or only by plane.

Your task is to determine the minimum cost, in reais, to go from your hometown to BH, given the restriction that the mean of transportation must not change during the whole trip.

---
  
## Input
  
The input contains several test cases. The first line of each test case contains two integers N and M (2 ≤ N ≤ 100, 1 ≤ M ≤ 2(N2 -N)), the number of cities and stretches, respectively. The following lines describe one stretch each. Each line has 4 integers A B T R (1 ≤ A, B ≤ N, A≠B, T = 0 or 1, 1 ≤ R ≤ 104), indicating a stretch that goes from city A to city B, (in this order), made by bus if T = 0 or by plane if T = 1, and whose ticket costs R reais.

It’s guaranteed that there is at least one way from your hometown to BH using only one mean of transportation. Besides that for each ordered pair of cities (A,B), there is at most one stretch from A to B for each possible mean of transportation (note that it is possible to exist one stretch by bus and another by plane from A to B).

The input ends with end-of-file (EOF).

## Output
  
For each test case, print a single line with an integer indicating the minimum cost required to complete your trip, given the above restrictions.

## Sample Input
```
5 6
1 2 0 200
1 3 1 400
2 4 0 300
3 4 1 300
2 5 0 700
4 5 1 100
```
## Sample Output
```
800
```