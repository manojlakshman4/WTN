package oopsInheritance.inheritance;

class GetSet extends Employee{
	GetSet(String VariableName) {
		this.VariableName=VariableName;
	}
	
	void setPerson(String VariableName) {
		this.VariableName=VariableName;
	}
	
	void setEmpDetails(double AnnualSalary, int Year, String InsuranceNumber){
		this.AnnualSalary=AnnualSalary;
		this.Year=Year;
		this.InsuranceNumber=InsuranceNumber;
	}
	
	void getPerson() {
		System.out.println("Variable name : "+VariableName);
	}
	
	void getEmpDetails(){
		System.out.println("Annual Salary is : "+AnnualSalary);
		System.out.println("Year the employee started to work : "+Year);
		System.out.println("The national insurance number :"+InsuranceNumber);
	}
}

public class TestEmployee {
	public static void main(String[] args) {
		GetSet gs1=new GetSet("Manoj");
		gs1.setEmpDetails(100000, 2021, "WTN3");
		gs1.getPerson();
		gs1.getEmpDetails();
	}
}
