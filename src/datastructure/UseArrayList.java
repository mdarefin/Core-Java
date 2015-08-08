package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		int oddOut = 0;
		
		ArrayList<Integer> al = new ArrayList();
		Random rand = new Random();
		
		while(oddOut < 10 ){
			al.add(rand.nextInt(100));
			oddOut++;
		}
		
		al.stream().forEach(s -> System.out.println(s));
		
		//removing elements
		al.remove(0);
	 
		for (Integer integer : al) {
			if(integer%2==0){
				
			}
		}
		
		al.stream().forEach(s -> System.out.println("2nd Time after remove "+s));
		
		//retriving element
		int retval=al.get(3);
		System.out.println("Retrieved element is = " + retval);	  
		//don't contain peek method 
		
	}

}
