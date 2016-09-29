package day5;

/*
 *  자바빈 패턴,VO (Value Object), DTO(Data Transfer Object), Entity
 *  	보통 실무에서 위 네가지 방식을 혼용해서 사용함 
 *  현재 개발하는 애플리케이션의 도메인에 따라 이름이 달라질 수 있음
 * */
public class BankAccount {
	
	private int amount = 1000000;
	public String owner = "이상훈";
	private String password = "비밀번호!@3"; 
	private boolean enabled;
	
	public BankAccount() {
	}
	
	public void setOwner(String owner) {
		if (!"이상훈".equals(owner)) {
			return;
		}
		this.owner = owner;
	}
	
	public void setAmount(int amount) {
		if (this.password.equals("비밀번호!@3")) {
			this.amount = amount;	
		}
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	

	
}
