class Student{

String name;
int age;
int gradeLevel;
boolean isSmart;
boolean attendance;

public Student(){
int age = 16;
int gradeLevel = 11;
boolean isSmart = false;
boolean isAbsent;
String name = "William";
}

public Student (String n){
name = n;
}

//getters and setters for name
public String getName(){
	return name;
}

public void setName(String new_name){
	name = new_name;
}

//getters and setters for age
public int getAge(){
return age;
}

public void setge(int newAge){
	age = newAge;
}

//boolean is the student absent?
public boolean attendance(){
	return attendance;
}

//string to string
public String toString(){
	return name + "_" + age;
}

}
