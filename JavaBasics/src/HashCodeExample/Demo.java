package HashCodeExample;

import java.util.HashMap;

public class Demo 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		HashMap<MyClass, MyAlternateClass> map = new HashMap<MyClass, MyAlternateClass>();
		
		MyClass my = new MyClass(1, "Harpreet");
		MyClass my2 = new MyClass(1, "Harpreet Singh");

		map.put(new MyClass(1, "Harpreet"), new MyAlternateClass(1));
		map.put(new MyClass(1, "Harpreet Singh"), new MyAlternateClass(2));
	
		System.out.println(map.get(new MyClass(1, "Harpreet")));
		
		
		
	
		
	}

}
