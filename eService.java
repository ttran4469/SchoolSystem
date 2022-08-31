package UHCLSystem;

public abstract class eService {
	
	private String id;
	private Data d;
	
	
	public eService(String i, Data d)
	{
		this.id = i;
		this.d = d;
	}
	
	//abstract method for welcome
	public abstract void welcome();
	
	//abstract method for viewMyCourse
	public abstract void viewMyCourses();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Data getD() {
		return d;
	}

	public void setD(Data d) {
		this.d = d;
	}

}
