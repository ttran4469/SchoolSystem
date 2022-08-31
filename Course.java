package UHCLSystem;
import javax.persistence.*;

@Entity
@Table(name="Course")
public class Course {

	@Id
	@Column(name="courseID")
	private String courseID;
	
	@Column(name="instructor")
	private String instructor;
	
	@Column(name="cap")
	private int cap;
	
	@Column(name="enrolled")
	private int enrolled;
	
	@Column(name="status")
	private String status;
	
	public Course()
	{
		
	}
	
	public Course(String id, String i, int cap, int e, String s)
	{
		this.courseID = id;
		this.instructor = i;
		this.cap = cap;
		this.enrolled = e;
		this.status = s;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public int getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(int enrolled) {
		this.enrolled = enrolled;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
