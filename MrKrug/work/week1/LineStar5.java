
//import Thread.*;
 
class LineStar5{
	public static void main(String argv[]){
		int times = 0;
		char charOut = '*';	
		if(argv.length > 0){
			times = Integer.valueOf(argv[0]);	
		}
		for(int j=0; j < times; j++){
			if(j % 2 > 0){
				charOut = '#';
				}
			else {
				if (j > 3){
					charOut = '@';
					}
				else {
					charOut = '^';
					}
			}

			for(int i=0; i < 32; i++){
				System.out.print(charOut);
				try{
					Thread.sleep(50);
					}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
					}	
				}
			for(int i=0; i < 80 - j; i++){
				System.out.print(' ');
				}
			System.out.print(charOut);
			System.out.print("\r");
		}
	}
}

