class coffeeCupDriver{

	public static void main (String [] argv){
		coffeeCup r = new coffeeCup();
		
		//White outs the screen. Prints 50 blank Lines:::
		int y;
		for(y = 0; y < 50; y++){
			System.out.println();
		}

		//-------------------------------------------------------
	
		r.setShop(0, 0, "7");
		r.setShop(0, 1, "2");
		r.setShop(0, 2, "3");
		r.setShop(0, 3, "4");
		r.setShop(1, 0, " ");
		r.setShop(1, 1, " ");
		r.setShop(1, 2, " ");
		r.setShop(1, 3, " ");
		r.setShop(2, 0, "X");
		r.setShop(2, 1, " ");
		r.setShop(2, 2, "X");
		r.setShop(2, 3, " ");
		r.setShop(3, 0, " ");
		r.setShop(3, 1, " ");
		r.setShop(3, 2, " ");
		r.setShop(3, 3, " ");


		r.displaycups();
		
	}
}



}
