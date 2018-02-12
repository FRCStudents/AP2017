public class AddingToAll {

	//Program Will Need To...
	//Take One File That User Wants To Add To All USER Folders In A Directory
	//Name The File
	//Save The File In Each USER Folder

	//!!! Means USER Will Need To Change Depnding On File Name

	//Notes...
	//Will Need To Find A Way To Access All Users Folders

	private void getFile(){
	      	File file = null;
      		String[] paths;
		
      		try {      
         		file = new File("./!!!/");
         		paths = file.list();
         		for(String path:paths) {
	    			if(path.length() < 5) {
	    				continue;
	    			}

	    			if(path.substring(path.length() - 4).equals(".txt!!!")){
						pathArray.add("./!!!/" + path);
	    			}
			}	
      		} catch (Exception e) {
         		e.printStackTrace();
      		}
	}

	private void openOutFile() throws IOException{
		out = new FileOutputStream("./!!!/all.txt");
	}

}