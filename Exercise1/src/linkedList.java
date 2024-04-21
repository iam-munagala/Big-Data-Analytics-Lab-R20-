
import java.util.*;

public class linkedList{
	public static void main (String [] args) {
		LinkedList<String> people = new LinkedList<>();
		people.add("Dilli");
		people.add("rolex");
		people.add("Eren Yeager");
		people.add("Mikasa Ackkermann");
		people.add("Armin");
		System.out.println("Linked List :"+ people);
		String removed_element = people.remove(0);
		System.out.println("Removed Element is :"+removed_element);
		System.out.println("Updated Linked List :"+people);
		
	}
}