package student;

public class StudentMgmtService {
	public String generateResult(StudentDetails details) {
		 int total=details.getM1()+details.getM2()+details.getM3();
		 float avg=total/3.0f;
		 String result=null;
		if(avg>=75)
			result="First with dist";
		else if(avg>=60)
			result="first Class";
		else if(avg>=50)
			result="second class";
		else if(avg>=35)
			result="third class";
		else 
			result="fail";
		return result;
	 }
	}
