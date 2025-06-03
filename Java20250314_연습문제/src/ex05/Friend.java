package ex05;

public class Friend extends Person {
	
	private String phoneNumber;
	private String email;
	
	public Friend(String name, String phoneNumber, String email){
		super(name);
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	@Override
	public String getInfo() {
		return super.getInfo() + "\t" + phoneNumber + "\t" + email;
	}

}
