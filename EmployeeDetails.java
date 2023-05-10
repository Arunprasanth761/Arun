package week2.day3;


public class EmployeeDetails {
public void getEmpName(String empName) {
	System.out.println("employeeName:" +empName);
}
public void getempID(int empID) {
	System.out.println("employeeID:" +empID);

}
public void getempAddress(String empAddress) {
System.out.println("employeeAddress:" +empAddress);	
}
public void getempSalary(double empSalary) {
	System.out.println("employeeSalary:" +empSalary);

}
public void empMobileNumber(long empMobileNumber) {
	System.out.println("mobileNUmber:" +empMobileNumber);
}


	public static void main(String[] args) {
		EmployeeDetails testLeaf=new EmployeeDetails();
		testLeaf.getEmpName("Arun");
		testLeaf.getempID(1234);
		testLeaf.getempAddress("Salem");
		testLeaf.getempSalary(40500.30);
		testLeaf.empMobileNumber(9238746528L);
	

	}

}
