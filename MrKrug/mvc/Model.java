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

	Person[] personList;

	public PersonList(int x){
		personList = new Person[x];
		for (int i=0; i < x; i++){
			Person p = new Person();
			personList[i] = p;
		}
	}

	public void setPersonName(String name, int i){
		personList[i].setName(name);
	}

	public String getPersonName(int i){
		return personList[i].getName();
	}

	public void addPerson(String name){
		int len = getLength() + 1;
		Person[] pList = new Person[len];
		for(int i = 0; i < len-1; i++){
			pList[i] = personList[i];
		}
		pList[len - 1] = new Person(name);
		personList = new Person[len];
		for(int i = 0; i < len; i++){
			personList[i] = pList[i];
		}
	}

	public Person[] getPersonList(){
		return personList;
	}

	public int getLength(){
		return personList.length;
	}
}


