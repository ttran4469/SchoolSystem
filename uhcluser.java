package UHCLSystem;
import javax.persistence.*;

@Entity  //this is an entity class
@Table(name="uhcluser")  //the class is mapped to the uhcluser table
public class uhcluser {
	
	@Id
	@Column(name="loginID")      //loginID field is mapped to the loginID column and it is a primary key
	private String loginID;
	
	@Column(name="password")   //password field is mapped to the password column
	private String password;
	
	@Column(name="major")    //major field is mapped to the major column
	private String major;
	
	@Column(name="type")   //type field is mapped to the type column
	private String type;
	
	public uhcluser()    //constructor
	{
		
	}
	
	public uhcluser(String i, String p, String m, String t)  //constructor with parameters
	{
		this.loginID = i;
		this.password = p;
		this.major = m;
		this.type = t;
	}
	
	//get methods and set methods

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
