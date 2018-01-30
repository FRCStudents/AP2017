import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.AddressException;
 
public class SendGMail {
 
 public static void main(String[] args) throws Exception{
 
 final String smtp_host = "smtp.gmail.com";
 final String smtp_username = "efraimmkrug@gmail.com";
 final String smtp_password = "torah613";
 final String smtp_connection = "SSL";  // Use 'TLS' or 'SSL' connection
 
 final String toEmail="efraimmkrug@gmail.com";
 final String fromEmail="ekrug@foxboroughrcs.org";
 
 Properties props = new Properties();
 props.put("mail.smtp.auth", "true");
 
    if (smtp_connection.equals("TLS")) {
 props.put("mail.smtp.starttls.enable", "true");
 props.put("mail.smtp.port", "587");
 } else{
 props.put("mail.smtp.socketFactory.port", "465");
 props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
 props.put("mail.smtp.port", "465");
 }
 
 Session session = Session.getInstance(props,
   new javax.mail.Authenticator() {
 protected PasswordAuthentication getPasswordAuthentication() {
 return new PasswordAuthentication(smtp_username, smtp_password);
 }
   });
 
 try {
 Message msg = new MimeMessage(session);
 msg.setFrom(new InternetAddress(fromEmail, "NoReply"));
 msg.addRecipient(Message.RecipientType.TO,
 new InternetAddress(toEmail, "Mr. Recipient"));
 msg.setSubject("Welcome To JavaMail API");
 msg.setText("JavaMail API Test - Sending email example through remote smtp server");
 Transport.send(msg);
 System.out.println("Email sent successfully...");
 } catch (AddressException e) {
 throw new RuntimeException(e);
 } catch (MessagingException e) {
 throw new RuntimeException(e);
 }
 }
}

