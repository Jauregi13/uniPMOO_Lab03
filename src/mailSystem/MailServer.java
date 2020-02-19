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
	
	private static MailServer instance;

	/**
	 * Mail Server Constructor
	 */
	private MailServer() {
		
		 this.emailList = new Email[MAXIMUM_CAPACITY];
	}
	
	public static MailServer getInstance() {
		
		if(instance == null) {
			
			instance = new MailServer();
		}
		
		return instance;
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
		
		for(int i=0;i<this.numEmails;i++) {
			
			this.emailList[i].showEmail();
			System.out.println("");
		}
	
	}
	
	
	public void resetServer() {
		
		this.emailList = null;
				
		this.numEmails = 0;
	}
	
	/**
	 * 
	 * @param client
	 */
	
	public void showInbox(MailClient client) {
		
		for(int i=0; i < this.numEmails; i++) {
			if(client.getUsername().equals(this.emailList[i].getReceiver())) {
				this.emailList[i].showEmail();
			}
		}
	}
	
	public void showSentEmails(MailClient client) {
		
		for(int i=0; i < this.numEmails; i++) {
			if(client.getUsername().equals(this.emailList[i].getSender())) {
				this.emailList[i].showEmail();
			}
		}
	}
	
	private int calculateFirstPos(String username) {
		
		boolean aurkitua = false;
		int i = 0;
		
		while(i < this.numEmails && !aurkitua) {
			
			if(this.emailList[i].getReceiver().equals(username)) {
				
				aurkitua = true;
				return i;
			}
			
			i++;
		}
		
		return -1;
	}
	
	private Email removeEmailPos(int pos) {
		
		Email removeEmail = this.emailList[pos];
		
		for(int i=0;i<this.numEmails;i++) {
			
		}
		return removeEmail;
	}
	
	public Email obtainRemoveEmail(String user) {
		int pos = calculateFirstPos(user);
		Email email = null;
		if (pos!=-1)
			email = removeEmailPos(pos);
		return email;
	}
	
	
	
	
	
}
