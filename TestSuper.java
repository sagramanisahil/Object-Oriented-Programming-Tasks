class Message {
    protected String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}

class SMS extends Message {
    private String recipientContactNo;

    public SMS(String text, String recipientContactNo) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }

    public String toString() {
        return super.toString() + " To: " + recipientContactNo;
    }
}

class Email extends Message {
    private String sender;
    private String receiver;
    private String subject;

    public Email(String text, String sender, String receiver, String subject) {
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return "From: " + sender + ", To: " + receiver + ", Subject: " + subject + "\n" + super.toString();
    }
}

public class TestMessage {
    public static void main(String[] args) {
        Email email = new Email("This is an email message.", "sender@example.com", "receiver@example.com", "Test Email");
        SMS sms = new SMS("This is an SMS message.", "1234567890");

        System.out.println("Email: " + email);
        System.out.println("SMS: " + sms);

        System.out.println("Contains keyword 'email' in email: " + ContainsKeyword(email, "email"));
        System.out.println("Contains keyword 'SMS' in email: " + ContainsKeyword(email, "SMS"));
    }

    public static boolean ContainsKeyword(Message messageObject, String keyword) {
        return messageObject.toString().toLowerCase().contains(keyword.toLowerCase());
    }
}
