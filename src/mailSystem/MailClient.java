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
	
	/**
	 * 
	 * @param receiver Email-a jasoko duen erabiltzailearen izena
	 * @param subject Email-aren goiburua
	 * @param text Email-aren gorputza edo textua
	 * 
	 * Metodo honek mezu bat bidaliko du 
	 */
	public void sendEmail(String receiver, String subject, String text) {
		
		Email emailBerria = new Email(this.username,receiver,subject,text);
		
		this.server.storeEmail(emailBerria);
		
	}
	
	public void showMyInbox() {
		
	}

}
