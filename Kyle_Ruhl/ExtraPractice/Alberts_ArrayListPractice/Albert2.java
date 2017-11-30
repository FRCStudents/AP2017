import java.util.*;
public class Albert2{
	static ArrayList<String> sAar = new ArrayList<String>();
	
	public static void main(String[] argv){
	sAar.add("Run");
	System.out.println(sAar);
	sAar.add("Walk");
	System.out.println(sAar);
	sAar.get(0);
	System.out.println(sAar);
	sAar.set(1, "Crawl");
	System.out.println(sAar);
	sAar.remove(0);
	System.out.println(sAar);

	System.out.println("final: " + sAar);
	}

}
