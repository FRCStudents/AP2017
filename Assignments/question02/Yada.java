
class Yada {
	String [][] yadaStuff = new String [5][3];
	public Yada(){
		for(int i=0; i < 5; i++){
			for(int j=0; j<3; j++){
				yadaStuff[i][j] = "This";
			}
		}
	}

	public void setYadaStuff(int i, int j, String thing){
		yadaStuff[i][j] =  thing;
	}

	public String getYadaStuff(int i, int j){
		return yadaStuff[i][j];
	}

 	public void fillYadaStuff(String thing){
		for(int i=0; i < 5; i++)
			for(int j=0; j < 3; j++)
				yadaStuff[i][j] = thing;
	}

	public void showYadaStuff(){
		System.out.println("Yada Stuff");	
		for(int i=0; i < 5; i++){
			System.out.println("And now this...");
			for(int j=0; j < 3; j++){
				System.out.println(getYadaStuff(i,j));
			}
		}
	}

} 
