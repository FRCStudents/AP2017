
class Student {
	String name;
	int age;
	boolean isAbsent;
	Student (String n, int a, boolean i){
		name = n;
		age = a;
		isAbsent = i;
	}

	Student (){
		this("Happy Kid", 15, false);
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public void setName(String n){
		name = n;
	}

	public void setAge(int a){
		age = a;
	}

	public boolean isAbsent(){
		return isAbsent;
	}

	public String toString(){
		return "Student: " + name + ": " + age + ", " + isAbsent;
	}
}
