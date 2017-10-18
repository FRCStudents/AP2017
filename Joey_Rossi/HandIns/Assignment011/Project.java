class Project {
	
	public static void waitUp(){
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
	}

	public static void main(String [] argv){
		System.out.print("\n    _______");
		waitUp();
		System.out.print("\n   //------\\");
		waitUp();
		System.out.print("\n  //	    \\__");
		waitUp();
		System.out.print("\n //----------\\_\\	");
		waitUp();
		System.out.print("\n (.)	    (.)");
		waitUp();
		System.out.print("\n                                    _______");
		waitUp();
		System.out.print("\n   		   		   //------\\");
		waitUp();
		System.out.print("\n  	     	  	    ----  //        \\__");
		waitUp();						
		System.out.print("\n 	  		   ----  //----------\\_\\ 	 ");
		waitUp();
		System.out.print("\n 	  			 (.) 	    (.)");
		waitUp();
		System.out.print("\n		                                    _______");
		waitUp();
		System.out.print("\n		   		   		   //------\\");
		waitUp();
		System.out.print("\n	 	 	     	  	    ----  //        \\__");
		waitUp();						
		System.out.print("\n		 	  		   ----  //----------\\_\\ 	 ");
		waitUp();
		System.out.print("\n		 	  			 (.) 	    (.)");
		waitUp();

		System.out.println("");
	}

}