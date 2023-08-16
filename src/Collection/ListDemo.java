package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

// array list initialization and some working with Iteration
public class ListDemo {
	
	static void show(int n)
	{
		if(n>7)
			System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		System.out.println(al);

		ArrayList<Object> al1 = new ArrayList<Object>(Arrays.asList(1, "hello", 'a'));

		System.out.println(al1.get(0));
		System.out.println(al1.get(1));

		System.out.println(al1);

		ArrayList<Integer> al2 = new ArrayList<Integer>();

		al2.add(23);
		al2.add(4);
		al2.add(67);
		al2.add(4);
		al2.set(0, 34);// it replace new value with old value(old value will be removed)
		al2.add(0, 34);// it shift the value to add at some index
		al2.add(4);
		System.out.println(al2);
		al2.remove(4);

		System.out.println(al2);
		System.out.println(al2.lastIndexOf(4));

		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(5);
		al3.add(6);
		al3.add(7);
		al3.add(8);
		al3.add(9);
		al3.add(10);

// Iteration of the elements of the arrayList

//with for loop
		// for(initialization,condition,updation)
		for (int i = 0; i < al3.size(); i++) {
			System.out.println(al3.get(i));
		}

//for each loop
		// for (Integer x : al3) {// we can also use var inplace of wrapper class
		for (var x : al3) {
			System.out.println(x);
		}

// using lambda expression 
		al3.forEach(x -> System.out.println(x));

// using iterator
		System.out.println("*------------*");
		// Iterator<Integer> it=al3.iterator(); we can use listIterator
		ListIterator<Integer> it = al3.listIterator();// list iterator allowas birdirectioanl movement
		// like methods hasPrevious, hasPreviousIndex
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("**------**-------**");
//using resolution operator
		al3.forEach(System.out::println);
		System.out.println("*---calling method outside demo---*");
		al3.forEach(n->show(n));

	}

}