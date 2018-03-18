package bballUtil;
import java.io.*;

/*********************************
 * This is for messaging while
 * working on the code...
 *********************************/

public class ballDEBUG
{
	boolean DEBUG = false;

	public void msgPrt(String msg){
		if(DEBUG){
			System.out.println(msg);
			}
		}

	public void debugOn(){
		this.DEBUG = true;
		}

	public void debugOff(){
		this.DEBUG = false;
		}

	public void setDebug(boolean tf){
		this.DEBUG = tf;
		}

}
