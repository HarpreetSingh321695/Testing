package HashCodeExample;

public class MyAlternateClass 
{
	int x;
	
	public MyAlternateClass(int x)
	{
		this.x = x;
	}

	@Override
	public String toString() {
		return "[x=" + x + "]";
	}

}
