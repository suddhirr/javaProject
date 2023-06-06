
public class Acc_Info {
	String name;
	int balance;
	
	public Acc_Info(){
		name="Nirali";
		balance=3000;
	}
	public Acc_Info(String n,int b){
		name=n;
		balance=b;
	}
	void display() {
		System.out.println(name);
		System.out.println(balance);
	}
	public String getname(){
		return name;
	}
	public void setname(String n) {
		name=n;
	}
	public int getbalance(){
		return balance;
	}
	public void setbalance(int b) {
		balance=b;
	}
	public int deposite(int amount) {
		balance+=amount;
		return balance;
	}
	public int withdraw(int amount) {
		if(balance>=amount && (balance-amount)>=1000) {
			balance-=amount;
			return balance;
		}
		return -1;
	}
}