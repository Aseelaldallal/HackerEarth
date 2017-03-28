


* In the interest of moving on to other projects, those improvements haven't been implemented. This
is just a reflection of what I could have done better. 

Some improvements to the code:
1. There was no need to use ArrayList. Array would have been sufficient
2. Passing parentArray into ArrayWeightCalculator associates each ArrayWeightObject with a parentArrayObject. It would have been
   better to be able to have a method such as ArrayWeightCalculator.calculateWeight(someArray) instead. 
3. I'm a fan of having a separate class to parse user input, but I can't submit two classes to hackerearth.
