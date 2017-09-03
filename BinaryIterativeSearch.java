package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	public String searchName() {
		return "Iterative Binary Search";
	}

	
	public int search(int[] arr, int target) {
		
		// Set min and max array index trackers.
		int min = 0;
		int max = arr.length - 1;
		
		
		while(min <= max) {
			// Calculate mid at each iteration.
			int mid = (min + max) / 2;
			
			// Compare the target to mid, returning the index if found and adjusting otherwise. 
			if(target == arr[mid])
				return mid;
			else if(target < arr[mid])
				max = mid - 1;
			else
				min = mid + 1;
		}
		
		return -1;
	}

}
