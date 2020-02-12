package mailSystem;

/**
 * Class for managing mail servers
 * @author juanmi
 *
 */
public class MailServer {
	
	//Attribute for storing emails
	private Email emailList[];

	//Attribute for Maximum capacity
	private final int MAXIMUM_CAPACITY = 100;

	//Attribute for number of stored emails
	private int numEmails = 0;

	/**
	 * Mail Server Constructor
	 */
	public MailServer() {
		
		 this.emailList = new Email[MAXIMUM_CAPACITY];
	}
	
	/**
	 * Method that stores an Email at the end of the list
	 * @param pMail Email to be stored
	 */
	public void storeEmail(Email pMail) {
		
		this.emailList[numEmails] = pMail;
		this.numEmails++;

	}
	
	/**
	 * Method for showing all emails stored in the server
	 */
	public void showAllEmails() {
		
		for(int i=0;i<this.emailList.length;i++) {
			
			this.emailList[i].showEmail();
		}
	
	}
	
	
	
}
