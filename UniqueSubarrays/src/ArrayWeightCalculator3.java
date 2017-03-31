import java.util.*;


public class ArrayWeightCalculator3 {

	// Constructor
	public ArrayWeightCalculator3() {}

	// Pre: array is not null
	// Post: Returns the weight of array as per specification
	public int calculateWeight(int[] array) {
		int weight = array.length;
		for(int i=0; i<array.length-1; i++) {
			HashSet<Integer> set = new HashSet<Integer>(); 
			set.add(array[i]);
			for(int j=i+1; j<array.length; j++) {
				if(set.contains(array[j])) {
					break;
				} else {
					weight += j-i + 1; 
					set.add(array[j]);
				}
				
			}
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
