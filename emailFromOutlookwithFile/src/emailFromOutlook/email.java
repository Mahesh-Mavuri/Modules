package emailFromOutlook;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;



public class email {
public static void main(String[] args) {
	

	
	final String username = "mavuri.mahesh@trianz.com";
	final String pwd = "eIk!541Vig7";
	String userEmail = "mavuri.mahesh@trianz.com";
	Properties props = new Properties();
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.host", "m.outlook.com");
	props.put("mail.smtp.port", "587");
	Session session = Session.getInstance(props,
			new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(username, pwd);
		}
	});
	try {
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("mavuri.mahesh@trianz.com"));

		message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(userEmail));

		message.setSubject("Email from outlook");
		BodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setText("Hey Mahesh"+","
				+ "\n\n I am sending you sample email from java");
		// Create a multi-part message
        Multipart multipart = new MimeMultipart();

        // Set text message part
        multipart.addBodyPart(messageBodyPart);

        // Part two is attachment
        messageBodyPart = new MimeBodyPart();
        String filename = "C:\\Users\\mavuri.mahesh\\Desktop\\104799_FindMyDoc_SRS.docx";
        DataSource source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(messageBodyPart);

        // Send the complete message parts
        message.setContent(multipart);

		Transport.send(message);

		System.out.println("Email Sent Successfully");
	

	} catch (MessagingException e) {
		throw new RuntimeException(e);
	}
	
}

}
