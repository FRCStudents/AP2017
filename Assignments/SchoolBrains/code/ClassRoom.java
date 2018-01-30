package skulbrains;
import skulbrains.User;
import skulbrains.ClassBook;

class ClassRoom {
	private User teacher;
	private String address;
	private User[] studentList;
	private int nextSpot = 0;
	private ClassBook classBook;

	public ClassRoom(int size){
		teacher = new User();
		address = "Room 204";
		studentList = new User[size];
	}

	public void initClassBook(){
		classBook = new ClassBook();
	}


	public void initStudentList(int size){
		studentList = new User[size];
		nextSpot = 0;
	}

	public void addStudent(String fname, String lname){
		studentList[nextSpot] = new User(fname, lname, 3);
		nextSpot++;
	}

}	
