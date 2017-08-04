
class DoInt {
	private	Integer i;
	public DoInt(){
		i = new Integer(0);
		}
	public DoInt(int i){
		this.i = new Integer(i);
		}

	public void showOct(){
		System.out.println("Octal: " + i.toOctalString(i.intValue()));
		}

	public void showDec(){
		System.out.println("Decimal: " + i.intValue());
		}

	public void showBin(){
		System.out.println("Binary: " +  i.toBinaryString(i.intValue()));
		}

	public void showHex(){
		System.out.println("Hex: " + i.toHexString(i.intValue()));
		}

	public void showExtremeOneBit(){
		System.out.println("Highest bit: " + i.highestOneBit(i.intValue()));
		System.out.println("Lowest bit: " + i.lowestOneBit(i.intValue()));
		}

	public void showOnBitCount(){
		System.out.println("On bit count: " + i.bitCount(i.intValue()));
		}

	public void setI(int i){
		this.i = i;
		}

	}

public class DoInteger{
	public static void main(String [] argv){
		DoInt X = new DoInt(15);
		Integer Y = new Integer(1);

		X.setI(7828);
		X.showOct();
		X.showDec();
		X.showBin();
		X.showHex();
		X.showExtremeOneBit();
		X.showOnBitCount();
		System.out.println("In main: " + Y.toOctalString(234));
		}
	}
	
