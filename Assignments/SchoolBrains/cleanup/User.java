package skulbrains;

public interface IUser {
	public void showUser(int num);
        public String getFirstName();
        public String getLastName();
        public int getUserType();
	public User enterNewUser(int uType); 
}
