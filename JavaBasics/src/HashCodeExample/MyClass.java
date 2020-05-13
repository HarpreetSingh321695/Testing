package HashCodeExample;

import java.util.Arrays;

public class MyClass 
{
	int id = 1;
	String name;
	
	int hash;
	char value[];
	
	public MyClass(int id, String name)
	{
		this.id = id;
		this.name = name;
		
	}
	
	@Override
	public int hashCode() 
	{
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		MyClass x = (MyClass) obj;
		if(this.name.equals(x.name) && this.id == x.id)
		{
			return true;
		}
		return false;
	}
}


