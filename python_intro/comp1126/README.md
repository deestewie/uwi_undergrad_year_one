# Lab 1
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
    
    

# Lab 2
1. The roots of a quadratic equation 
> <i>ax</i><sup>2</sup> + <i>bx</i> + c = 0 
are given by the quadratic formula

![X equals negative B, plus or minus the square root of B squared minus four A C, all over two A](https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Quadratic_formula.svg/640px-Quadratic_formula.svg.png?1444430043902 "Quadratic Formula")


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
