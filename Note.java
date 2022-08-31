package UHCLSystem;
import javax.persistence.*;

@Entity
@Table(name="Note")
public class Note {
	
	@Id
	@Column(name="autoid")
	private int autoid;
	@Column(name="userid")
	private String userid;
	@Column(name="courseid")
	private String courseid;
	@Column(name="content")
	private String content;
	@Column(name="datetime")
	private String datetime;
	
	public Note() {
		
	}
	public Note(int autoid, String userid, String courseid, String content, String datetime) {
		this.autoid = autoid;
		this.userid = userid;
		this.courseid = courseid;
		this.content = content;
		this.datetime = datetime;
	}
	
	public int getAutoid() {
		return autoid;
	}
	public void setAutoid(int autoid) {
		this.autoid = autoid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	

}
