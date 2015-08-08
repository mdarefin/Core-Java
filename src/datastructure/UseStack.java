package datastructure;

import java.util.EmptyStackException;
import java.util.Random;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop
		 * elements. Use For Each loop and while loop with Iterator to retrieve
		 * data.
		 * 
		 */
		Stack st = new Stack();
		System.out.println("stack: " + st);
		
		int oddOut = 0;
		Random rand = new Random();
		while(oddOut < 10 ){
			showpush(st, rand.nextInt(100));
			oddOut++;
		}

		System.out.println("Height object is: "+st.peek());
		showpop(st);
		showpop(st);
		showpop(st);
		try {
			showpop(st);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}

	static void showpush(Stack st, int a) {
		st.push(new Integer(a));
		System.out.println("stack: " + st);
	}

	static void showpop(Stack st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println("stack: " + st);
	}

}
