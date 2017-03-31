
import java.util.*;


public class ArrayWeightCalculator3 {

	// Constructor
	public ArrayWeightCalculator3() {}

	// Pre: array is not null
	// Post: Returns the weight of array as per specification
	public long calculateWeight(long[] array) {
		HashSet<Long> set = new HashSet<Long>(); 
		int j = 0;
		long weight = 0;
		for(int i=0; i<array.length; i++) {
			
			while(j<array.length && !set.contains(array[j])) {
				set.add(array[j]);
				j++; 
			}
			weight += (1L *(j-i)*(j-i+1))/2; // (n(n+1))/2		
			set.remove(array[i]);
		}
		return weight; 
	}
	
	
	// Main
	public static void main(String[] args) {
		
		ArrayWeightCalculator3 myCalc = new ArrayWeightCalculator3();
        Scanner textInputScanner = new Scanner(System.in);
        int noTestCases = Integer.parseInt(textInputScanner.nextLine());
        
        //Read Input
        for (int i=0; i < noTestCases; i++) {
            int arraySize = Integer.parseInt(textInputScanner.nextLine()); 
            long[] numbers = new long[arraySize];
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
