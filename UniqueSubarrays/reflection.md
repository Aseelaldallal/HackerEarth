

ArrayWeightCalculator:

I started by writing the class ArrayWeightCalculator. The code produced the expected output in all cases, but failed the time limit test. 
Moreover, the code wasn't written as efficiently as possible.

In the interest of moving on to other projects, those improvements haven't been implemented. This is just a reflection of what I could have done better. 

Some improvements that could have been made:-

1. Passing parentArray into ArrayWeightCalculator associates each ArrayWeightObject with a parentArrayObject. It would have been

Some improvements to the code:

1. There was no need to use ArrayList. Array would have been sufficient
2. Passing parentArray into ArrayWeightCalculator associates each ArrayWeightObject with a parentArrayObject. It would have been
   better to be able to have a method such as ArrayWeightCalculator.calculateWeight(someArray) instead. 
2. I'm a fan of having a separate class to parse user input, but I can't submit two classes to hackerearth.


ArrayWeightCalculator2:

I wrote this class in order to pass the time limit test on HackerEarth. I replaced ArrayList with array. I also implemented
improvement 1. ArrayWeightCalculator2 produced expected output in all cases, but only passed one time limit test. Perhaps Java
is too slow. Will attempt to make performance enhancements, then rewrite using JS. 

- Actually I suspect string.split is the issue.

- Removed String.split, used scanner.nextInt() instead. Still didn't solve the problem. After doing some testing, I realized that the speed issue
is is one of the methods. Will investigate. 

- Changing isUnique implementation. Previous implementation was O(n^2). New implementation is O(n + nlogn) = O(n). Sorting the array (Arrays.sort -- O(nlogn) according to java docs). Then comparing each element to the one after it. 