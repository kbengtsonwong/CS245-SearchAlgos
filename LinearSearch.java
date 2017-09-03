package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {

	public String searchName() {
		return "Linear Search";
	}

	// Note that this is a far less efficient search algorithm compared to binary search.
	public int search(int[] arr, int target) {
		
		// Step through the array comparing the target to the current value of the array. 
		// If found, return the index of the match. 	
		for(int i = 0; i < arr.length; i++) {
			if(target == arr[i]) {
				return i;
			}
		}
		// If not found, return -1.
		return -1;
	}

}
