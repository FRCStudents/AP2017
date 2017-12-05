public class solution{

	int length=1;

	public void add(int n){
		sol=new int[length+1];
		length++;
		sol[length-2]=n;
	}

	public static int[] answer(int[] data, int n) {
		int[] sol=new int[length];

		int counter;

		for(int x=0; x<data.length; x++){
			counter=1;
			for(int y=x+1; y<data.length; y++){
				if(data[x]==data[y]){
					counter++;
					if(counter==n){

					}if(counter>n){

					}

				}
			}
		}
	return(sol);
	}
}
