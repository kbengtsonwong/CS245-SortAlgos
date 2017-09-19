
public class QuickSort implements SortingAlgorithm {

	public void sort(int[] a) {
		// Helper function allows for a recursive solution.
		quicksort(a, 0, a.length-1);
	}
	
	private void quicksort(int[] a, int top, int bot) {
		// Determine the index of the pivot.  
		// Put all element smaller than the pivot before it, and all elements larger after it.
		int pivot = partition(a, top, bot);
		
		// If the section above the pivot has more than one element, quicksort that partition.
		if(top < pivot - 1)
			quicksort(a, top, pivot - 1);
		// Quicksort the top partition.
		if(pivot < bot)
			quicksort(a, pivot, bot);
	}
	
	private int partition(int[] a, int top, int bot) {
		// Determine an arbitrary pivot, in this example use the middle element of the array.
		int i = top;
		int j = bot;
		int pivot = (top + bot) / 2;
		
		// Loop until i and j have crossed.
		while(i <= j) {
			// Look for the index i of a value greater than the pivot starting from the top.
			while(a[i] < a[pivot]) 
				i++;
			// Look for the index j of a value lesser than the pivot starting from the bottom.
			while(a[j] > a[pivot]) 
				j--;
			
			// Swap i and j, then increment/decrement i and j. 
			if(i <= j) {
				if(i == pivot) 
					pivot = j;
				else if(j == pivot)
					pivot = i;
				swap(a, i++, j--);
			}
		}
		// Return the index of the pivot, or off by one.  
		return i;
	}
	
	private void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
}
