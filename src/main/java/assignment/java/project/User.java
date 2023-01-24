package assignment.java.project;

public class User {
	
	private long id;
	private String name;
	private String username;
	private long mobile_number;
	private String gmail;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", mobile_number=" + mobile_number
				+ ", gmail=" + gmail + "]";
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public String getGmail() {
		return gmail;
	}
	public User(long id, String name, String username, long mobile_number, String gmail) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.mobile_number = mobile_number;
		this.gmail = gmail;
	}
	
}
