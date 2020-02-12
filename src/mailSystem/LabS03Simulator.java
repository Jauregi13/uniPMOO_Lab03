package mailSystem;

/**
 * Class for simulating mail server activity
 * @author juanmi
 *
 */
public class LabS03Simulator {

	/**
	 * Main method
	 * @param args - No parameters required
	 */
	public static void main(String[] args) {
		testEmail();
		testEmailSending();
	}
	
	public static void testEmail() {
		
		//Create email instance using Constructor with all fields
		Email email1 = new Email("name1", "name2", "Mail subject 1", "Mail text 1");
	
		//Create email instance using Constructor with all fields but "text"
		Email email2 = new Email("name2", "name1", "Mail subject 2");
	
		//Use all different setters on email1 and email2
		System.out.println("email1 attributes (by getters):\n");
		System.out.println("Sender: " + email1.getSender());
		System.out.println("Receiver: " + email1.getReceiver());
		System.out.println("Subject: " + email1.getSubject());
		System.out.println("Text: " + email1.getText());
	
		System.out.println("\nemail2 attributes (by getters):");
		System.out.println("Sender: " + email2.getSender());
		System.out.println("Receiver: " + email2.getReceiver());
		System.out.println("Subject: " + email2.getSubject());
		System.out.println("Text: " + email2.getText());

		//Use setter to add text to email2
		email2.setText("Mail text 2 - by setter");
	
		//Check the value of text attribute has changed (by its corresponding setter)
		System.out.println("\nText: " + email2.getText());
	
		//Compare two Email receivers
		System.out.println("Compare receivers of the two email (should be false):" + email2.sameTo(email1));
	
		//Create another email and compare receivers in emails 2 and 3
		Email email3 = new Email("name2", "name1", "Mail subject 3", "Mail text 3");
		System.out.println("Compare receivers of the two email (should be true):" + email3.sameTo(email2));
		
	}
	
	/**
	 * Method for testing Email sending process
	 */
	public static void testEmailSending() {

		
		MailServer ms1 = new MailServer();
		
		MailClient mc1 = new MailClient(ms1, "name1");
		MailClient mc2 = new MailClient(ms1, "name2");
		
		System.out.println("Sending 3 emails...");
		
		mc1.sendEmail("name2", "Mail subject 1", "Mail text 1");
		mc2.sendEmail("name1", "Mail subject 2", "Mail text 2");
		mc1.sendEmail("name2", "Mail subject 3", "Mail text 3");
		
		System.out.println("Show all emails in the server:");
		ms1.showAllEmails();

	}

}
