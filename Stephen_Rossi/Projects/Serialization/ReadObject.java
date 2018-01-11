import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String args[]) {
		ReadObject obj = new ReadObject();

		Person person = obj.deserialzeObject("C:\\Users\\steph\\Documents\\GitHub\\AP2017\\Stephen_Rossi\\Projects\\Serialization\\WrittenObjects\\xd");

		System.out.println(person);
	}

	public Person deserialzeObject(String filename) {
		Person person = null;

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		try {
			fin = new FileInputStream(filename);
			ois = new ObjectInputStream(fin);
			person = (Person) ois.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return person;
	}
}



/*
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class ReadObject {

    private static final String filepath="C:\\Users\\steph\\Documents\\GitHub\\AP2017\\Stephen_Rossi\\Projects\\Serialization\\WrittenObjects\\xd";

    public static void main(String args[]) {

        ReadObject objectIO = new ReadObject();

        //Read object from file
        Person person = (Person) objectIO.ReadObjectFromFile(filepath);
        System.out.println(person);
    }

    public Object ReadObjectFromFile(String filepath) {

        try {

            FileInputStream fileIn = new FileInputStream(filepath);
						ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}*/
