
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class WriteObject{

      public void SerializePerson(Person person){
        WriteObject obj = new WriteObject();
  		//Person person = new Person("xd", 52, "Uganda", "Sanic", "KnowsDeWeh");

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
