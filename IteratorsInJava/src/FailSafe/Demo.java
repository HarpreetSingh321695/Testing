package FailSafe;

import java.util.Enumeration;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException
	{
		MyClass mc = new MyClass();
//		mc.v.add("lol");
//		mc.v.add("wtf");
//		mc.v.add("rofl");
//		mc.v.add("hello");
		
		mc.ht.put("1", "wtf");
		mc.ht.put("2", "lol");
		mc.ht.put("3", "hello");
		mc.ht.put("4", "hi");

		
		Thread t = new Thread(mc);
		t.start();
		
		
		Enumeration<String> e = mc.ht.elements();
		while (e.hasMoreElements())
		{
			
			Thread.sleep(1000);
			System.out.println(e.nextElement());
			
		}
		
		System.out.println(mc.ht);
	}

}
