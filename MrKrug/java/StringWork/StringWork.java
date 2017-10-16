
class StringWork {

	String s = "This is really crazy";    

	public void question01(){
		System.out.println("Question #1:"); 
		for(int i=0; i < s.length(); i+=3){
			System.out.print(s.charAt(i));
			}
		System.out.println("\nThat's all, folks");
	}

        public void question02(){
                System.out.println("Question #2:");
                for(int i=0; i < s.length(); i++){
			if(s.charAt(i) != ' '){
                        	System.out.print(s.charAt(i));
				}
                        }
                System.out.println("\nThat's all, folks");
        }

        public void question03(){
                System.out.println("Question #3:");
                for(int i=s.length()-1; i >= 0; i--){
                        System.out.print(s.charAt(i));
                        }
                System.out.println("\nThat's all, folks");
        }

        public void question04(){
                System.out.println("Question #4:");
                for(int i=0; i < s.length(); i++){
                        if((s.charAt(i) != 'a')
				&& (s.charAt(i) != 'e') 
				&& (s.charAt(i) != 'i')
				&& (s.charAt(i) != 'o')
				&& (s.charAt(i) != 'u')){
                                System.out.print(s.charAt(i));
                                }
                        }
                System.out.println("\nThat's all, folks");
        }

	public void question05(){
		System.out.println("Question #5:");
		for (int i=0; i < s.length()-15; i++){
			System.out.print("[" + s.substring(i,i+3) + "]");
		}
		System.out.println("\nThat's all, folks");
	}

	public void question06(){
                System.out.println("Question #6:");
                for (int i=s.length()-4; i >= 0; i-=2){
                        System.out.print(s.substring(i,i+2));
                }
                System.out.println("\nThat's all, folks");
        }

	
	public String toString(){
		return s;
	}
}	
