
public class InsertionSort implements SortingAlgorithm {

	public void sort(int[] a) {
		// Assume all elements left of index i are sorted.
		// Step through the array starting at 1.
		for(int i = 1; i < a.length; i++) {
			
			// Store the element of interest that will be inserted into a temporary variable.
			int temp = a[i];
			
			// Initialize backward to be the preceding index.
			int backward = i-1;
			
			// While the element of interest is less than the array at position backward, keep moving backwards.
			while(backward >= 0 && temp < a[backward]) {
				a[backward+1] = a[backward];
				backward--;
			}
			
			// Insert the element into the spot before it broke the loop.
			a[backward+1] = temp;
		}
	}
}

	
