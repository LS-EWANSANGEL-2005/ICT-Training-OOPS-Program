package OOPSjava;

public class StaticMembersAndInstanceCounter {
	    static int count = 0;

	    static {
	        System.out.println("Static block executed");
	    }

	    StaticMembersAndInstanceCounter() {
	        count++;
	    }

	    static int getCount() {
	        return count;
	    }

	    public static void main(String[] args) {
	    	StaticMembersAndInstanceCounter s1 = new StaticMembersAndInstanceCounter();
	    	StaticMembersAndInstanceCounter s2 = new StaticMembersAndInstanceCounter();
	    	StaticMembersAndInstanceCounter s3 = new StaticMembersAndInstanceCounter();

	        System.out.println("Total students: " + StaticMembersAndInstanceCounter.getCount());
	    }
	}
