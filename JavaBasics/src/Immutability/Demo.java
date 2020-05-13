package Immutability;

public class Demo 
{
	public static void main(String[] args)
	{
		MyImmutableClassPerson p = 
				new MyImmutableClassPerson("Harpreet", 30.0, new Address("Westfield Street", "Downtown", new Address2("DuffleDo", "Sheffel")));
		
		System.out.println(p);
		
		p.getAddress().setArea("gross");
		p.getAddress().setStreet("bevel");
		p.getAddress().setAddress2(new Address2("Clinotn", "Manchester"));
		p.getAddress().getAddress2().setStreet("Clinton");
		p.getAddress().getAddress2().setArea("Mobin");
		
		// Still no change to the existing object "p" because its immutable.. 
		// Once created cannot be changed.. 
		// If we make change, we return the deep copy (new object reference) and not the shallow copy(direct reference)
		System.out.println(p);
		
		
		p.getAddress();
		
		
	}
	
}
