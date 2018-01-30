
import java.util.*;
import skulbrains.Category;
import skulbrains.Assignment;

public class ClassBook {
	private ArrayList<Category> categories;
	private ArrayList<Assignment> assignments;

	public ClassBook(){
		categories = new ArrayList<Category>();
		assignments = new ArrayList<Assignment>();
	}

	public void addAssignment(Assignment a){
		assignments.add(a);
	}

	public void removeAssignment(int i){
		assignments.remove(i);
	}

	public void listAssignments(){
		for(int i=0; i < assignments.size(); i++){
			assignments.get(i).showAssignment();
		}
	}

	public void addCategory(Category c){
		categories.add(c);
	}

	public void removeCategory(int i){
		categories.remove(i);
	}

	public void listCategories(){
		for(int i=0; i < categories.size(); i++){
			categories.get(i).showCategory();
		}
	}
}	
