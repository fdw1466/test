package designPattern.J2EE.MVCPattern;

public class Student {
	private String rollNo;
	private String name;

	public Student(String rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
