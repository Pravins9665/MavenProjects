package nonstaticmethod;

public class job1 {

double getjob0(int empId) {

System.out.println("Employe ID is "+empId);
return empId;
}
double getjob1(long accnum) {
System.out.println("Account number is "+accnum);
return accnum;
}
double getjob2(double salary) {
System.out.println("salary is "+salary);
return salary;
}
double getjob3(int deptnum) {
System.out.println("Department number is "+deptnum);
return deptnum;
}



public static void main(String[] args) {
	// TODO Auto-generated method stub
	job1 obj = new job1();
	obj.getjob0(102);
	obj.getjob0(103);
	obj.getjob0(104);
	obj.getjob0(105);
	obj.getjob0(106);
	obj.getjob1(9999);
	obj.getjob1(9998);
	obj.getjob1(9997);
	obj.getjob1(9996);
	obj.getjob1(9995);
	obj.getjob2(51000);
	obj.getjob2(52000);
	obj.getjob2(53000);
	obj.getjob2(54000);
	obj.getjob2(55000);
	obj.getjob3(1);
	obj.getjob3(1);
	obj.getjob3(1);
	obj.getjob3(1);
	obj.getjob3(1);

}
}
