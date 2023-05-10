package student;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails details=new StudentDetails();
		details.setName("ravi");
		details.setSno(101);
		details.setSadd("ameerpet");
		details.setM1(90);
		details.setM2(80);
		details.setM3(70);

		StudentMgmtService service=new StudentMgmtService();
		String result=service.generateResult(details);
		System.out.println(result);
	}
}
