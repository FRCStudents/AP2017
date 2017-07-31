/*****************************************
 * utility loading the database...
 *****************************************/
import java.io.*;
import java.util.*;

class FieldLine {
	private ArrayList<String> FieldList = new ArrayList<String>();
	public FieldLine(String line){
		for (String field: line.split("~")){
			this.FieldList.add(field);
			}
	}

	public void printFieldList(){
		for(int i=0; i < this.FieldList.size(); i++){
			System.out.print("[" + this.FieldList.get(i) + "]");
			}
	}

	public String buildSQLInsert(String table, String[] fieldNames){
		String SQL = "INSERT INTO " + table + "(";
		for(int i=0; i < this.FieldList.size(); i++){
			SQL += fieldNames[i] + "=" + this.FieldList.get(i);
			if(i < this.FieldList.size() - 1){
				SQL += ",";
				}
			}
		SQL += ");";
		return SQL;
	}

	public ArrayList<String> getFieldList(){
		return this.FieldList;
	}
}

class ReadFile {
    public ReadFile() {
        String fileName = "temp.txt";
        String line = null;
	      String[] fieldNamesBooks = {"NAME"};
        String[] fieldNamesLeagues = {"NAME"};
        String[] fieldNamesGames = {"TEAM_1", "TEAM_2","GAME_DATE", "LEAGUE_ID"};
        String[] fieldNamesGame_Stats = {"STAT_NAME", "STAT_VALUE", "GAME_ID"};
        String[] fieldNamesTeams = {"NAME", "SCHOOL", "NOTES"};
        String[] fieldNamesTeam_Stats = {"STAT_NAME", "STAT_VALUE", "TEAM_ID"};
        String[] fieldNamesPlayers = {"NAME", "TEAM_ID", "NUMBER", "HEIGHT","NOTES"};
        String[] fieldNamesPlayer_Stats = {"STAT_NAME", "STAT_VALUE", "PLAYER_ID"};

        try {
            FileReader fileReader =
                new FileReader(fileName);

            BufferedReader bufferedReader =
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
		FieldLine FL = new FieldLine(line);
		//FL.printFieldList();
		System.out.println(FL.buildSQLInsert("TABLE", fieldNames));
                //System.out.println(line);
            }

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" +
                fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '"
                + fileName + "'");
        }
    }

}

public class bballUtil {
    public static void main(String[] args){
        ReadFile RF = new ReadFile();
    }
}
