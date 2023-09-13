class Student123 {
    public static String institute;
	public int sno;
	public String sname;
	public String course;
	public double fee;
	public long mobileNo;
	public String email;
	public char Gender;
	public boolean courseCompleted;
   
   Student123(){
   }

	Student123(int sno, String sname, String course, double fee, long mobileNo,
		String email, char Gender, boolean courseCompleted) {
		 this.sno = sno;
		 this.sname = sname;
		 this.course = course;
		 this.fee = fee;
		 this.mobileNo = mobileNo;
		 this.email = email;
		 this.Gender = Gender;
		 this.courseCompleted = courseCompleted;
	} 
	

	static void institute() {
		 System.out.println(institute);
		
    }

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(char Gender) {
		this.Gender = Gender;
	}

	public void setCourseCompleted(boolean courseCompleted) {
		this.courseCompleted = courseCompleted;
	}

	public int getSno() {
		return sno;
	}

	public String getSname() {
		return sname;
	}
	public String getCourse() {
		return course;
	}
	public double getFee() {
		return fee;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return Gender;
	}
	public boolean getCourseCompleted() {
		return courseCompleted;
	}

     public void display() {
		 System.out.println(sno);
		 System.out.println(sname);
		 System.out.println(course);
		 System.out.println(fee);
		 System.out.println(mobileNo);
	     System.out.println(email);
	     System.out.println(Gender);
		 System.out.println(courseCompleted);
	 }

	 public String toString() {
		 return "Institute\t\t: " + institute +"\n"  +
		        "sno\t\t\t: "     + sno       +"\n"  +
		 "sname\t\t\t: "          + sname     + "\n" +
		 "course\t\t\t: "	      + course    + "\n" +
		 "Free\t\t\t: "	          + fee       + "\n" +
		 "MobileNo\t\t: "         + mobileNo  + "\n" +
		 "Email\t\t\t: "          + email     + "\n" +
		 "Gender\t\t\t: "         + Gender    + "\n" +
		 "Course Completer\t: "   + courseCompleted;
	 }

}
