import java.util.Random;

public class dealership{
	vehicle[] vehicle;
	Random random = new Random();
	int deviation;

	int price(int a){
		return (int) Math.round(((-7000-Math.random()*1000)*Math.log(a)))+22595;
	}

	vehicle[] newDay(){
		vehicle = new vehicle[13];
		for(int i=0; i<vehicle.length; i++){
			int o = (int) Math.round(Math.random());
			System.out.println(o);
			switch(o){
				case 0:
				vehicle[i] = new forester(2004+(int)Math.round(13*Math.random()), (int) Math.round(Math.random()*2));
				break;
				case 1:
				vehicle[i] = new a3(2003+(int)Math.round(14*Math.random()),  (int) Math.round(Math.random()));
				break;
			}
		}
		return vehicle;
	}

	void 

	void dispVehicles(vehicle[] a){
		for(int i=0; i<a.length; i++){
			System.out.println();
			System.out.println(vehicle[i].maker+": "+vehicle[i].year+" "+vehicle[i].model+" "+" "+vehicle[i].trim);
			System.out.print("Listing price: ");
			System.out.println(price(2017-vehicle[i].year));
		}
	}


	public static void main(String[] args){
		dealership pete_and_wrench = new dealership();
		vehicle[] vehicle = pete.newDay();
		pete.dispVehicles(vehicle);
	}
}