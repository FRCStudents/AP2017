
class LoopWork {

	int a;
	int b;
	int c;
	int d;

				public void question01(){
					System.out.println("Question #1:");
					a = 0;
					for(int i=0; i < 7; i+=2){
							System.out.print(i);
						}
					System.out.println("\nThat's all, folks");
				}

        public void question02(){
					System.out.println("Question #2:");
					for(int i=50; i >= 0; i--){
							if(i % 3 == 0){
								System.out.print("[" + i + "]");
							}
						}
					System.out.println("\nThat's all, folks");
        }

        public void question03(){
                System.out.println("Question #3:");
								int j = 17;
								do {
									System.out.print("[" + j + "]");
									j -= 2;
								} while(j > 0);

                System.out.println("\nThat's all, folks");
        }

				private boolean sub004a(int i){
						if(i > 5){
							System.out.println("sub004a: [TRUE]");
							return true;
						} else {
							System.out.println("sub004a: [FALSE]");
							return false;
						}
				}

				private boolean sub004b(int i){
					if(i < 5){
						System.out.println("sub004b: [TRUE]");
						return true;
					} else {
						System.out.println("sub004b: [FALSE]");
						return false;
					}
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


				private int question07r(int x){
						if(x < 1) return 1;
						return question07(x - 1) + 3;
				}

				public int question07(int x){
					return question07r(x);
				}
				
				public String toString(){
					return "Loop: " + a + ":" + b + ":" + c;
				}
}
