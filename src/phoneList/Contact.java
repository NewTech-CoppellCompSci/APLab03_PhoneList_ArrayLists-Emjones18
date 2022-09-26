package phoneList;

/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */



public class Contact {

	private String name;
	private long num;
	
	public Contact(String name, long num) {
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public long getNum() {
		return num;
	}
	public String toString() {
		return "Name: " + name + "\nPhone Number: " + num;
	}
}
