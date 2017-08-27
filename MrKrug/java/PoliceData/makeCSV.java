package csvReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Field {
    String title;
    String value;

    public Field(){
      this("NoTitle", "Empty");
    }

    public Field(String title, String value){
      this.title = title;
      this.value = value;
    }

    public void display(){
      System.out.println("Title: [" + title + "] Value: [" + value + "]");
    }
}

class Titles {
    String [] titles;

    public Titles(String [] arr){
      titles = new String[arr.length];

      for(int i=0; i < arr.length; i++){
          titles[i] = arr[i];
      }
    }

    public String getTitle(int i){
      //System.out.print("[" + i + "]");
      if(titles.length - 1 < i){
        return "";
      }
      return titles[i];
    }

    public void display(){
      for(int i=0; i < titles.length; i++){
        System.out.println(titles[i]);
      }
    }
}

class makeCSVRead {
    Titles titles;
    Field[] data;
    PoliceStat[] psArr = new PoliceStat[2865];

    public PoliceStat[] getPoliceStatArray(){
      return psArr;
    }

    public int getCountByGender(String gender){
      int count = 0;
      for(int i = 0; i < 2865; i++){
        if (psArr[i] instanceof PoliceStat){
          if(psArr[i].getGender().equals(gender)){
            count++;
          }
        }
      }
      return count;
    }

    public int getCountByRace(String race){
      int count = 0;
      for(int i = 0; i < 2865; i++){
        if (psArr[i] instanceof PoliceStat){
          if(psArr[i].getRace().equals(race)){
                count++;
          }
        }
      }
      return count;
    }

    public int getUnarmedCountByRace(String race){
      int count = 0;
      for(int i = 0; i < 2865; i++){
        if (psArr[i] instanceof PoliceStat){
          if(psArr[i].getRace().equals(race)){
            if(!psArr[i].isArmed())
                count++;
          }
        }
      }
      return count;
    }


    public void display(){
      for (int i=0; i<data.length; i++){
        data[i].display();
      }
    }

    private Titles setHeadLines(String [] arr){
      Titles t = new Titles(arr);
      return t;
    }

    public makeCSVRead() {
        //System.out.println("makeCSVRead - constructor...");
        String csvFile = "fatal-police-shootings-data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        boolean firstSw = true;
        int lineCount = 0;

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] arr = line.split(cvsSplitBy);
                if(firstSw){
                  titles = setHeadLines(arr);
                  data = new Field[arr.length];
                  firstSw = false;
                  continue;
                }

                for(int i=0; i < 14; i++){
                  Field f = new Field(titles.getTitle(i), arr[i]);
                  data[i] = f;
                }

                psArr[lineCount] = new PoliceStat(arr);
                lineCount++;
                //System.out.println("Name: [first name= " + arr[0] + " , last name=" + arr[1] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

class makeCSV {
  public static void main (String [] argv){
    //System.out.println("In Main");
    makeCSVRead mCR = new makeCSVRead();
    //System.out.println("created a makeCSVReader");
    System.out.println("Current population of the US: ");
    System.out.println("\tWhite: 63.7%");
    System.out.println("\tHispanic: 16.3%");
    System.out.println("\tBlack: 12.2%");
    System.out.println("\n*****************************************\n");
    System.out.println("Counts - police deaths by race/gender: ");
    System.out.println("\tMale: " + mCR.getCountByGender("M"));
    System.out.println("\tFemale: " + mCR.getCountByGender("F"));

    int total = mCR.getCountByRace("B") + mCR.getCountByRace("W") + mCR.getCountByRace("H");
    System.out.println("\n\n\tTotal: " + total);

    System.out.print("\tBlack: " + mCR.getCountByRace("B"));
    System.out.println(" / Black: " + (int)(100 * ((double)mCR.getCountByRace("B")/(double)total)) + "%");
    System.out.print("\tHispanic: " + mCR.getCountByRace("H"));
    System.out.println(" / Hispanic: " + (int)(100 * ((double)mCR.getCountByRace("H")/(double)total)) + "%");
    System.out.print("\tWhite: " + mCR.getCountByRace("W"));
    System.out.println(" / White: " + (int)(100 * ((double)mCR.getCountByRace("W")/(double)total)) + "%");

    total = mCR.getUnarmedCountByRace("B") + mCR.getUnarmedCountByRace("W") + mCR.getUnarmedCountByRace("H");
    System.out.println("\n\n\tUnarmed Total: " + total);

    System.out.print("\tBlack: " + mCR.getUnarmedCountByRace("B"));
    System.out.println(" / Black: " + (int)(100 * ((double)mCR.getUnarmedCountByRace("B")/(double)total)) + "%");
    System.out.print("\tHispanic: " + mCR.getUnarmedCountByRace("H"));
    System.out.println(" / Hispanic: " + (int)(100 * ((double)mCR.getUnarmedCountByRace("H")/(double)total)) + "%");
    System.out.print("\tWhite: " + mCR.getUnarmedCountByRace("W"));
    System.out.println(" / White: " + (int)(100 * ((double)mCR.getUnarmedCountByRace("W")/(double)total)) + "%");



    //mCR.display();
  }
}
