
class IfWork {

 	boolean a = true;
	boolean b = true;
	boolean c = false;
	boolean d = false;

				public void question01(){
					System.out.println("Question #1:");
					if(a){
							System.out.println("1- This is ok");
					}
					System.out.println("\nThat's all, folks");
				}

        public void question02(){
					System.out.println("Question #2:");
					if(a && b){
							System.out.println("2- This is ok");
					}
					System.out.println("\nThat's all, folks");
        }

				public void question03(){
					System.out.println("Question #3:");
					if(a && d){
							System.out.println("3- This is ok");
					}
					System.out.println("\nThat's all, folks");
        }

				public void question04(){
					System.out.println("Question #4:");
					if(a || c){
							System.out.println("4- This is ok");
					}
					System.out.println("\nThat's all, folks");
        }

				public void question05(){
					System.out.println("Question #5:");
					if(!(c || d)){
							System.out.println("5- This is ok");
					}
					System.out.println("\nThat's all, folks");
        }

				public void question06(){
					System.out.println("Question #6:");
					if(!(!(a && !d))){
							System.out.println("6- This is ok");
					}
					System.out.println("\nThat's all, folks");
        }

				public void question07(){
					System.out.println("7- Question #7:");
					if(!(a && c)){
							System.out.println("This is ok");
					}
					System.out.println("\nThat's all, folks");
        }

				public void question08(){
					System.out.println("8- Question #8:");
					if(!(a || c)){
							System.out.println("This is ok");
					}
					System.out.println("\nThat's all, folks");
				}

				public void question09(){
            System.out.println("Question #9:");
						if(!a || !c){
								System.out.println("9- This is ok");
						}
            System.out.println("\nThat's all, folks");
			  }

				public void question10(){
            System.out.println("Question #10:");
						if(!a && !c){
								System.out.println("10- This is ok");
						}
            System.out.println("\nThat's all, folks");
			  }

				public void question11(){
            System.out.println("Question #11:");
						if(!( (!a || !c) && (!b && !c)) ){
								System.out.println("11- This is ok");
						}
            System.out.println("\nThat's all, folks");
			  }

				public void question12(){
            System.out.println("Question #12:");
						if(!( !(a || c) && !(b && c)) ){
								System.out.println("12- This is ok");
						}
            System.out.println("\nThat's all, folks");
			  }

				public String toString(){
					return "Logic: a = " + a + ": b = " + b + ": c = " + c + ": d = " + d;
				}
}
