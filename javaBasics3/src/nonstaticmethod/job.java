package nonstaticmethod;

public class job {
	static int empId = 101;
	int deptnum = 2;
	static long accnum = 9665011091l;
	double salary = 50000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		job obj = new job();
System.out.println("Employe ID is "+empId);
System.out.println("Department number is "+obj.deptnum);
System.out.println("Account number is "+accnum);
System.out.println("salary is "+obj.salary);
	}

}
