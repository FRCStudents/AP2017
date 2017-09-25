import java.util.ArrayList;

public class Egg{
	boolean fertilized;
	String color="Brown";
	ArrayList group=new ArrayList();

	public void toString(String x){
		System.out.println(x);
	}

	public String getcolor(){
		return color;
	}

	public void setcolor(String x){
		color=x;
	}

	public String getfertilized(){
		return color;
	}

	public void setfertilized(String x){
		color=x;
	}

	public boolean getRandomBoolean(){
		boolean v = Math.random() < 0.5;
		return v;
	}

	public double getRandomNumber(int x){
		return Math.round(Math.random()*x);
	}

	public void generateEggs(int x){
		String colors[]={"white","blue","brown","olive"};
		group.add(new String());
		while(x>0){
			group.add(new String());
			x--;
		}
	}
}