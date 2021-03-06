import java.io.*;
import java.util.*;

class CollectDataWork {
	FileInputStream in = null;
	FileOutputStream out = null;

	ArrayList<String> pathArray = new ArrayList<String>();
	
	public CollectDataWork() throws IOException {
		getFiles();	
		openOutFile();
		collectData();
	}

	private void openOutFile() throws IOException{
		out = new FileOutputStream("./data/all.emkproject");
	}

 	private void collectData() throws IOException {
		int c;
		for(int i=0; i < pathArray.size(); i++){
			in = new FileInputStream(pathArray.get(i));
			while(( c = in.read())!= -1){
				out.write(c);
			}
			out.write('\n');
		}
	}
	
	private void getFiles(){
	      	File file = null;
      		String[] paths;
		
      		try {      
         		file = new File("./data/");
         		paths = file.list();
         		for(String path:paths) {
	    			if(path.length() < 12) continue;
				//System.out.println("{" + path.substring(path.length() - 11) + "}");
	    			if(path.substring(path.length() - 11).equals(".emkproject")){
					pathArray.add("./data/" + path);
	    			}
			}	
      		} catch (Exception e) {
         		e.printStackTrace();
      		}
	}

	public void printFiles(){
		for(int i=0; i<pathArray.size(); i++){
			System.out.println(pathArray.get(i));
		}
	}
}

class CollectData{
	public static void main(String [] argv) throws IOException  {
		CollectDataWork cdw = new CollectDataWork();
		//cdw.printFiles();
	}
}
