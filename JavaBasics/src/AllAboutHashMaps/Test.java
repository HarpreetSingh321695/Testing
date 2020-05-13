package AllAboutHashMaps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Test 
{
	
	
	public static void main(String[] args)
	{
		Hashtable<String, String> hm = new Hashtable<String, String>();
		
		hm.put("4", "Four");
		hm.put("5", "Five");
		hm.put("6", "Four");
		hm.put("7", "Five");
		hm.put("8", "Four");
		hm.put("9", "Five");
		hm.put("10", "Four");
		hm.put("11", "Five");
		
		Set<Entry<String, String>>  s = hm.entrySet();
		
		Iterator<Entry<String, String>> itr = s.iterator();
		
		while (itr.hasNext())
		{
			System.out.println("Iterating: " + itr.next());
			hm.put("1", "newly added");
		}
		
		
		
	}
			

}
