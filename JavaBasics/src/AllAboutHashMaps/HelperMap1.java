package AllAboutHashMaps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class HelperMap1 implements Runnable
{
	ConcurrentHashMap<String, String> hm;
	
	public HelperMap1(ConcurrentHashMap<String, String> hm)
	{
		this.hm = hm;
	}

	@Override
	public void run() 
	{
		System.out.println("Adding element..");
		hm.put("1", "Harpreet");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
