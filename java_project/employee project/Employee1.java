class Employee1 {
	private int     eno;
	private String  ename; 
	private double  esal;
	private String  edept;
  

  public void setEno(int eno){
	this.eno = eno;
  }
  public int getEno(){
	return eno;
  }

  public void setEname(String ename){
	  this.ename = ename;
  }
  
 // public String getename(){
	//  return ename;
 // }
  public void setESal(double esal){
	  this.esal=esal;
  }
  public double getESal(){
	  return esal;
  }
  public void setEDept(String edept){
	  this.edept=edept;
  }
  public String getEDept(){
	  return edept;
  }

  public void display(){
	  System.out.println("Employee number is\t:"+eno);	  
	  System.out.println("Employee Name is\t:"+ename);
	  System.out.println("Employee Salary is\t:"+esal);
	  System.out.println("Employee department is\t:"+edept);
  }
}
  

