class SundayDriver {
	
	public static void waitUp(){
		try{
			Thread.sleep(1500);
		}
		catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
	}

	public static void main(String [] argv){
		for(int b = 0; b <= 80; b++){
			System.out.print("\n");
		}
		for (int t = 0; t <= 0; t++){
		System.out.print("\n    _______");
		System.out.print("\n   //------\\");
		System.out.print("\n  //	    \\__");
		System.out.print("\n //----------\\_\\	");
		System.out.print("\n (.)	    (.)");
		waitUp();
	 	}
	 	for(int b = 0; b <= 80; b++){
			System.out.print("\n");
		}
		for (int t = 0; t <= 0; t++){
		System.out.print("\n                                    _______");
		System.out.print("\n   		   		   //------\\");
		System.out.print("\n  	     	  	    ----  //        \\__");						
		System.out.print("\n 	  		   ----  //----------\\_\\ 	 ");
		System.out.print("\n 	  			 (.) 	    (.)");
		waitUp();
		}

		for(int b = 0; b <= 80; b++){
			System.out.print("\n");
		}
		for (int t = 0; t <= 0; t++){
		System.out.print("\n		                                    _______");
		System.out.print("\n		   		   		   //------\\");
		System.out.print("\n	 	 	     	  	    ----  //        \\__");						
		System.out.print("\n		 	  		   ----  //----------\\_\\ 	 ");
		System.out.print("\n		 	  			 (.) 	    (.)");
		waitUp();
		}

		for(int b = 0; b <= 80; b++){
			System.out.print("\n");
		}
		for (int t = 0; t <= 0; t++){
		System.out.print("\n                       		     _______");
		System.out.print("\n   		   		    /------\\\\ ");
		System.out.print("\n  	     	  	         __/        \\\\  ----  ");			
		System.out.print("\n 	  		        /_/----------\\\\  ---- 	 ");
		System.out.print("\n 	  			 (.) 	    (.)");
		waitUp();
		}
		for(int b = 0; b <= 80; b++){
			System.out.print("\n");
		}
		for (int t = 0; t <= 0; t++){
		System.out.print("\n___           _______");
		System.out.print("\n|||   	     /------\\\\				    _______");
		System.out.print("\n|||  	  __/        \\\\   			 __.'//_||_|\\");
		System.out.print("\n||| 	 /_/----------\\\\ 	 		/_ _    _    )");
		System.out.print("\n--- 	  (.) 	     (.)			'-(_)--(_)-'=");
		waitUp();	
		}
		System.out.println("");

	}

}