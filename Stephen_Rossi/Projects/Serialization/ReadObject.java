import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String [] args) {
		 Person person = null;
		 public Person deSerializePerson(String fileName){

			 try {
					FileInputStream pathIn = new FileInputStream("C:/Users/steph/Documents/GitHub/AP2017/Stephen_Rossi/Projects/Serialization/WrittenObjects/xd.ser");
					ObjectInputStream in = new ObjectInputStream(pathIn);
					person = (Person) in.readObject();
					in.close();
					pathIn.close();
		 		} catch (IOException i) {
					i.printStackTrace();
					return;
		 		} catch (ClassNotFoundException c) {
					System.out.println("APCompNerd class not found");
					c.printStackTrace();
					return;
		 		}
				return person;
		}
	}
}
