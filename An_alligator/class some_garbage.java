public class some_garbage{
	int fibo(int n){
		if(n<=1){
			return n;
		}else{
			return fibo(n-1) + fibo(n-2);
		}
	}

	public static void main(String[] args){
		some_garbage x = new some_garbage();
		System.out.println(x.fibo(4));
	}
}