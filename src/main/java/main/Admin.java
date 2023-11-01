package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Admin {
	private static final Logger logger = Logger.getLogger(Admin.class.getName());
	String address;
	 public String email;
	 String name;
	 String id;
	 public String password;
	 String phone;
    

    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static int check(String string1, String string2) {
        if((string1.equals("laith@gmail.com") && string2.equals("laith123")) ||(string1.equals("lala@gmail.com") && string2.equals("laith1234")) )
        {	
		    logger.info("\n u logged in sucessfully as admain"); 
			return 1;	
        }
        else {
	        logger.info("\n admin please try again"); 
	        return 0;
    }
	}
	
}
