import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
		Person person = null;

		 public Person deSerializePerson(String fileName){

			 String path = null;

			 if(fileName.substring(fileName.length()-3) == ".ser"){
				 path = "./" + fileName;
			 } else {
				 path = "./" + fileName + ".ser";
			 }

			 try {
					FileInputStream pathIn = new FileInputStream(path);
					ObjectInputStream in = new ObjectInputStream(pathIn);
					person = (Person) in.readObject();
					in.close();
					pathIn.close();
		 		} catch (IOException i) {
					i.printStackTrace();
					return null;
		 		} catch (ClassNotFoundException c) {
					System.out.println(fileName + " file not found");
					c.printStackTrace();
					return null;
		 		}
				return person;
		}


		public void SerializePerson(Person pers){
				try {
					 FileOutputStream pathOut = new FileOutputStream("./People/" + pers.getName() +".ser");
					 ObjectOutputStream out = new ObjectOutputStream(pathOut);
					 out.writeObject(pers);
					 out.close();
					 pathOut.close();
					 System.out.println("\nSerialized data is saved in " + pathOut + "\n\n");
				} catch (IOException i) {
					 i.printStackTrace();
				}
	}
}
