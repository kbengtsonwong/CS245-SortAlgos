
public class BubbleSort implements SortingAlgorithm {

	public void sort(int[] a) {
		// Increment a counter i starting at 0.
		for(int i = 0; i < a.length; i++) {
			
			// Iterate through the array starting at 0, 
			// and decrementing the end by one after each outer-loop iteration.
			for(int j = 1; j < (a.length - i); j++) {
				
				// Compare elements two at a time, swapping if the larger element is before the smaller element.
				if(a[j-1] > a[j]) 
					swap(a, j-1, j);
			}
		}
	}
	
	private void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
}
