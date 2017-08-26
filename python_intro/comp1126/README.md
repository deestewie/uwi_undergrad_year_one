Python I Labs & Tutorials

Using Python 3

# Table of Contents
[TOC]


## Lab 1

#### Question 1

Write a python program called mystery that should ask you to enter the last digit of your
cell phone number and also ask to enter your birth year. (Hint: Use the input command but
be mindful that the value entered is a string.)
a. Multiply the cell phone digit by 2, add 5 to it, then multiply by 50 and add 1766
b. Then subtract your birth year from this expression.
c. Return the result of this expression.
This return value is a three digit number where the first digit is the cell phones last digit and the remaining two digits are your age (this year).

*For Example*
    >>> mystery()
    
	Enter last digit of your cell phone number: 2
	Enter your year of birth: 1996
	220
    
#### Question 2
Write a python program called fuzzbiz, which takes a number as input. If the number is
divisible by 3 return the string “Fuzz”, if the number is divisible by 5 return the string “Biz”
and if the number is divisible by both numbers then return the string “FuzzBiz”. If it is only
any of the above cases then the program should return “No Fuzz No Biz”. Test your
program with 30, 27, 20 and 19.
*For Example*
	>>> fuzzbiz(30)
	'FuzzBiz'
    >>> fuzzbiz(20)
    'Biz'
    >>> fuzzbiz(27)
    'Fuzz'
    >>> fuzzbiz(19)
    'No Fuzz No Biz'
#### Question 3
Write a python program that takes a year as input and returns True if the year is a leap year,
otherwise it returns False. The input to this function must be an integer.
Leap Year Definition:
In the Gregorian Calendar, leap years are evenly divisible by 4, with the exception
of centurial years that are not evenly divisible by 400.A leap year can be centurial or non-centurial (e.g. 1600,1996). Non-centurial leap
year must be divisible by 4 and not divisible by 100 (e.g. 1992, 2008). Centurial
leap year must be divisible by 400 (e.g. 1600, 2000, 2400 are leap years and 1700,
1800, 1900, 2100 are not leap years).
[NOTE: For a number to be divisible by another the number when divided by the
second number should have no remainder.]

*For Example*
    >>> isLeapYear(2016)
    True
    >>> isLeapYear(2000)
    True
    >>> isLeapYear(2100)
    False
    
    

## Lab 2
1. The roots of a quadratic equation 

	> <i>ax</i><sup>2</sup> + <i>bx</i> + c = 0 

	are given by the quadratic formula

