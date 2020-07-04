package Domain;

public class Student {
	private String firstname;
	private String lastname;
	private int code;
	
	public Student(String firstname,String lastname,int code) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.code = code;
	}
	public String getFname() { return firstname; }
	public void setFname(String firstname) {this.firstname = firstname;}
	public String getLname() { return lastname;}
	public void setLname(String lastname) {this.lastname = lastname;}
	public int getCode() { return code;}
	public void setCode(int code) {this.code = code;}
	@Override
	public boolean equals(Object arg0) {
		boolean result = false;
		if(arg0 instanceof Student) {
			Student other = (Student) arg0;
			result = this.getCode() == other.getCode();
		}
		return result;
	}
	@Override
	public int hashCode() {
		Integer newInt = new Integer(this.getCode());
		return newInt.hashCode();
	}
}

