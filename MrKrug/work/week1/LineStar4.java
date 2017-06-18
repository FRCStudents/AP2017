
class LineStar4{
	public static void main(String argv[]){
		int times = 0;
		if(argv.length > 0){
			times = Integer.valueOf(argv[0]);	
		}
		for(int j=0; j < times; j++){
			for(int i=0; i < 32; i++){
				System.out.print("*");
				}
			System.out.println();
		}
	}
}

