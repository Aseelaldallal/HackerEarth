

ArrayWeightCalculator:

I started by writing the class ArrayWeightCalculator. The code produced the expected output in all cases, but failed the time limit test. 
Moreover, the code wasn't written as efficiently as possible.

Some improvements that could have been made:-

1. Passing parentArray into ArrayWeightCalculator associates each ArrayWeightObject with a parentArrayObject. It would have been
   better to be able to have a method such as ArrayWeightCalculator.calculateWeight(someArray) instead. 
2. I'm a fan of having a separate class to parse user input, but I can't submit two classes to hackerearth.


ArrayWeightCalculator2:

I wrote this class in order to pass the time limit test on HackerEarth. I replaced ArrayList with array. I also implemented
improvement 1. 