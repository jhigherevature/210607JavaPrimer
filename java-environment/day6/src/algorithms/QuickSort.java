package algorithms;

public class QuickSort {
	/* Simulator Method */
	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		
		System.out.println("Given Array");
		printArray(arr);
		
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, arr.length-1);
		
		System.out.println("\nSorted array");
		printArray(arr);
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public void quickSort(int arr[], int begin, int end) {
		if (begin < end) {
			int p_index = partition(arr, begin, end);
			
			quickSort(arr, begin, p_index-1);
			quickSort(arr, p_index+1, end);
		}
	}
	
	private int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = begin - 1;
		
		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot ) {
				i++;
				
				swap(arr, i, j);
			}
		}
		
		swap(arr, i+1, end);
		
		return i+1;
	}
	
	/* Swap position of two indexs of an array */
	void swap (int[] arr, int l_index, int r_index) {
		int temp = arr[l_index];
		arr[l_index] = arr[r_index];
		arr[r_index] = temp;
	}
}
