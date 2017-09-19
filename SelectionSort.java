
public class SelectionSort implements SortingAlgorithm{

	public void sort(int[] a) {
		// Linearly step through the array.
		for(int i = 0; i < a.length; i++) {	
			
			// Temporarily set the current index to be the lowest value. 
			int low = i;
			
			// At each i, step through i + 1 to the end of the array, looking for the lowest value.
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < a[low]) 
					low = j;
			}
			// Swap the smallest element into index i.
			swap(a, i, low);
		}
	}
	
	private void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	
	
}
