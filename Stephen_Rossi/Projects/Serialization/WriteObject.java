
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class WriteObject{
  public static void main(String args[]) {

  		WriteObject obj = new WriteObject();

  		Person person = new Person("Mason VanDeurse", 18, "US", "MA", "Dumbo");

      //person.setWritable(true);

  		obj.serializeObj(person);

  	}

  	public void serializeObj(Person person) {

  		FileOutputStream path = null;
  		ObjectOutputStream oos = null;

  		try {

  			path = new FileOutputStream("C:\\Users\\steph\\Documents\\GitHub\\AP2017\\Stephen_Rossi\\Projects\\Serialization\\WrittenObjects\\" + person.getName() + "");
  			oos = new ObjectOutputStream(path);
  			oos.writeObject(person);

  			System.out.println("Done");

  		} catch (Exception ex) {

  			ex.printStackTrace();

  		} finally {

  			if (path != null) {
  				try {
  					path.close();
  				} catch (IOException e) {
  					e.printStackTrace();
  				}
  			}

  			if (oos != null) {
  				try {
  					oos.close();
  				} catch (IOException e) {
  					e.printStackTrace();
  				}
  			}

  		}
  	}
  }
