package skulbrains;

public class DataBuild implements IDataBuild{
		static int i = 0;

		String[] fname = {"Billy", "Willy", "Chilly", "Sally", "Nilly", "Bob",
				"Happy", "Kappy", "Nappy", "Fappy", "Slappy", "Joe",
				"Biffy", "Whiffy", "Jiffy", "Blimpy", "Skimpy", "Moe",
				"Gus"};    

                String[] lname = {"Bixy", "Wixy", "Chixy", "Saxy", "Nixy", "Bof",
                                "Hawwy", "Kawwy", "Nawy", "Fawy", "Slawy", "Jok",
                                "Bippy", "Whippy", "Jippy", "Blippy", "Skippy", "Mok",
                                "Gust"};    


		String[] AssignmentNames = {"Poetry001", "Poetry002", "Poetry Analysis", "Stopping in the Woods",
						"Leaves of Grass", "Don Juan", "Prose001", "Prose002", "Prose Analysis",
						"I Robot", "Most Dangerous Game", "Catcher in the Rye", "1984", "Brave New World",
						"War and Peace", "I and Thou", "Emile", "Godel, Escher, Bach", "QED"};

		int[] Points = {10, 15, 20, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 5000};

		String[] CategoryNames = {"Projects", "Quizzes", "Tests", "Homework", "Professionalism", "FudgeFactor"}; 
		int[] CategoryPercentages = {10, 30, 40, 10, 5, 5};

		int[][] studentScores = { 
     					{8, 10, 10, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4500},
					{9, 12, 15, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4600},
					{5, 14, 16, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4800},
					{9, 13, 17, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4300},
					{10, 12, 4, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4600},
					{2, 15, 15, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4900},
					{0, 14, 16, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4870},
					{9, 15, 17, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4900},
					{9, 13, 19, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4700},
					{8, 14, 18, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4900},
					{7, 14, 16, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4800},
					{8, 12, 14, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4900},
					{9, 14, 15, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4990},
					{9, 12, 17, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 3900},
					{8, 15, 18, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4100},
					{8, 13, 17, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 3900},
					{7, 15, 14, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4800},
					{10, 13, 16, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 4750},
					{7, 15, 18, 10, 20, 20, 10, 10, 50, 50, 30, 100, 100, 100, 500, 500, 1000, 1000, 5000}
					};

		public DataBuild(){
			i++;
		}

		public int getCategoryPercentages(int i){
			return CategoryPercentages[i];
		}

		public int getStudentScores(int x, int y){
			return studentScores[x][y];
		}

		public int getNumberOfStudents(){
			return studentScores.length;
		}

		public int getNumberOfScores(){
			return studentScores[0].length;
		}

		public String getCategoryName(int i){
			return CategoryNames[i];
		}

		public int getNumberOfCategories(){
			return CategoryNames.length;
		}

		public int getPoints(int i){
			return Points[i];
		}

		public int getNumberOfPoints(){
			return Points.length;
		}

		public String getFName(int i){
			return fname[i];
		}

		public String getLName(int i){
			return lname[i];
		}

		public int getNumberOfNames(){
			return fname.length < lname.length ? fname.length : lname.length;
		} 

		public String getAssignmentName(int i){
			return AssignmentNames[i];
		}

		public int getNumberOfAssignments(){
			return AssignmentNames.length;
		}	
}

