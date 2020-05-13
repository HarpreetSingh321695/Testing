package FailSafe;

import java.util.Hashtable;
import java.util.Vector;

public class MyClass implements Runnable
{
	Vector<String> v = new Vector<String>();
	
	Hashtable<String, String> ht = new Hashtable<String, String>();
	
	public void run() 
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		v.add("new");
//		System.out.println("Added new element..");
		
		
		ht.put("5", "loooooooooooool");
		System.out.println("Added new element..");
	}

}