
class ClassRoom{
	String teacherName;
	String subject;
	Student[] students = new Student[20];

	public ClassRoom(String  name, String sub, String[]students, int[] ages){  
		teacherName = name;
		subject = sub;
		createStudents(students, ages);
	}

	public ClassRoom(String name, String sub){
		teacherName = name;
		subject = sub;
		createStudents();
	}

	public String getTeacherName(){
		return teacherName;
	}

	public String getSubject(){
		return subject;
	}

	private void createStudents(){
		String [] sNames = {
					"Bill Smith",
					"Joe Cooper",
					"Sno Dooper",
					"Filly Fally",
					"Toodle Loo",
					"Happy Biff",
					"William Loman",
					"Ella Cartwrite",
					"Ella WartKite",
					"Ella StarLight",
					"Ella FarMight",
					"Ella Kippledom",
					"Happy Stella",
					"Happy Toodle",
					"Noodle Woodle",
					"Hudle Kugle",
					"Mac TheKnife",
					"Shark Bytes",
					"Snark Wytes",
					"Hark Flytes"};

		int [] ages = {15,16,13,14,15,16,17,19,17,13,14,15,15,14,16,17,18,17,16,15};
		boolean a = true;

		for (int i=0; i < 20; i++){
			if(i % 4 == i % 3){
				a = false;
			}
			else {
				a = true;
			}
			students[i] = new Student(sNames[i], ages[i], a);
			}
	}

	private void createStudents(String[] sNames, int[] ages){
		//	for(int xl=0; xl < sNames.length; xl++){
		//		System.out.println(xl + "]" + sNames[xl] + "-" + ages[xl]);
		//		}

               boolean a = true;

                for (int i=0; i < 20; i++){
                        if(i % 4 == i % 3){
                                a = false;
                        }
                        else {
                                a = true;
                        }
                students[i] = new Student(sNames[i], ages[i], a);
                }
        }


	public void printStudents(){
		int absentCount = 0;
		int presentCount = 0;

		System.out.println("\n\n" + getTeacherName());
		System.out.println("\nName\t\t\tAge\tAbsent?");
		System.out.println("===============================================");
		for(int i=0; i<20; i++){
			System.out.println(students[i].getName() + "\t\t" + students[i].getAge() + "\t" + students[i].isAbsent());
			if(students[i].isAbsent()){
				absentCount++;
			} else {
				presentCount++;
			}
		}
		System.out.println("Absent: " + absentCount + " and Present: " + presentCount);
	}
}

