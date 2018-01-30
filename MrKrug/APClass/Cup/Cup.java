import java.util.*;

public class Cup {
	ArrayList <ArrayList <Integer>> cups = new ArrayList<ArrayList <Integer>>();

	public Cup () {
		ArrayList <Integer> temp = new ArrayList<Integer>();
		ArrayList <Integer> temp2 = new ArrayList<Integer>();
                ArrayList <Integer> temp3 = new ArrayList<Integer>();
                ArrayList <Integer> temp4 = new ArrayList<Integer>();


		temp.add(3);
		temp.add(4);
		temp.add(5);
		temp.add(7);
		cups.add(temp);
		temp2.add(4);
		temp2.add(3);
		temp2.add(7);
		temp2.add(7);
		cups.add(temp2);
                temp3.add(5);
                temp3.add(4);
                temp3.add(3);
                temp3.add(6);
                cups.add(temp3);
                temp4.add(7);
                temp4.add(4);
                temp4.add(5);
                temp4.add(5);
                cups.add(temp4);

	}

	ArrayList <Integer> getColor(String color){
		if(color.equals("White")){
			return cups.get(0);
		}
		if(color.equals("Red")){
			return cups.get(1);
		}
		if(color.equals("Black")){
			return cups.get(2);
		}
		if(color.equals("Blue")){
			return cups.get(3);
		}
		return cups.get(0);
	}

	public Integer getCount(String color, double price){
		if(price == 1.25){
			return getColor(color).get(0);
		}
		if(price == 2.25){
			return getColor(color).get(1);
		}
		if(price == 3.25){
			return getColor(color).get(2);
		}
		if(price == 4.99){
			return getColor(color).get(3);
		}
		return 0;
	}


        public void setCount(String color, double price, int value){
                if(price == 1.25){
                        getColor(color).set(0, value);
                }
                if(price == 2.25){
	               getColor(color).set(1, value);
                }
                if(price == 3.25){
                        getColor(color).set(2, value);
                }
                if(price == 4.99){
                        getColor(color).set(3, value);
                }
                return;
        }
	
	public void displayAll(){
		String [] colors = {"White", "Red", "Black", "Blue"};
		double [] prices = {1.25, 2.25, 3.25, 4.99};

		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.println("getCount: [" + colors[i] + "][" + prices[j] + "]\t\t" + getCount(colors[i], prices[j]));
			}
		}		
	}
	
	public void display(){
		for(int i=0; i<cups.size(); i++){
			for(int j=0; j<cups.get(i).size(); j++){
				System.out.print("\t" + cups.get(i).get(j));
				}
			System.out.println("");
			}
	}

	public void setBizarre(){
		setCount("Black", 3.25, 99);
	}
}	
