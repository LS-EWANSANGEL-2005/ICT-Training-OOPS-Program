package OOPSjava;

public class EncapsulatedPersonClasswithValidation {

	    private String name;
	    private int age;

	    public EncapsulatedPersonClasswithValidation(String name, int age) {
	        this.name = name;
	        setAge(age);
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        if (age >= 0 && age <= 120) {
	            this.age = age;
	        } else {
	            System.out.println("Invalid age!");
	        }
	    }

	    public static void main(String[] args) {
	    	EncapsulatedPersonClasswithValidation p  = new EncapsulatedPersonClasswithValidation("Angel", 21);

	        System.out.println("Name: " + p.getName());
	        System.out.println("Age: " + p.getAge());

	        p.setAge(25);
	        System.out.println("Updated Age: " + p.getAge());

	        p.setAge(150);

	    }
	}
