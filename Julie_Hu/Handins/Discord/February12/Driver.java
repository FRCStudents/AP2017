public class Driver{
	public static void main(String[] argv){

LittleAC a = new LittleAC();
a.turnOnAC();
a.turnOffAC();
System.out.println("\n" + a);

BigAC b = new BigAC();
b.turnOnAC();
b.turnOffAC();
System.out.println(b);

VeryBigAC c = new VeryBigAC();
c.turnOnAC();
c.turnOffAC();
System.out.println(c);

Chain ch = new Chain();
System.out.println("\n\nCHAIN: All Off");
ch.showChain();
ch.SetChain();
System.out.println("\n\nCHAIN: All On");
ch.showChain();

 }
}
