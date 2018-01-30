package skulbrains;
import java.util.*;
import skulbrains.User;

interface IUserList {
	public void listUsers();
	public void deleteUser(int i);
	public int size();
	public void addUser(String fname, String lName, int userType);
	public void deleteAll();
	public void addUser(User u);
	public User getUser(int i);
}	
