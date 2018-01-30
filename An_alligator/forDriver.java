public class forDriver{
	public static void main(String[] args){
		for_loop c=new for_loop();
		long begin = System.currentTimeMillis();
		c.succi();
		long end = System.currentTimeMillis();
		System.out.print("Seconds: ");
		System.out.print(c.tCalc((double)begin, (double)end));	
	}
}