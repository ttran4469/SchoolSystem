package UHCLSystem;

public abstract class blackBoard {
	
	private String id;
	private Data d;
	
	public blackBoard(String id, Data d) {
		this.id = id;
		this.d = d;
	}
	
	
	public abstract void welcome();
	//Abstract class need to remove body
	
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
