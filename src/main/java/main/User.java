package main;

import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;

public class User {
	private static final Logger logger = Logger.getLogger(User.class.getName());

	String address , name , id , phone , major;
	public String email;
	public String password;
	float point=0;
	int age;
	public String type;
	private String acc;
	User u1;
	static List <User> userarray=new ArrayList <User> ();
	boolean log=false;
	static Database db = new Database();
	public User() {
		this.initialUser();
	}
	public void initialUser() {
		this.address="qalqilia";
		this.email="lala@gmail.com";
		this.id="1";
		this.password="123456789";
		this.phone="0598809902";
		this.name="laith";
		this.major="CE";
		this.setType("student");
		
		userarray.add(this);
	}
	public static int checkUser(String s1,String s2) {
		if((s1.equals("laith@gmail.com")&&s2.equals("laith123"))) {
			logger.info("loged in successfully");
			db.login(s1, s2);
			return 1;
		}else {
			db.login(s1,s2);
		}
		return 0;
	}
	public void signup(String ss1,String ss2) {
		u1.email=ss1;
		u1.password=ss2;
		userarray.add(this);
	}
	public User(String email, String password, String name, String type, String major, int age,String id) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.age = age;
		this.major = major;
		this.setType(type);
		this.id=id;
	}
	
	
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public boolean isLog() {
		return log;
	}
	public void setLog(boolean log) {
		this.log = log;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
