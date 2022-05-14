package Dao;

public class Main {
	
	private int id;
	private String name;
	private String email;
	private String pass;
	private String college;
	
	
	public Main() {
		super();
	}
	public Main(int id, String name, String email, String pass, String college) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.college = college;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
