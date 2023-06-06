
public class Account {

	public static void main(String[] args) {
		Account_Info a=new Account_Info();
		Account_Info a1=new Account_Info("Yesha",1000);
		a.setbalance(5000);
		System.out.println(a.getbalance());
		System.out.println(a.withdraw(2000));
		System.out.println(a.deposite(4000));
		System.out.println(a.withdraw(1500));
		a.display();
		a1.display();
	}

}