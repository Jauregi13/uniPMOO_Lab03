package mailSystem;

public class MailClient {
	
	private MailServer server;
	private String username;
	
	
	public MailClient(MailServer server, String username) {
		
		this.server = server;
		this.username = username;
		
	}

	public String getUsername() {
		return username;
	}
	
	
	public void sendEmail(String receiver, String subject, String text) {
		
		Email emailBerria = new Email(this.username,receiver,subject,text);
		
		this.server.storeEmail(emailBerria);
		
	}

}
