/***********************************************
 * package furniture
 * abstract object Furniture
 * compiled with: javac -d . Furniuture.java
 ***********************************************/
package furniture;

public abstract class Furniture {
	private String sittingSide = "";
	private String facingSide = "";
	private int legs = 0;
	private int doors = 0;

	public String getSittingSide(){
		return sittingSide;
		}

	public void setSittingSide(String side){
		sittingSide = side;
		}

	public String getFacingSide(){
		return facingSide;
		}

	public void setFacingSide(String facingSide){
		this.facingSide = facingSide;
		}

	public int getLegs(){
		return legs;
		}

	public void setLegs(int legs){
		this.legs = legs;
		}

	public int getDoors(){
		return doors;
		}

	public void setDoors(int doors){
		this.doors = doors;
		}
	
	public void showIt(){
		System.out.println("================");
		System.out.println("Furniture: ");
		System.out.println("\tLegs: " + legs);
		System.out.println("\tDoors: " + doors);
		System.out.println("\tThis chair is on the " + getSittingSide() + " side, facing the " + getFacingSide());
		System.out.println("==================");
		}
	}

