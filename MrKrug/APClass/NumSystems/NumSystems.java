
class NumSystemsWork {
	short mask1 = 1;   
	short mask2 = 2;
	short mask4 = 4;
	short mask8 = 8;
	short mask16 = 16;
	short mask32 = 32;
	short mask64 = 64;
	short mask128 = 128;
	short mask256 = 256;
	short mask512 = 512;
	short mask1024 = 1024;
	short mask2048 = 2048;
	short mask4096 = 4096;
	short mask8192 = 8192;
	short mask16384 = 16384;

	short num;

	public NumSystemsWork(){
		this((short)25);
		}

	public NumSystemsWork(short num){
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

	public void printNum(){
		print("\nDecimal: " + num + ":\t");
		if((num & mask16384) > 0) print("1"); else print("0");
		if((num & mask8192) > 0) print("1"); else print("0");
		if((num & mask4096) > 0) print("1"); else print("0");
		print(" ");
		if((num & mask2048) > 0) print("1"); else print("0");
		if((num & mask1024) > 0) print("1"); else print("0");
		if((num & mask512) > 0) print("1"); else print("0");
		print(" ");
		if((num & mask256) > 0) print("1"); else print("0");
		if((num & mask128) > 0) print("1"); else print("0");
		if((num & mask64) > 0) print("1"); else print("0");
		print(" ");
		if((num & mask32) > 0) print("1"); else print("0");
		if((num & mask16) > 0) print("1"); else print("0");
		if((num & mask8)  > 0) print("1"); else print("0");
		print(" ");
		if((num & mask4)  > 0) print("1"); else print("0");
		if((num & mask2)  > 0) print("1"); else print("0");
		if((num & mask1)  > 0) print("1"); else print("0");
		print("\n");
		}
	}

public class NumSystems {
	public static void main(String [] argv){
		NumSystemsWork NSW = new NumSystemsWork((short)17);
		int i = 27;
		while(i > 0){
			if(i % 2 == 0){
				NSW.timesTwo();
				}
			if(i % 5 == 0){
				NSW.divTwo();
				}
			NSW.printNum();
			NSW.addOne();
			i--;
			}
		}
}

