
class Controller {
	View v;
	PersonList pList;

	public Controller(){
		v = new View();
		//String[] names = {"Bob", "Bill", "Corey", "Casey", "Dillon", "Dopey", "Egbert", "Ellen", "Fred", "Fagin"};
		pList = new PersonList();
		pList.readFromFile();
		//for(int i=0; i<10; i++){
	 	//		pList.addPerson(names[i]);
		//}
	}

	private void processCommand(int c){
		if(c == 1){
			v.showList(pList);
		}
		if(c == 2){
			pList.addPerson(v.getName());
			v.showList(pList);
		}
	}

	public void start(){
		v.startView();
		while(!v.isEnd()){
			processCommand(v.getInput());
			v.startView();
		}
		v.endView();
		pList.writeToFile();
	}

}		
	
