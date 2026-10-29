package OOPSjava;

public class ImmutableClass {
	
	    private final String street;
	    private final String city;
	    private final int pincode;

	    public ImmutableClass (String street, String city, int pincode) {
	        this.street = street;
	        this.city = city;
	        this.pincode = pincode;
	    }

	    public String getStreet() {
	        return street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public int getPincode() {
	        return pincode;
	    }

	    public ImmutableClass withCity(String city) {
	        return new ImmutableClass (this.street, city, this.pincode);
	    }

	    public void display() {
	        System.out.println(street + ", " + city + " - " + pincode);
	    }

	    public static void main(String[] args) {
	    	ImmutableClass  a1 = new ImmutableClass ("Gandhi Street", "Coimbatore", 641001);

	    	ImmutableClass  a2 = a1.withCity("Chennai");

	        System.out.println("Original Address:");
	        a1.display();

	        System.out.println("New Address:");
	        a2.display();
	    }
	}