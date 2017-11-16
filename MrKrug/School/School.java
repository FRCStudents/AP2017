
class School {
	int numberClassRooms = 0;
	String schoolName = "";
	ClassRoom[] classList = new ClassRoom[5];
        String [] sNames01 = {
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

        int [] ages01 = {15,16,13,14,15,16,17,19,17,13,14,15,15,14,16,17,18,17,16,15};

        String [] sNames02 = {
                                        "Bill Smyth",
                                        "Joe Cuper",
                                        "Sno Duper",
                                        "Fily Faly",
                                        "Tudle Lu",
                                        "Happi Biff",
                                        "Wylliam Loman",
                                        "Ella Cartwryte",
                                        "Ella WartKyte",
                                        "Ella StarLyght",
                                        "Ella FarMyght",
                                        "Ella Kyppledom",
                                        "Happi Stella",
                                        "Happi Toodle",
                                        "Nudle Wudle",
                                        "Hudle Koogle",
                                        "Muc TheKnife",
                                        "Shyrk Bytes",
                                        "Snyrk Wytes",
                                        "Hork Flites"};

        int [] ages02 = {15,16,13,14,15,16,17,19,17,13,14,15,15,14,16,17,18,17,16,15};

        String [] sNames03 = {
                                        "Fill Smith",
                                        "HJoe Cooper",
                                        "No Dooper",
                                        "Gilly Fally",
                                        "Soodle Loo",
                                        "Nappy Biff",
                                        "Billiam Loman",
                                        "Olla Cartwrite",
                                        "Olla WartKite",
                                        "Olla StarLight",
                                        "Olla FarMight",
                                        "Olla Kippledom",
                                        "Nappy Stella",
                                        "Nappy Toodle",
                                        "Hoodle Woodle",
                                        "Fudle Kugle",
                                        "Sac TheKnife",
                                        "Thark Bytes",
                                        "Mnark Wytes",
                                        "Fark Flytes"};

        int [] ages03 = {15,16,13,14,15,16,17,19,17,13,14,15,15,14,16,17,18,17,16,15};

        String [] sNames04 = {
                                        "Bill Mith",
                                        "Joe Ooper",
                                        "Sno Ooper",
                                        "Filly Ally",
                                        "Toodle Oo",
                                        "Happy Iff",
                                        "William Oman",
                                        "Ella Artwrite",
                                        "Ella ArtKite",
                                        "Ella TarLight",
                                        "Ella ArMight",
                                        "Ella Ippledom",
                                        "Happy Tella",
                                        "Happy Oodle",
                                        "Noodle Oodle",
                                        "Hudle Ugle",
                                        "Mac HeKnife",
                                        "Shark Ytes",
                                        "Snark Ytes",
                                        "Hark Lytes"};

        int [] ages04 = {15,16,13,14,15,16,17,19,17,13,14,15,15,14,16,17,18,17,16,15};


	public School(){
		this(5, "FRCS");
		createClassRooms();
	}

	public School(int nCR, String name){
		schoolName = name;
		numberClassRooms = nCR;
		createClassRooms();	
	}

	private void createClassRooms(){
		String [][] names = new String[30][4];
		int [][] ages = new int[30][4];
		names[0] = sNames01;
		names[1] = sNames02;
		names[2] = sNames03;
		names[3] = sNames04;

		ages[0] = ages01;
		ages[1] = ages02;	
		ages[2] = ages03;
		ages[3] = ages04;

		String [] teacherNames = {"Krug", "Barb", "Hardy", "Ells", "Goddard"};
		String [] subjects = {"AP Computers", "AP Calculus", "AP English", "AP History", "Other Stuff"};

		for(int i = 0; i < 4; i++){
			classList[i] = new ClassRoom(teacherNames[i], subjects[i], names[i], ages[i]);
		}

	}

	public void printSchool(){
		System.out.println("Printing out the school roster for: " + schoolName);
		System.out.println("===================================================");
		for (int i=0; i<4; i++){
			classList[i].printStudents();
		}
	}
}
