/* Implementation Queue using Queue Class */

import java.util.*;


public class queue {
	public static void main(String [] args) {
		Queue <Integer> q = new LinkedList<>();
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		System.out.println("Elements of queue :"+q);
		int removed_element = q.remove();
		System.out.println("removed element is : "+removed_element);
		int head_element = q.peek();
		System.out.println("head of the queue is :"+head_element);
		System.out.println("size of the queue is :"+q.size());
		
	}
}