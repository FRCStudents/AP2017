import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu{
	static Scanner scan = new Scanner(System.in);


	public static String seven_Char(String x){
		int spaces = (7-x.length())/2;
		String y="";

		for(int z=0; z<spaces; z++){
			y+=" ";
		}

		y+=x;

		for(int z=0; z<spaces; z++){
			y+=" ";
		}

		if(y.length()<7){
			y+=" ";
		}
		return y;
	}

	//in arduino this will read fans rpms
	public static int fan_RPM(int x){
		return (int) Math.round(1350+(Math.random()*500)-250);
	}

	public static void fan_Control_RPM()throws InterruptedException{
		//arduino would change pwm bassed on a 0-100% duty cycle
		int fan = 0;

		int fan_speed = 0;

		int hold = 0;

		System.out.print("Fan #:");
		fan = scan.nextInt();
		while(hold==0){

			System.out.print("Fan speed: (%) ");
			fan_speed = scan.nextInt();

			if(fan_speed<0||100<fan_speed){
				System.out.print("Please choose a value 0-100");
				TimeUnit.SECONDS.sleep(1);
				System.out.println();
			}else{
				hold=1;
			}
		}

		System.out.println((String)"Fan "+fan+" has been set to "+fan_speed+"%");
		TimeUnit.SECONDS.sleep(1);

	}

	//display will be substitution for not having a lcd
	public static void display(String[] x, int y)throws InterruptedException{
	while(true){


		System.out.println("===============================");

		//Print the fan display
		for(int a=0; a<4; a++){
			int b=0;
			for(int z=0; z<4; z++){

				switch(a){
					case 0:
					System.out.print(seven_Char(x[b]));
					break;
					case 1:
					System.out.print(seven_Char("RPM:"));
					break;
					case 2:
					System.out.print(seven_Char(Integer.toString(fan_RPM(z))));
					break;
					case 3:
					System.out.print(seven_Char(" "));
					break;
				}
				if(z!=3){
					System.out.print("|");	
				}
			}
			System.out.println();
		}
		System.out.println("===============================");

		//options for menu
		System.out.println("OPTIONS:\n\t1 = Change fan speed\n\t2 = Toggle PSU");

		switch(scan.nextInt()){
			case 1:
			fan_Control_RPM();
			break;
			case 2:
			break;
		}
	}

	}
	public static void main(String[] args)throws InterruptedException{
		Menu x= new Menu();
		String[] y = {"Fan 1", "Fan 2", "Fan 3", "Fan 4"};
		x.display(y,4);
	}
}