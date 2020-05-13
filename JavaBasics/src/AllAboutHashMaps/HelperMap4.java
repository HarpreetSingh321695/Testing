package AllAboutHashMaps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

public class HelperMap4 implements Runnable
{
	ConcurrentHashMap<String, String> hm;
	
	public HelperMap4(ConcurrentHashMap<String, String> hm) 
	{
		this.hm = hm;
	}

	@Override
	public void run() 
	{

		Set<Entry<String, String>>  s = hm.entrySet();
		
		Iterator<Entry<String, String>> itr = s.iterator();
		
		while (itr.hasNext())
		{
			System.out.println("Iterating: " + itr.next());
			
			hm.put("3", "amazing");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println(hm);
	}

}
