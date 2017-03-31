

ArrayWeightCalculator:

I started by writing the class ArrayWeightCalculator. The code produced the expected output in all cases, but failed the time limit test. 
Moreover, the code wasn't written as efficiently as possible (unnecessarily bulky).


Some improvements to the code:

1. There was no need to use ArrayList. Array would have been sufficient
2. Passing parentArray into ArrayWeightCalculator associates each ArrayWeightObject with a parentArrayObject. It would have been
   better to be able to have a method such as ArrayWeightCalculator.calculateWeight(someArray) instead. 

ArrayWeightCalculator2:

I wrote this class in order to pass the time limit test on HackerEarth. I replaced ArrayList with array. ArrayWeightCalculator2 produced expected output in all cases, but only passed one time limit test. 

Notes: 

- Changing isUnique implementation. Previous implementation was O(n^2). New implementation is O(n + nlogn) = O(n). Sorting the array (Arrays.sort -- O(nlogn) according to java docs). Then comparing each element to the one after it. 

- Changed isUnique implementation. Using hashset now. Significant improvement in time. HackerEarth shows 0.3 sec improvement in time (input 1), but time limit still exceeded for other inputs.

ArrayWeightCalculator3:

Much simpler, cleaner implementation. Passed all speed tests. The key was (n(n+1))/2 and using long rather than int
