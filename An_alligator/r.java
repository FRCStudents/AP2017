public class r{
	int[] arr = new int[10];

	public void parr(boolean o){
		if(o==true){
			int x = 0;
			for(;x<arr.length; x++){
				System.out.print(arr[x]);
			}
		}else{
			int x = arr.length-1;
			for(;x<arr.length; x--){
				System.out.print(arr[x]);
			}
		}
	}
	public static void main(String[] args){
		r r=new r();
		for(int x = 0; x<r.arr.length; x++){
			r.arr[x]=x;
		}
		r.parr(false);
	}
}