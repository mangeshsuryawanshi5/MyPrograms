package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(100);
		v.add("Mumbai");
		v.add(88.2f);
		v.add(100);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
		System.out.println(v.indexOf("Mumbai"));
		System.out.println("=====for each loop======");
		for(Object o:v)
		{
			System.out.println(o);
		}
		System.out.println("=====Iterator======");
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====ListIterator======");
		
		ListIterator li = v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("=====Enumeration======");
		
		Enumeration en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		

	}

}
