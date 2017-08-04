
class NumSystemsWork {
	short [] mask;
	short num;

	public NumSystemsWork(){
		this((short)25);
		}

	public NumSystemsWork(short num){
		mask = new short[16];
		short m = 1;
		for(int i=0; i < 16; i++){
			mask[i] = m;
			m = (short)(m << 1);
		}
		this.num = num;
		}

	public void print(String s){
		System.out.print(s);
		}

	public void timesTwo(){
		num = (short)(num << 1);
		}

	public void divTwo(){
		print("\nDividing... \n");
		num = (short)(num >> 1);
		}

	public void addOne(){
		num = (short)(num + 1);
		}

 	public void showOctal(){
		System.out.println("Showing Octal... for your convenience!\n");
		short numHold = num;
		for(num=0; num<8; num++){
			printNum(3);
			}
		num = numHold;
		}

       public void showHex(){
                System.out.println("Showing Hex... for your convenience!\n");
                short numHold = num;
                for(num=0; num<16; num++){
                        printNum(4);
                        }
                num = numHold;
                }

	public void printNum(int groups){
		print("Decimal: " + num + ":\t");
		for(int i=15; i>=0;i--){
			if((num & mask[i]) > 0) print("1"); else print("0");
			if((i) % groups == 0) print(" ");
			}
		if(groups == 3)
			print(" [Octal: " + String.format("%o", num) + "]\n");
		else	print(" [Hex: " + String.format("%x", num) + "]\n");
		}
	}

public class NumSystemsLoop {
	public static void main(String [] argv){
		NumSystemsWork NSW = new NumSystemsWork((short)17);
		NSW.showOctal();
		NSW.showHex();
		System.out.println("Now using the NumSystem as intended...");
		int i = 27;
		while(i > 0){
			if(i % 2 == 0){
				NSW.timesTwo();
				}
			if(i % 5 == 0){
				NSW.divTwo();
				}
			NSW.printNum(3);
			NSW.printNum(4);
			NSW.addOne();
			i--;
			}
		}
}

