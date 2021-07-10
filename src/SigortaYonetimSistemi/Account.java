package SigortaYonetimSistemi;

import java.util.ArrayList;
import java.util.Objects;


public abstract class Account implements Comparable<Account> {

	
	private static User user;
	private ArrayList<Insurance> insurances;
	private static AuthenticationStatus status = AuthenticationStatus.FAIL;
	
	
	
	public static boolean AuthenticationStatus(String userMail,String userPassword ,String mail ,String password) throws InvalidAuthenticationException{
		if(mail.equals(userMail) && password.equals(userPassword)) {
			setStatus(AuthenticationStatus.SUCCESS);
			return true;
		}else {
			throw new InvalidAuthenticationException("Giriş Başarısız");
		}
	}

	public  final void showUserInfo() {
		System.out.println("Ad :" + getUser().getName() );
		System.out.println("Soyad :" + getUser().getSurname() );
		System.out.println("Email :" + getUser().getEmail());
		System.out.println("Meslek :" + getUser().getJob());
		System.out.println("Yaş :" + getUser().getAge());
		System.out.println("Sisteme son giriş tarihi :" + getUser().getLastLoginDate() );
		for(Address address :getUser().getAddresses()) {
			System.out.println(address);
		}
		
		
	}
	AddressManager addressManager = new AddressManager();
	
	public  void addAddress(Address address) {
		addressManager.add(getUser(), address);
	}
	
	public  void removeAddress(int id) {
		addressManager.remove(user, id);
	}
	
	
	public abstract  Insurance addInsurance();
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<Insurance> getInsurances() {
		return insurances;
	}

	public void setInsurances(ArrayList<Insurance> insurances) {
		this.insurances = insurances;
	}

	public static AuthenticationStatus getStatus() {
		return status;
	}

	public static void setStatus(AuthenticationStatus status) {
		Account.status = status;
	}
	
	public int compareTo(User user) {
		
		return  user.getName().compareTo(this.user.getName());
	}
	
	
	public boolean equals(Object object) {
		 if (this == object) {
			 return true;
		 }
		 if (object == null || getClass() != object.getClass()) {
			 return false;
		 }
		 Account account = (Account) object;
		 return Objects.equals(user, account.user);
	}
	
	public int hashCode() {
		return Objects.hashCode(user);
	}

	
	
}
