import java.util.*;

public class ArrayWeightCalculator {
	
	private ArrayList<Integer> parentArray; 
	public ArrayList<ArrayList<Integer>> myContigousSubarrays;
	
	public ArrayWeightCalculator() {}
	
	// Constructor
	// Pre: parentArray is not null
	// Post: Extracts all contigous subarrays from parentArray and stores them in myContigousSubarrays Instance variable
	public ArrayWeightCalculator(ArrayList<Integer> parentArray) {	
		assert(parentArray != null);
		this.myContigousSubarrays = new ArrayList<ArrayList<Integer>>(); 
		this.parentArray = parentArray; 
		for(int i=1; i<=parentArray.size(); i++) {
			this.extractContigousSubarraysOfLength(i);
		}
	}
	
	// Pre: Instance var parentArray has been initialized and is not null. Length is greater than 0
	// Post: Finds all contigous subarrays of length 'length' and adds them to myContigousSubarrays
	//       instance var
	public void extractContigousSubarraysOfLength(int length) {		
		assert(this.parentArray != null);
		assert(length > 0);		
		for(int i=0; i<=this.parentArray.size() - length; i++) {
			ArrayList<Integer> singleContigousSubarray = new ArrayList<Integer>();
			for(int j=i; j<i+length; j++) {
				singleContigousSubarray.add(new Integer(this.parentArray.get(j)));
			}
			if(!singleContigousSubarray.isEmpty()) {
				this.myContigousSubarrays.add(singleContigousSubarray);
			}
		}
	}
	
	// Pre: Instance var myContigousSubarrays has been initialized and is not null
	// Post: Returns the weight of this.parentArray
	public int calculateParentArrayWeight() {
		int weight = 0;
		for (int i=0; i<this.myContigousSubarrays.size(); i++) {
			weight += calculateSubarrayWeight(this.myContigousSubarrays.get(i));
		}
		return weight;
	}
	
	// Pre: array is not null
	// Post: Returns 0 if array is not unique. Returns its length otherwise
	public int calculateSubarrayWeight(ArrayList<Integer> array) {
		assert(array != null);
		if(this.isUniqueArray(array)) {
			return array.size();
		}
		return 0;
	}

	// Pre: array is not null
	// Post: Returns true if each element in the array appears only once
	public boolean isUniqueArray(ArrayList<Integer> array) {		
		assert(array != null);	
		for(int i=0; i<array.size()-1; i++) {
			for(int j=i+1; j<array.size(); j++) {
				if( array.get(i).equals(array.get(j))) {
					return false;
				}
			}
		}		
		return true;
	}
	
	
	/*---------------- MAIN --------------*/
	public static void main (String[] args) throws Exception {
	
        //Scanner
        Scanner textInputScanner = new Scanner(System.in);
        int noTestCases = Integer.parseInt(textInputScanner.nextLine());

        ArrayList<ArrayList<Integer>> arraysForWeightCalculation = new ArrayList<ArrayList<Integer>>();
        
        //Read Input
        for (int i=0; i < noTestCases; i++) {
            textInputScanner.nextLine(); // ignore       
            String myStringNumbers = textInputScanner.nextLine();           
            String[] numbersStringArray = myStringNumbers.split(" ");         
            ArrayList<Integer> myNumbers = new ArrayList<Integer>();       
            for(int j=0; j<numbersStringArray.length; j++) {
            	myNumbers.add(Integer.parseInt(numbersStringArray[j]));
            }
            arraysForWeightCalculation.add(myNumbers); 
        }
        textInputScanner.close(); 
       
        for(int i=0; i<arraysForWeightCalculation.size(); i++) {
        	ArrayWeightCalculator myCalc = new ArrayWeightCalculator(arraysForWeightCalculation.get(i));
        	System.out.println(myCalc.calculateParentArrayWeight());
        }
   

	
	}
}