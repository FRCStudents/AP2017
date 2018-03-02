import java.io.*;
class SimpleProgram {
	String file = "";

	public SimpleProgram(String path){
		file = path;
	}

	public void run() throws IOException{
		String ln = "";
		boolean read = false;

		try{
			FileReader fileReader = new FileReader(file);
			BufferedReader bufFile = new BufferedReader(fileReader);

			while((ln = bufFile.readLine()) != null) {
				System.out.println(ln);
			}
			bufFile.close();
			read = true;

		} catch(FileNotFoundException ex){
			FileWriter write = new FileWriter(file);
			BufferedWriter bufWrite = new BufferedWriter(write);
			bufWrite.write("This file has been initialized");
			bufWrite.close();
		} finally {
			FileWriter write = new FileWriter("log.txt");
			BufferedWriter bufWrite = new BufferedWriter(write);
			if(read == true){
				bufWrite.write("Our file was read properly.");
			} else {
				bufWrite.write("Our file was initialized properly.");
			}
			bufWrite.close();
		}
	}
	public static void main(String[] argv) throws IOException{
		SimpleProgram test = new SimpleProgram("Status.txt");
		test.run();
	}
}