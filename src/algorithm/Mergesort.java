package algorithm;

public class Mergesort {
	private int[] numberArray;
	private int[] helperArray;
	private int lenghts;

	public int[] sort(int[] values) {
		this.numberArray = values;
		lenghts = values.length;
		this.helperArray = new int[lenghts];
		mergesort(0, lenghts - 1);
		return values;
	}

	private void mergesort(int low, int high) {
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			mergesort(low, middle);
			// Sort the right side of the array
			mergesort(middle + 1, high);
			// Combine them both
			mergeArray(low, middle, high);
		}
	}

	private void mergeArray(int low, int middle, int high) {

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helperArray[i] = numberArray[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (helperArray[i] <= helperArray[j]) {
				numberArray[k] = helperArray[i];
				i++;
			} else {
				numberArray[k] = helperArray[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			numberArray[k] = helperArray[i];
			k++;
			i++;
		}

	}
}
