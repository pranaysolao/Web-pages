class BankDetails
{
	//Static fields
	static String bankName;
	static String branchName;
	static String ifsc;
    
	//non-static fields
    long   accNum;
	String accHName;
	double balance;

    //instance method to perform business operation of an account

	void deposite(double amt){
		 balance=balance + amt;
         alert(" debited ",+amt);
	}
	void withdraw(double amt){
		balance=balance - amt;
		alert(" credited ",amt);
	}
	void currentBalance(){
		System.out.println(balance);
	}
	private void alert(String operation,double amt){
		System.out.println(" your account " +accNum+ "is" +operation+ "with" +amt);
		System.out.println(" The total balance is "+balance);
	}

	//static method for printing static field
	static void  bankName(){
		System.out.println(bankName);
	}
	static void branchName(){
		System.out.println(branchName);
	}
	static void ifsc(){
		System.out.println(ifsc);
	}

	//instance method for displaying all value of an accocunt

	void display(){
		System.out.println("BankName\t:"        +bankName  );
	    System.out.println("BranchName\t:"      +branchName);
		System.out.println("ifsc\t\t:"          +ifsc      );
		System.out.println("AccuntNumber\t:"    +accNum    );
		System.out.println("AccountHName\t:"    +accHName  );
		System.out.println("Balance\t\t:"         +balance   );
        System.out.println("BankName\t:"        +bankName  );
	}
}
