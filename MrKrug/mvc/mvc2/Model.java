import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Person {
	protected String name = "";

	public Person(){
		this("Efraim Krug");
	}

	public Person(String name){
		setName(name);
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

}

class PersonList {
	final String DATABASE_NAME = "PeopleNames.db";

	ArrayList<Person> personList = new ArrayList<Person>();

	public PersonList(){
		personList = new ArrayList<Person>();
	}

	public void setPersonName(String name, int i){
		personList.get(i).setName(name);
	}

	public String getPersonName(int i){
		return personList.get(i).getName();
	}

	public void addPerson(String name){
		Person p = new Person(name);
		personList.add(p);
	}

	public ArrayList<Person> getPersonList(){
		return personList;
	}

	public int getLength(){
		return personList.size();
	}

	public void readFromFile(){
	        try {
            		File f = new File(DATABASE_NAME);
            		BufferedReader b = new BufferedReader(new FileReader(f));

            		String readLine = "";
            		while ((readLine = b.readLine()) != null) {
                		addPerson(readLine.trim());
            		}

        	} catch (IOException e) {
            		e.printStackTrace();
        	}
	}
	
	public void writeToFile() {
		try {
			File file = new File(DATABASE_NAME);
			FileWriter fileWriter = new FileWriter(file);
			for(int i=0; i < getLength(); i++){
				fileWriter.write(personList.get(i).getName() + '\n');
			}
			fileWriter.flush();
		 	fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


