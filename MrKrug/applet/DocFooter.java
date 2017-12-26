
import java.browser.*; 
import java.awt.*;
import java.net.*;

public class DocFooter extends Applet {
	String date;
	String email;
	String copyright;
	Image logo;

	protected void init(){
		resize(500,100);
		logo = getImage("images/logo.gif");

		date = getAttribute("LAST_UPDATED");
		email = getAttribute("EMAIL");
		copyright = getAttribute("COPY_RIGHT_NOTICE");
	}

	public void paint(Graphics g){
		g.drawImage(logo,0,0);
		g.drawString(date + " by " + email,100,15);
		g.drawString(copyright, 100, 35);

		URL url = new URL(documentURL, "");
		String urlstrig = url.toExternalForm();
		g.drawString(urlstring, 100, 55);
	}
} 

