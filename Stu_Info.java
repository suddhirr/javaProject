
public class Stu_Info {
	private String name;
	private int roll_no;
	private String email_id;
	
	public Stu_Info(){
		name="ABC";
		roll_no=12;
		email_id="abc@gmail.com";
	}
	public Stu_Info(String n,int r,String e){
		name=n;
		roll_no=r;
		email_id=e;
	}
	 void display() {
		System.out.println(name+roll_no+email_id);
	}
	
	public String getname(){
		return name;
	}
	public void setname(String n) {
		name=n;
	}
	public int getroll_no(){
		return roll_no;
	}
	public void setroll_no(int r) {
		roll_no=r;
	}
	public String getemail(){
		return email_id;
	}
	public void setemail(String e) {
		email_id=e;
	}
}