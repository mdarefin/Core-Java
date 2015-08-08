package datastructure;

import java.util.PriorityQueue;
import java.util.Random;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve
		 * elements. Use For Each loop and while loop with Iterator to retrieve
		 * data.
		 * 
		 */

		// create priority queue
		PriorityQueue<Integer> prq = new PriorityQueue<Integer>();

		Random rand = new Random();
		// insert values in the queue
		for (int i = 1; i < 10; i++) {
			prq.add(rand.nextInt(100));
		}

		System.out.println("Initial priority queue values are: " + prq);

		// get the head from the queue
		Integer head = prq.peek();

		System.out.println("Head of the queue is: " + head);

		// remove 7 from the queue
		boolean isremoved = prq.remove(prq.peek());

		System.out.println("Priority queue values after remove head: " + prq);

	}

}
