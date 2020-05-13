package AllAboutHashMaps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class TestingCME 
{
	public static void main(String[] args)
	{
		Hashtable<String, String> hm = new Hashtable<String, String>();
		
		
		
		hm.put("4", "Four");
		hm.put("5", "Five");
		hm.put("6", "Six");
		hm.put("7", "Seven");
		hm.put("8", "Eight");
		hm.put("9", "Nine");
		hm.put("10", "Ten");
		hm.put("11", "Eleven");
		
		Set<Entry<String, String>>  s = hm.entrySet();
		
		Iterator<Entry<String, String>> itr = s.iterator();
		
		while (itr.hasNext())
		{
			System.out.println("Iterating: " + itr.next());
			itr.remove();
		}
		
		
		
	}

}
