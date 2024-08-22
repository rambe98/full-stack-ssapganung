package section05;

public class student_main {

	public static void main(String[] args) {
		
		System.out.println(student.schname);
		student.gotoschoo();
		
		student stu1 = new student();
		stu1.studentName = "김이박";
		stu1.hello();
		
		System.out.println("학교는 " + student.schname + " 입니다.");
		student.gotoschoo();
		System.out.println("---------------------------------");
		student stu2 = new student();
		stu2.studentName = "벨라루스";
		stu2.hello();
		System.out.println("학교는 " + student.schname + " 입니다.");
		student.gotoschoo();
		
		
		
		
		
	}

}
