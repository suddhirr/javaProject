
public class Student {

	public static void main(String[] args) {
		Stu_Info s = new Stu_Info();//calling default constructor
		Stu_Info s1 = new Stu_Info("Abc",15,"dsf");
		s.setname("Nirali");
		System.out.println(s.getname());
		s.setroll_no(10);
		System.out.println(s.getroll_no());
		s.setemail("nirali@gmail.com");
		System.out.println(s.getemail());
		s.display();
		s1.display();
	}

}