
public class MergeSort implements SortingAlgorithm {
		private int[] array;
		private int[] helper;
		private int length;
		
	public MergeSort() {
		length = 0;
	}
	
	public void sort(int[] a) {
		array = a;
		length = a.length;
		helper = new int[length];
		mergeSort(0, length - 1);
	}
	
	private void mergeSort(int low, int high) {
		
		// The array is sorted when low surpasses high.
		if(low < high) {
			int mid = low + (high - low) / 2;
			
			// Sort the left side of the array.
			mergeSort(low, mid);
			
			// Sort the right side of the array.
			mergeSort(mid + 1, high);
			
			// Put both side back together.
			merge(low, mid, high);
		}
	}
	
	private void merge(int low, int mid, int high) {
		for(int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		int i = low;
        int j = mid + 1;
        int k = low;
        
        // Copy the smallest values from either the left or the right side back
        // to the original array.
        while (i <= mid && j <= high) {
            if (helper[i] <= helper[j]) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= mid) {
            array[k] = helper[i];
            k++;
            i++;
        }
	}

}
