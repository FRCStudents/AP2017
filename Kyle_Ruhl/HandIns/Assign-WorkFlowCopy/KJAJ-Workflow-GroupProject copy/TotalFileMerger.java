//second part of workflow project -merges all the response text files into one mega file for html'ing
//project by Kyle Ruhl, James Dimino, Archit Sahay, Julie Hu

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class TotalFileMerger{
	public static void main(String[] args) throws IOException{
		//Creating New File
		File myFile = new File("AllData.txt");
		myFile.createNewFile();
		
		// To Write on New File 
		PrintWriter pw = new PrintWriter("AllData.txt");
		
		// To List of files os Specific Directory
		myFile = new File("/Users/imac/Downloads/AP2017/KJAJ-Workflow-GroupProject/Responses/");
		String[] list = myFile.list();

		for(String s:list){
			File f = new File("/Users/imac/Downloads/AP2017/KJAJ-Workflow-GroupProject/Responses/" + s);
			
			if(f.isFile()){
				BufferedReader br = new BufferedReader(new FileReader(f));
				String line = br.readLine();
				while(line != null){
					pw.println(line);
					line = br.readLine();
				}
				br.close();
				
			}
		}
		
		pw.flush();
		pw.close();
		System.out.println("Done.");
	}
}