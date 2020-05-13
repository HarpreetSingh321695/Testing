package Immutability;

public class Address 
{
	String street;
	String Area;
	Address2 address2;
	
	public Address(String street, String area, Address2 address2) {
		super();
		this.street = street;
		Area = area;
		this.address2 = address2;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public Address2 getAddress2() {
		return address2;
	}

	public void setAddress2(Address2 address2) {
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", Area=" + Area + ", address2=" + address2 + "]";
	}
	
	
	
	

	
}
