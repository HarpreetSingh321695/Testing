package Immutability;

public final class MyImmutableClassPerson 
{
	private final String name;
	private final Double Salary;
	private final Address address;
	
	public MyImmutableClassPerson(String name, Double salary, Address address) {
		super();
		this.name = name;
		Salary = salary;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return Salary;
	}
	public Address getAddress() {
		// Shallow Copy
//		return address; 
		
		// Deep Copy
		Address newAddress = new Address(address.getStreet(), address.getArea(), new Address2(address.getAddress2().getStreet(), address.getAddress2().getArea()));
		return newAddress;
	}

	@Override
	public String toString() {
		return "MyImmutableClassPerson [name=" + name + ", Salary=" + Salary + ", address=" + address + "]";
		
	}
}
