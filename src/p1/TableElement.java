package p1;

public class TableElement {
	
	private String name;
	private String ar;
	private String br;
	private String d;
	
	TableElement(String name, String ar, String br, String d) {
		this.name = name;
		this.ar = ar;
		this.br = br;
		this.d = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAr() {
		return ar;
	}

	public void setAr(String ar) {
		this.ar = ar;
	}

	public String getBr() {
		return br;
	}

	public void setBr(String br) {
		this.br = br;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}
	
	

}