![X equals negative B, plus or minus the square root of B squared minus four A C, all over two A](https://github.com/ricikay93/uwi_undergrad_year_one/blob/master/python_intro/comp1126/quadratic_eq.PNG)


Write a function quadRoots in python which returns the greater of the two roots.
However, the root is returned when the discriminant (i.e. b2-4ac) is positive when it is
negative print a message that there are no real roots.
*For Example*
    quadRoots(15,3,6) -> “No real roots”
    quadRoots(6,23,20) -> -1.3333333333333333
2. Define a function perfectSquare(n), which returns True if n is a perfect square and False otherwise. Your function takes a positive integer as input and returns a Boolean Value. Use while loops in writing this function. A number n is a perfect square if there is a
number from 1 to n-1 whose square is equal to n.
Examples of Perfect square:
- 9 = 3*3
- 16 = 4*4

*For Example*

    >>> perfectSquare(6)
    False
    >>> perfectSquare(9)
    True
    
3. An integer greater than 1 is said to be prime if it divisible by only 1 and itself. For example
2,3,5,7 are prime numbers, but 4, 6, 8 and 9 are not. Write a function isPrime that
determines whether a number is prime or not. The function takes a parameter n and checks if there exists a number from 2 to n-1 that n is divisible by [Hint: you can use for loops].
If n is divisible by such a number then it is not a prime number and false must be returned.
Return true if the number is a prime number. Remember that 1 is not a prime number.

*For Example*

	isPrime(5) -> True
    
4. Use isPrime function in a function primes that take two numbers as parameters and
prints all the prime numbers between those two numbers (e.g. 2 and 10). Ensure that
isPrime is local function and can only be accessed by function primes.

*For Example*

	primes(2,10) -> 2,3,5,7
    isPrime(3) -> syntax error
    
## Lab 3

1. Write a function power in python (not recursive) that raises an integer n to its nth power
and returns that value. If n is less than or equal to 0 then the function should return 0.

*For Example*

    power(3) = 3**3 = 27
    power(4) = 4**4 = 256

2. Write a recursive function sumSeries (using the power function from part 1 ) which
computes the following value for an input integer n:

11 + 22 + 33 + 44 + … + nn
Therefore,

    sumSeries(4) = 44+33+22+11+00
   
Hint:

    Base case: n <= 0 => 1
    
Recursive call: sumSeries(4)=> power(4)+sumSeries(3)

3. Write recursive functions in python that calculate div and mod.
div takes two integers as input and keeps on subtracting the second from the first until the
first number becomes less than the second number. The function keeps a track of how many
times the second number is subtracted from the first and returns that number as the answer.
mod also takes two integers as input and keeps on subtracting the second from the first
until the first number becomes less than the second number. When the first number
becomes less than the second, the value of the first number is the answer.
4. Two functions lastDigit and allButLast are given below. Given a number n as an
argument the function lastDigit returns the last digit of that number and
allButLast returns the number with its last digit taken off. Write a recursive function
sumDigits which uses these two functions and sums all digits in a given number.

*For example, 234 will be 2+3+4, hence 9 will be returned.*

    sumDigits(234) => sumDigits(23) + 4
    sumDigits(2) + 3
    2
    => 9
    
Given a number n extract the last digit and call the function with an argument from which
the last digit has been removed.
```python
def lastDigit(x):
	return mod(x,10)
def allButLast(x):
	return div(x,10)
```

5. Write a python function is_valid that checks if the input is a valid Student id number.
Valid student Id’s are in the range 1000-6999 and the sum of their digits should be divisible
by 7. If the id number is valid return True otherwise return False.


## Lab 4

Type these expressions in the python shell.
    >>>[] + [1,2]
    >>>[1,2]+[3]
    >>>5/2.0
    >>>5//2.0
    >>>len([‘apples’,’oranges’,True,4])
    >>>[x for x in range (0,10) if x % 3 == 0 ]
    >>> [x for x in range (0,10) if x % 2 == 0 or x % 5 == 0]
    >>>len([x for x in range (0,10) if x % 2 == 0])
    >>>[(x,y,2010) for x in range (1,8) for y in range(1,13)]
Include these lists in your code.
month_days= [('January',[31]),('February',[28,29]),('March',[31]),
('April',[30]),('May',[31]),('June',[30]),('July',[31]),('August',[31]),
('September',[30]),('October',[31]),('November',[30]),('December',[31]) ]
day_names =
['Monday','Tuesday','Wednesday','Thursday','Friday','Saturday','Sunday']
#### Problem 1
Write a function days_in_month which takes a month as an argument and finds the
corresponding month in the month_days list and returns the number of days associated with that
month.
    >>> days_in_month('December')
    [31]
    >>> days_in_month('February')
    [28, 29]
#### Problem 2
Zeller’s Congruence is an algorithm for finding the day of the week for any date. Zeller’s formula
is as follows:
   > day = (((13*m+3) // 5 + d + y + (y // 4) - (y // 100) + (y // 400)) %7)
    where d = day, y = year and m = month
    
Note: If the month is January or February then you add 12 to the month and subtract 1 from the
year before calculating the day.
The result is a day number in the range 0..6 where the corresponding day can be extracted from the
day_names list by using an appropriate index.e.g. day_names[0] = ‘Monday’ and day_names[6] = ‘Sunday’.
Define a python function day_of_week, which displays the day name for a given date supplied
in the form (day,month,year).

*For Example*

    >>> day_of_week(18,10,2016)
    'Tuesday'
    >>> day_of_week(21,10,2016)
    'Friday'
    >>> day_of_week(20,10,2016)
    'Thursday'
    
#### Problem 3
Using list comprehension, define a python function unlucky, which returns all the days in a
given year which have the date Friday 13th e.g.
*For Example*
    >>> unlucky(2010)
    [(13, 8, 2010)]
    >>> unlucky(2015)
	[(13, 2, 2015), (13, 8, 2015), (13, 11, 2015)]
[*Hint: you need two ranges one for day starting from 1 and going to 31 and another one for month starting from 1 going to 12. Using these and the year which comes as an argument and use the function day_of_week in the if part of list comprehension to check if a given date is ‘Friday’ and also check if the day is equal to 13.*]
#### Problem 4
Write a python function mostUnlucky, which lists all the years between 0 and 2016 which have 3 unlucky days. Use function unlucky to get a list of unlucky dates for a particular year and find the length of this list. If the length is greater than 2 then the year is added to another list which is returned as output. Write this function twice (give different names), once using list comprehension and another iteratively (i.e. using for loops).