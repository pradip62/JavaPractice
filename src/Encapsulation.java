
public class Encapsulation {

	private String empName;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	
	public static void main(String[] args) {
	
Encapsulation e=new Encapsulation();
e.setEmpName("pradip");
System.out.println(e.getEmpName());
	}

}
