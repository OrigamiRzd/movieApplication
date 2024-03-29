package cinema.user.entity;

//Imports gotten by right click > source > organize imports
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @HoonJae Won
 * Entity maps to the mysql table and the "@Column" maps the column name to the appropriate variables
 */
@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //identifying the primary key
	@Column(name="userId")
	private Integer userId; 
	
	//Column name must be the exact name with case sensitivity of the attribute inside the db table.
	@Column(name="userName")
	private String userName; 
	
	@Column(name="fName")
	private String fname;
	
	@Column(name="lName")
	private String lname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="location")
	private String location;
	
	@Column(name="userType")
	private Integer userType;
	
	@Column(name="confirmation")
	private boolean confirmation = false;
	
	@Column(name="subscribed")
	private boolean subscribed = false;
	
	@Column(name="bDate")
	private String bDate;
	
	@Column(name="resetPassword")
	private boolean resetPassword;
	
	public User() {
		
	}

	//This constructor made by right clicking > Source > generate constructor with fields
	public User(String userName, String fname, String lname, String email, String password, String location, int userType, boolean confirmation, boolean subscribed, String bDate, boolean resetPassword) {
		super();
		this.userName = userName;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.location = location;
		this.userType = userType;
		this.confirmation = confirmation;
		this.subscribed = subscribed;
		this.bDate = bDate;
		this.resetPassword = resetPassword;
	}

	//All getter and setters generated by right clicking > Source > generate getters and setters 
	public Integer getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
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


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getUserType() {
		return userType;
	}


	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	public boolean getConfirmation() {
		return confirmation;
	}


	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}
	
	public boolean getSubscribed() {
		return subscribed;
	}


	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
	
	public String getBdate() {
		return bDate;
	}


	public void setBdate(String bDate) {
		this.bDate = bDate;
	}
	
	public boolean getResetPassword() {
		return resetPassword;
	}


	public void setResetPassword(boolean subscribed) {
		this.resetPassword = resetPassword;
	}

	
	
	//toString used for debugging
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", fname=" + fname + ", lname="
				+ lname + ", email=" + email + ", password=" + password + ", location=" + location + ", userType=" + userType;
	}
	
	
	
}
