package AllAboutHashMaps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException
	{
		ConcurrentHashMap<String, String> hm = new ConcurrentHashMap<String, String>();
		
		
		hm.put("4", "Four");
		hm.put("5", "Five");
		hm.put("6", "Four");
		hm.put("7", "Five");
		hm.put("8", "Four");
		hm.put("9", "Five");
		hm.put("10", "Four");
		hm.put("11", "Five");
		
		
		HelperMap1 h1 = new HelperMap1(hm);
		Thread t0 = new Thread(h1);
		
		HelperMap2 h2 = new HelperMap2(hm);
		Thread t1 = new Thread(h2);
		
		HelperMap3 h3 = new HelperMap3(hm);
		Thread t2 = new Thread(h3);
		

		HelperMap4 h4 = new HelperMap4(hm);
		Thread t3 = new Thread(h4);
		
		t3.start();
		
		t3.join();
		
		t0.start();
		t1.start();
		t2.start();
		
	}
}
