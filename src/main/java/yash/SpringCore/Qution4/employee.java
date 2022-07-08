package yash.SpringCore.Qution4;

//4. WAP to perform demonstrate autowire. Use Two classes, first class Employee, second 
//department now store all employee and department details. Print employee details in order 
//by employee salary .
public class employee {
 
	int empId;
	String empName;
	long empSallary;
	department dept;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpSallary() {
		return empSallary;
	}
	public void setEmpSallary(long empSallary) {
		this.empSallary = empSallary;
	}
	public department getDept() {
		return dept;
	}
	public void setDemt(department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empSallary=" + empSallary + ", dept=" + dept
				+ "]";
	}
	
	
	

}
