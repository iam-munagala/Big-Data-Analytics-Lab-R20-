/* implemnent the stack using stack class */


import java.util.*;

public class stack {
	public static void main(String [] args) {
		Stack <Integer> st = new Stack<>();
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = ip.nextInt();
		
		for(int i =0;i<n;i++) {
			st.push(i+1);
			
		}
		
	System.out.println("Stack elements are : "+st);
	System.out.println("Popped element is :"+st.pop());
	System.out.println("peek element is :"+st.peek());
	System.out.println("is empty ?"+st.empty());
	System.out.println("Size of the stack is :"+st.size());
		
	}
}