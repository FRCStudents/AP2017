
class LogicWork {

	int a;
	int b;
	int c;
	int d;

				public void question01(){
					System.out.println("Question #1:");
					a = 0;
					for(int i=0; i < 13; i+=3){
						a += i;
						}
					System.out.print("Final number is: " + a);
					System.out.println("\nThat's all, folks");
				}

        public void question02(){
					System.out.println("Question #2:");
					a = 0;
					for(int i=13; i >= 0; i--){
							if(i % 2 == 0){
								a++;
							}
						}
					System.out.print("Final number is: " + a);
					System.out.println("\nThat's all, folks");
        }

        public void question03(){
                System.out.println("Question #3:");
								a = 0;
								b = 1;
								while(a < 10){
										if(a % 5 == 0){
											b+=5;
										} else {
											b+=1;
										}
										a++;
									}
								System.out.print("Final number is: " + b);
                System.out.println("\nThat's all, folks");
        }

				private boolean sub004a(int i){
						System.out.println("This is the inside of sub004a");
						if(i > 5) return true;
						return false;
				}

				private boolean sub004b(int i){
						System.out.println("This is the inside of sub004b");
						if(i < 5) return true;
						return false;
				}

        public void question04(){
                System.out.println("Question #4:");
								if(sub004a(3) && sub004b(3))
								System.out.println("The if(sub004a(3) && sub004b(3)) worked... ");
                System.out.println("\nThat's all, folks");
        }

				public void question05(){
					System.out.println("Question #5:");
					if(sub004a(7) || sub004b(3))
						System.out.println("The if(sub004a(7) || sub004b(3)) worked... ");
					System.out.println("\nThat's all, folks");
				}

				public void question06(){
			                System.out.println("Question #6:");
											if(sub004a(3) || sub004b(3))
												System.out.println("The if(sub004a(3) || sub004b(3)) worked... ");
			                System.out.println("\nThat's all, folks");
			        }


				public String toString(){
					return "Logic: " + a + ":" + b + ":" + c;
				}
}
