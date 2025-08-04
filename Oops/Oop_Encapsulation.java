//Encapsulation
class Books{
	private int bId;
	private String bName;
	private String bAuthor;
	
	public int getbId() {
		return bId;
	}
	
	public void setbId(int bId) {
		this.bId = bId;
	}



	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
}

public class Oop_Encapsulation {
	public static void main(String[] args){
		
		Books b=new Books();
		b.setbId(1);
		b.setbName("Deeps to the Dins");
		b.setbAuthor("Dinesh");
		
		System.out.println("Book Id : "+b.getbId());
		System.out.println("Book Name : "+b.getbName());
		System.out.println("Book Author : "+b.getbAuthor());
	}
}
