class Bankoperation         // Bank Operation output 
{
	public static void main(String[] args) {
	
	//initilizing banka details in BankAccount class
	      BankDetails.bankName   = "Kotak";
		  BankDetails.branchName = "Amaravai";
	      BankDetails.ifsc       = "KKBK000548";

		  //creating instance of Bankaccount for the coustomer Hk and PS

		  BankDetails acc1 = new BankDetails();
		  BankDetails acc2 = new BankDetails();

		 // System.out.println("Acc1 details ");
		  //acc1.display();

	     //System.out.println("acc2 details");
		 //acc2.display();

	     //initializing acc1 instance properties with HK value
		 acc1.accNum    = 123456789987L;
		 acc1.accHName   = "PS";
		 acc1.balance    = 9999999;

		//initilizing acc2 instance properties with PS value
		acc2.accNum   = 9876543212123L;
		acc2.accHName = "Pranay Solao ";
		acc2.balance  = 8000000;

		System.out.println("\nAcc1 details ");
			acc1.display();

        System.out.println();

		 System.out.println("acc2 details");
		    acc2.display();

		//invoking static method specific object and common all object

		System.out.println("\nacc1.ifsc : ");
		acc1.ifsc();

		System.out.println("\nacc2.ifsc : ");
		acc2.ifsc();

		System.out.println("Kotak Bank Amaravati ifsc :");
		BankDetails.ifsc();

		System.out.println();

		//performing business operation

	    acc1.deposite(12);
        System.out.println();
		
		acc2.withdraw(1500);
	    System.out.println();

		System.out.println("Acc1 balance :"  );
		acc1.currentBalance();
		System.out.println("Acc2 balance :" );
		acc2.currentBalance();

       acc1.display();
	}
	 
}
