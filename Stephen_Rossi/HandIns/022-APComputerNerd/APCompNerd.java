class APComputerNerd{
	private int age;
	private String name;
	private int computerSpeed;
	private int intelligence;

	public APComputerNerd(){
		age = 0;
		name = "Undefined";
		computerSpeed = 0;
		intelligence = 0;
	}
	public APComputerNerd(int age, String name, int computerSpeed, int intelligence){
		this.age = age;
		this.name = name;
		this.computerSpeed = computerSpeed;
		this.intelligence = intelligence;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	} 
	public int getComputerSpeed(){
		return computerSpeed;
	}
	public void setComputerSpeed(int computerSpeed){
		this.computerSpeed = computerSpeed;
	} 			
	public int getIntelligence(){
		return intelligence;
	}
	public void setIntelligence(int intelligence){
		this.intelligence = intelligence;
	}
	public String toString(){
		return name + " is " + age + ", and has an intelligence of " + intelligence;
	}
}