
class FibDriver {
	public static void main(String[] argv){
		Fib01 f = new Fib01();
		f.printLast();
		for(int i=0; i<20; i++){
			f.getNext();
			f.printLast();
		}
		f.fibRecurse(1, 1, 20);
	}
}
