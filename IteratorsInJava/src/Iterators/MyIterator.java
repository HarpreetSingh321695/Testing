package Iterators;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class MyIterator 
{
	public static void main(String[] args)
	{
		int count = 0;
		List<String> al = new ArrayList<String>();
		Vector<String> v = new Vector<String>();
		
		
	    v.add("hello");
		v.add("lol");
		v.add("wtf");
		v.add("rofl");
	
		al.add("hello");
		al.add("lol");
		al.add("wtf");
		al.add("rofl");
		
		// iterator Method present inside ArrayList Class..,
		// 	It returns the Object of the "inner class" of ArrayList that implements Iterator Interface..
		Iterator<String> itr = al.iterator(); // fail - fast
        Enumeration<String> en = v.elements(); // fail - safe
        
        while(en.hasMoreElements())
		{
			System.out.println("Element: " + en.nextElement());
			++count;
			if(count < 2)
			{
				v.add("new");
			}
			
			//itr.remove(); // IllegalSateException
		}
        System.out.println(v);
		
		
		
		
		while(itr.hasNext())
		{
			System.out.println("Removing: " + itr.next());
			itr.remove();
			//al.add("new"); // ConcurrentModificationException
			//itr.remove(); // IllegalSateException
		}
		
		//itr.next(); // NoSuchElementException
		
		System.out.println(al); // Empty, because all the elements removed by the iterator..
	}

}
