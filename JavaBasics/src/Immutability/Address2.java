package Immutability;

public class Address2 
{
	String street;
	String area;
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Address2(String street, String area) {
		super();
		this.street = street;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address2 [street=" + street + ", area=" + area + "]";
	}
	
	
	
	

}
