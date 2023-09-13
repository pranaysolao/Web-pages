class Company1 {
	public static void main(String[] args) {
    Employee1 e1=new Employee1();
	//
	//e1.display();

	e1.setEno(101);
	e1.setEname("Pranay Solao");
	e1.setESal(5000000);
	e1.setEDept("Software Engg");

     e1.display();

	 System.out.println();

	e1.setESal(e1.getESal()+ e1.getESal()*20/100);
	System.out.println("Employe Increase salary is :"+e1.getESal());

    

	 System.out.println();
	
	e1.setESal(50054);
	//System.out.println("Employee salary update is\t:"+e1.getESal());
	
	e1.display();
	 System.out.println();

	}
}
