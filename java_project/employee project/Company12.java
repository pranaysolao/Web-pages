class Company12
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Employee e2=new Employee();

		e1.eno=101;
		e1.ename = "Pranay Solao";
		e1.department="Software developement";
		e1.salary=50000;

		e2.eno=102;
		e2.ename = "Amar Solao";
		e2.department="UI developement";
		e2.salary=80000;

			  System.out.println("e1.sno \t" +e1.eno);
              System.out.println("e1.sname \t" +e1.ename);
			  System.out.println("e1.department \t" +e1.department);
		      System.out.println("e1.salary \t" +e1.salary);
		      
              System.out.println();

			  System.out.println("e2.sno \t" +e2.eno);
              System.out.println("e2.sname \t" +e2.ename);
			  System.out.println("e2.department \t" +e2.department);
		      System.out.println("e2.salary \t" +e2.salary);
		      
	}


}
