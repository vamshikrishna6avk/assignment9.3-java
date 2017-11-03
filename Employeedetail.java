package abstractclass;//created package as abstractclass

public class Employeedetail {//created class name as Employeedetail

	public static void main(String[] args) {
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter

		/* creating object */
		Employee obj1 = new PermanentEmp(25, "VAMSHI", 24, 50000);
		/* output */
		System.out.println("parmanent employee detail");
		/* calling id,name,no of leaves */
		System.out.println("Id  =" + obj1.empId);//system is used to return code
        //out is a static member
      	//Println is used to print text  and gives output 
		System.out.println("name =" + obj1.empName);
		System.out.println("leave =" + obj1.total_leaves);
		/* calling method */
		obj1.calculate_balance_leaves();
		obj1.avail_leave(21, (char) 0);
		obj1.calculate_salary();
		System.out.println("..................................");//system is used to return code
        //out is a static member
      	//Println is used to print text  and gives output 

		Employee obj2 = new TemporaryEmp(29, "KRISHNA", 20, 50001);
		System.out.println("temporay employee detail");
		/* calling id,name,no of leaves */
		System.out.println("Id  =" + obj2.empId);//system is used to return code
        //out is a static member
      	//Println is used to print text  and gives output 
		System.out.println("name =" + obj2.empName);
		System.out.println("leave =" + obj2.total_leaves);
		/* calling method */
		obj1.calculate_balance_leaves();
		obj1.avail_leave(20, (char) 0);
		obj1.calculate_salary();

	}

}