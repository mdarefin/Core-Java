package algorithm;

import java.util.Random;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm use by applying into
	 * (num array). Display the execution time for each sorting.
	 */
	final static long startTime = System.currentTimeMillis();

	public static void main(String[] args) {

		int[] num = new int[10];

		Random rand = new Random();
		int maxForBucketSort = 0;
		for (int i = 0; i < num.length; i++) {

			num[i] = rand.nextInt(1000);
			if (maxForBucketSort < num[i]) {
				maxForBucketSort = num[i];
			}

		}

		// in order to check each sort separately you might need to comment the
		// other one

		// Example for Selection Sort
		Sort algo = new Sort();

		// selection sort
		System.out.println("...............after selection Sort............");
		printSort(algo.selectionSort(num));

		// insertion sort
		System.out.println("...............after Insertion Sort............");
		printSort(algo.insertionSort(num));

		// bubblesort
		System.out.println("...............after bubble Sort............");
		printSort(algo.bubbleSort(num));
		// merge sort
		Mergesort mergeSorter = new Mergesort();
		System.out.println("...............after MergeSort............");
		printSort(mergeSorter.sort(num));
		// quick sort
		QuickSort quickSorter = new QuickSort();
		System.out.println("...............after QuickSort............");
		printSort(quickSorter.sort(num));
		// heap sort
		HeapSort heapSort = new HeapSort();
		System.out.println("...............after HeapSort............");
		printSort(heapSort.sort(num));
		// Bucket Sort
		System.out.println("...............after BucketSort............");
		printSort(algo.bucketSort(num, maxForBucketSort));
		// shell sort
		System.out.println("...............after ShellSort............");
		printSort(algo.shellSort(num));
	}

	// this method print sort
	public static void printSort(int[] num) {
		System.out.println("");
		for (int i = 0; i < num.length; i++) {

			System.out.println(num[i]);

		}
		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		System.out.println("Total Execution Time in ms : " + executionTime + " sec");
	}

}
