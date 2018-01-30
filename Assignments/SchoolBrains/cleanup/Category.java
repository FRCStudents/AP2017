
package skulbrains;
public class Category implements ICategory{
	private String name;
	private int weight;
	private boolean use;
	private int categoryID;
	private int classID;

	public Category(){
		weight = 10;
		use = true;
		name = "Assignment";
		categoryID = 1;
		classID = 1;
	}

	public Category(String n, int w){
		this();
		name = n;
		weight = w;
	}

	public void setWeight(int w){
		weight = w;
	}

	public void setName(String n){
		name = n;
	}

	public int getWeight(){
		return weight;
	}

	public void setCategoryID(int catID){
		categoryID = catID;
	}

	public int getCategoryID(){
		return categoryID;
	}

	public void setClassID(int classID){
                this.classID = classID;
	}

	public int getClassID(){
		return classID;
	}

	public void showCategory(){
		System.out.println("Category: " + name + " " + weight + "% {" + categoryID + "}");
		//System.out.println("*************************************");
		//System.out.println("Name: " + name + " " + weight + "%");
		//System.out.println("ID: " + categoryID);
		//System.out.println("*************************************");
	}	
} 
