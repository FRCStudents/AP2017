public class noise{
	public int subtract(int x){
		if(add(x = x-=Math.round(Math.random())) >= 10){
			return(10);
		}
		return(10);
	}
	public int add(int x){
		if(subtract(x = x-=Math.round(Math.random()))<=0){
			return(0);
			
		}else{
			return(10);
		}		
	}

	public static void main(String[] args){
		noise x = new noise();
		int xx = x.add(5);
		if(xx<=0){
			System.out.println(xx);
			System.out.println("sub won!!!");
		}else{
			System.out.println(xx);
			System.out.println("add won!!!");
		}
	}
}