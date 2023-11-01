package main;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Database {
	public static List <User> dbUser=new ArrayList <User>();
	List <accessories> dbAccessories=new ArrayList <accessories>();
	//List <installation> dbInstallation=new ArrayList <installation>();
	private static final Logger logger = Logger.getLogger(Database.class.getName());
	String newcustomer="new customer";
	
	public void login(String email , String password) {
		User obj0=new User();
		dbUser.add(obj0);
		obj0.email="laith@gmail.com";
		obj0.setPassword("laith123");
		dbUser.add(obj0);
		User obj1=new User();
		obj1.email=email;
		obj1.password=password;
		if(!dbUser.contains(obj1)) {
			dbUser.add(obj1);
			logger.info(newcustomer);
		}else logger.info("this customer already exists!");
	}
	
	

}
