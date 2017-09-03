package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	public String searchName() {
		return "Binary Recursive Search";
	}

	public int search(int[] arr, int target) {
		// Call and return the helper function.
		return binaryRecursive(arr, target, 0, arr.length-1);
	}
	
	// Helper function allows for min and max arguments for a recursive solution.
	private int binaryRecursive(int[] arr, int target, int min, int max) {
		
		// Base case: The target is not in the array; this occurs when the mid and max indices have swapped.
		if(min > max)
			return -1;
		
		// Recursive case: Split the array in half, and compare the value of the mid index to the target.  
		int mid = (min + max) / 2;
		if(arr[mid] == target) 
			return mid;
		else if(arr[mid] < target) 
			return binaryRecursive(arr, target, mid+1, max);
		else
			return binaryRecursive(arr, target, min, mid-1);
 	}
	

}
