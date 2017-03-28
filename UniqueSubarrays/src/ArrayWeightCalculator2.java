// imports
import java.util.*;

public class ArrayWeightCalculator2 {

	
	// Constructor
	public ArrayWeightCalculator2() {}
	
	// Pre: array is not null
	// Post: Returns the weight of array as per specification
	public int calculateWeight(int[] array) {
		assert( array != null );
		int weightTracker = 0;
		for(int i=1; i<=array.length; i++) {
			weightTracker += calcTotWeightOfContigousSubarraysOfLength(i, array);
		}
		return weightTracker;
	}
	
	// Pre: length is greater than 0. array is not null
	// Post: Finds all contigous subarrays of length 'length' in array, calculates their individual weight,
	//       and returns the sum total of individual weights
	public int calcTotWeightOfContigousSubarraysOfLength(int length, int[] array) {
		assert (length > 0); 
		assert(array != null);
		int totalWeight = 0;
		for(int i=0; i<=array.length - length; i++) {
			int[] singleContigousSubarray = new int[length];
			int subarrayPos = 0; 
			for(int j=i; j<i+length; j++) {
				singleContigousSubarray[subarrayPos] = array[j];
				subarrayPos++; 
			}
			totalWeight += this.calculateSubarrayWeight(singleContigousSubarray);
		}
		return totalWeight;
	}
	

	// Pre: array is not null
	// Post: Returns 0 if array is not unique. Returns its length otherwise
	public int calculateSubarrayWeight(int[] array) {
		assert(array != null);
		if(this.isUniqueArray(array)) {
			return array.length;
		}
		return 0;
	}

	// Pre: array is not null
	// Post: Returns true if each element in the array appears only once
	// Note: Method is O(n)
	public boolean isUniqueArray(int[] array) {		
	    Set<Integer> foundNumbers = new HashSet<Integer>();
	    for (int num : array) {
	        if(foundNumbers.contains(num)){
	            return false;
	        }
	        foundNumbers.add(num);
	    }              
	    return true;   
	}
	
	
	/*---------------- MAIN --------------*/
	public static void main (String[] args) throws Exception {
	
        //Scanner
        Scanner textInputScanner = new Scanner(System.in);
        int noTestCases = Integer.parseInt(textInputScanner.nextLine());

        ArrayWeightCalculator2 myCalc = new ArrayWeightCalculator2();
        
        //Read Input
        for (int i=0; i < noTestCases; i++) {
            int arraySize = Integer.parseInt(textInputScanner.nextLine()); 
            int[] numbers = new int[arraySize];
            for(int j=0; j<arraySize; j++) {
            	numbers[j] = textInputScanner.nextInt();
            }
            if(textInputScanner.hasNext()) {
            	textInputScanner.nextLine();	
            }
            System.out.println(myCalc.calculateWeight(numbers));
        }
        textInputScanner.close(); 

	}
}
