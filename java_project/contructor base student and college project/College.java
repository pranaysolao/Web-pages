import java.util.Scanner;
class College {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Student123.institute = "Naresh IT";

		Student123 s1 = new Student123();
		Student123 s2 = new Student123();

		System.out.println("Enter First Student values: ");

		System.out.println("\nEnter Student Number\t\t: ");
		s1.sno = scn.nextInt(); scn.nextLine();

        System.out.println("Enter Student Name\t\t: ");
		s1.sname = scn.next();  scn.nextLine();		

		System.out.println("Enter Student Course\t\t: ");
		s1.course = scn.next(); scn.nextLine();

		System.out.println("Enter Student Fee\t\t: ");
		s1.fee = scn.nextDouble();

		System.out.println("Enter Student Mobile Number\t: ");
		s1.mobileNo = scn.nextLong();

		System.out.println("Enter Student Email\t\t: ");
		s1.email = scn.next();

		System.out.println("Enter Student Gender\t\t: ");
		s1.Gender = scn.next().charAt(0);

		System.out.println("Course Completed: ");
		s1.courseCompleted = scn.nextBoolean();

		System.out.println(s1);
		System.out.println();
		System.out.println();

		System.out.println("Second Student Values: \n");
		s2.setSno(102);
		s2.setSname("Nikhil Raghuwanshi");
		s2.setCourse("Web Development");
		s2.setFee(5000);
		s2.setMobileNo(7000023290L);
		s2.setEmail("raghu@gmail.com");
		//s2.setGender(Female);
		//s2.setCourseCompleted(True);
        
		System.out.println("s2.institute\t\t: "   + s2.institute)           ;
		System.out.println("Sno\t\t\t: "          + s2.getSno())			;
		System.out.println("Sname\t\t\t: "		  + s2.getSname())			;
		System.out.println("Course\t\t\t: "		  + s2.getCourse())			;
		System.out.println("Fee\t\t\t: "		  + s2.getFee())		    ;
		System.out.println("Mobile Number\t\t: "  + s2.getMobileNo())		;
		System.out.println("Email\t\t\t: "		  + s2.getEmail())			;
		System.out.println("Gender\t\t\t: "		  + s2.getGender())			;
		System.out.println("Course Completed\t: " + s2.getCourseCompleted());

		System.out.println();
		System.out.println();

		Student123 s3 = new Student123(103,"Hrishabh","MBA",1300000,7098647536L,"rish3003@gmail.com",'m',true);
		s3.display();


 

	}
}
