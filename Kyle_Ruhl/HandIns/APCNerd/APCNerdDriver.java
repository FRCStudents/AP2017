//package APCN;
public class APCNerdDriver{
public static void main(String[] argv){

	APCNerd a = new APCNerd();
	a.getNames();
	a.fillIntelegenceArray();
	a.fillSpeedArray();
	a.fillLaptopPerformArray();
	a.displaythearray();
	a.makeCopies();
	
	a.SortNamesAlphabetically();
	a.displaySortedFirstNames();
	
	a.sortIntelegence();
	a.displaySortedIntelegence();

	a.compareTo();
	}
}