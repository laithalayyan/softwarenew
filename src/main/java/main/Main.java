package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import main.Admin;
import main.Database;
import main.User;


public class Main {
	private static final Logger logger = Logger.getLogger(Main.class.getName());
    static List<User> dbApartment = new ArrayList<User>();
    static List<accessories> dbBuilding = new ArrayList<accessories>();

    static int num;
    static Scanner s = new Scanner(System.in);
    static String email = "0";
    static String password = "0";
    static String name = "0";
    static String major = "0";
    private static String type = "0";
    static int age = 0;
    static String id = "0";
    static String phoneNumber = "0";
    
    private static User user1 = new User();
    static Database db = new Database();
    
    private static String s1 = "Please this is not an invalid email\\n reenter ur email";
    private static String s2 = "\nPlease enter your password:";
    private static String s3 = "The entry is not correct!.";
    
    static void first() {
    	logger.info("choose:1-Admin 2-Customer 3-Installer");
    	num=s.nextInt();
    	switch(num) {
    	case 1: {
    		viewAdmin();
    	}
    	}
    }
    
    
    
    static void viewAdmin(){
   	 logger.info("Please enter your email as admin"); 
   	 email=s.nextLine();
   	 while(!(email.contains("@"))) {
   			logger.info(s1); 
   			email=s.nextLine();
   	 }		
       logger.info(s2); 
       password=s.nextLine();
       Admin.check(email, password);

   }
}

