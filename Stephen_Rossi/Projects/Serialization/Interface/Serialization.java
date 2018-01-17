import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization {
	Person person = null;
		 public Person deSerializePerson(String fileName){

			 String path = null;

			 if((fileName.subString(fileName.length() -3) == ".ser")){
				 path = fileName;
			 } else {
				 path = fileName + ".ser";
			 }

			 try {
					FileInputStream pathIn = new FileInputStream("C:/Users/steph/Documents/GitHub/AP2017/Stephen_Rossi/Projects/Serialization/WrittenObjects/"+path);
					ObjectInputStream in = new ObjectInputStream(pathIn);
					person = (Person) in.readObject();
					in.close();
					pathIn.close();
		 		} catch (IOException i) {
					i.printStackTrace();
					return;
		 		} catch (ClassNotFoundException c) {
					System.out.println(fileName + " file not found");
					c.printStackTrace();
					return;
		 		}
				return person;
		}

		public void SerializePerson(Person person){
				try {
					 FileOutputStream pathOut = new FileOutputStream("C:/Users/steph/Documents/GitHub/AP2017/Stephen_Rossi/Projects/Serialization/WrittenObjects/"+ person.getName() +".ser");
					 ObjectOutputStream out = new ObjectOutputStream(pathOut);
					 out.writeObject(person);
					 out.close();
					 pathOut.close();
					 System.out.println("\nSerialized data is saved in C:/Users/steph/Documents/GitHub/AP2017/Stephen_Rossi/Projects/Serialization/WrittenObjects/xd.ser\n\n");
				} catch (IOException i) {
					 i.printStackTrace();
				}
	}
}
