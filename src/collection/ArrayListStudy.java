package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		
		al.add("Velocity");
		al.add(123.123);
		al.add('A');
		al.add(null);
		al.add("Pune");
		al.add('B');
		al.add('B');
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		
		 boolean abc = al.add("Pune");
		al.add(0, "Good Morning");
		System.out.println(al);
		System.out.println(abc);
		
//		al.remove(0);
		al.remove("Good Morning");
		
		System.out.println(al);
		
		System.out.println(al.contains('B'));
		System.out.println(al.isEmpty());
		System.out.println(al.get(6));
		
		System.out.println("==========Using for loop===========");
		
		for(int i=0;i<al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("=======Iterator==========");
		
		Iterator it=al.iterator(); //Uing Iterator
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=======for each loop==========");
		
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		ArrayList<Integer> in=new ArrayList<>();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		
		System.out.println("=================");
		
		Iterator<Integer> in1 = in.iterator();
		while(in1.hasNext())
		{
			System.out.println(in1.next());
		}
		
		
		
	}

}
