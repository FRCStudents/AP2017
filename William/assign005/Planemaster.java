public class Plane{
	
	int wingspan=5;
	int weight=4;
	String brand="boeing";

	public Plane(){	
		this.brand="boeing";
		this.weight=4;
		this.wingspan=5; 
		}
		
	
	public int getWingspan(){
	return this.wingspan;
	}
	public void Setwingspan (int newWingspan){
	wingspan=5;
	}
	public int getweight(){
	return this.weight;
	}
	public void setweight (int newWeight){
	weight=4;
	}
	public String getBrand(){
	return brand;
	}
	public void setBrand(String X){
	brand=X;
	}
	public String ToString(){
	return brand;
	}
	}