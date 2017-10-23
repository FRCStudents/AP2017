class Swimmer{

//Attributes
	private String name;
	private String gender;
	private String country;
	private String height;
	private String weight;
	private int age;
	private String time;
	private String metals;

		Swimmer(String startingName, String startingGender, String startingCountry, String startingHeight, String startingWeight, int startingAge, String startingTime, String startingMetals){
			name = startingName;
			gender = startingGender;
			country = startingCountry;
			height = startingHeight;
			weight = startingWeight;
			age = startingAge;
			time = startingTime;
			metals = startingMetals;
		}

//Methods
		/*public void setname(String new_name){
			name = new_name;
		}

		public void setgender(String new_gender){
			gender = new_gender;
		}

		public void setcountry(String new_country){
			country = new_country;
		}

		public void setheight(String new_height){
			height = new_height;
		}

		public void setweight(String new_weight){
			weight = new_weight;
		}

		public void setage(int new_age){
			age = new_age;
		}

		public void settime(String new_time){
			time = new_time;
		}

		public void setmetals(String new_metals){
			metals = new_metals;
		}*/

		public String toString(){
			return "\nName: " + name + "\nGender: " + gender + "\nCountry: " + country + "\nHeight: " + height + 
			"\nWeight: " + weight + "\nAge: " + age + "\nTime: " + time + "\nMetals: " + metals;
		}

}

