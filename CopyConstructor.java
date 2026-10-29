package OOPSjava;

public class CopyConstructor {
	
	    String title;
	    String author;
	    double price;

	    CopyConstructor(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

	    // Copy constructor
	    CopyConstructor(CopyConstructor b) {
	        this.title = b.title;
	        this.author = b.author;
	        this.price = b.price;
	    }

	    void display() {
	        System.out.println(title + " | " + author + " | " + price);
	    }

	    public static void main(String[] args) {
	    	CopyConstructor b1 = new CopyConstructor("Java", "James", 500);
	    	CopyConstructor b2 = new CopyConstructor(b1);

	        b2.title = "Python";
	        b2.price = 600;

	        System.out.println("Original Book:");
	        b1.display();

	        System.out.println("Copied Book:");
	        b2.display();
	    }
	}
