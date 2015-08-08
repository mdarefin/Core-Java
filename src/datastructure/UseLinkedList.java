package datastructure;

import java.util.LinkedList;
import java.util.Random;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		int oddOut = 0;
		LinkedList<Integer> list = new LinkedList();
		Random rand = new Random();
		
		while(oddOut < 10 ){
			list.add(rand.nextInt(100));
			oddOut++;
		}
		
		list.stream().forEach(s -> System.out.println(s));
		
		//removing elements
		list.remove(0);
	 
		for (Integer integer : list) {
			if(integer%2==0){
				
			}
		}
		
		list.stream().forEach(s -> System.out.println("2nd Time after remove "+s));
		
		//retriving element
		int retval=list.get(3);
		System.out.println("Retrieved element is = " + retval);	  
		
		// peek at the head of the list
		System.out.println("Height number is: " + list.peek());
		
	}

}
