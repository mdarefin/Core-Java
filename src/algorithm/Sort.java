package algorithm;

public class Sort {

	/*
	 * Please implement all the sorting algorithm. Feel free to add helping
	 * methods.
	 */

	public int[] selectionSort(int[] array) {
		int[] list = array;
		int temp;
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] > list[j]) {
					temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}

		return list;
	}

	public int[] insertionSort(int[] array) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}

		return array;
	}

	public int[] bubbleSort(int[] array) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < array.length - 1; j++) {
				if (array[j] < array[j + 1]) // change to > for ascending sort
				{
					temp = array[j]; // swap elements
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}
		return array;
	}

	public int[] bucketSort( int[] array,int max) {

		int[] list = new int[max + 1];
        int[] sorted_sequence = new int[array.length];
 
        for (int i = 0; i < array.length; i++)
            list[array[i]]++;
 
        int outPos = 0;
        for (int i = 0; i < list.length; i++)
            for (int j = 0; j < list[i]; j++)
                sorted_sequence[outPos++] = i;
 
        return sorted_sequence;
	}

	public int[] shellSort(int[] array) {
		int temp, i, j;
		for (int increment = array.length / 2; increment > 0; increment /= 2) {
			for (i = increment; i < array.length; i++) {
				temp = array[i];
				for (j = i; j >= increment; j -= increment) {
					if (temp < array[j - increment]) {
						array[j] = array[j - increment];
					} else {
						break;
					}
				}
				array[j] = temp;
			}
		}

		return array;
	}

	public static void printSortedArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}