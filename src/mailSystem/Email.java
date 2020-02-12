package mailSystem;

public class Email {
	
	private String sender;
	private String receiver;
	private String subject;
	private String text;
	
	
	public Email(String sender, String receiver, String subject, String text) {
		
		this.sender = sender;
		this.receiver = receiver;
		this.subject = subject;
		this.text = text;
	}
	
	public Email(String sender, String receiver, String subject) {
		
		this(sender,receiver,subject,"");
	}
	
	public String getSender() {
		return sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public String getSubject() {
		return subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void showEmail() {
		
		System.out.println("Sender: " + this.sender);
		System.out.println("Receiver: " + this.receiver);
		System.out.println("Subject: " + this.subject);
		System.out.println("Text: " + this.text);
	}
	
	public boolean sameTo(Email email) {
		
		if(email.receiver.equals(this.receiver)) {
			
			return true;
		}
		
		return false;
	}

	

}
