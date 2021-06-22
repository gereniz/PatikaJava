package OgrenciBilgiSistemi;

public class Teacher {

	String name;
	String telephone_number;
	String branch;
	
	Teacher(String name,String telephone_number,String branch){
		this.name = name;
		this.telephone_number= telephone_number;
		this.branch = branch;	
	}
	
	void print() {
		System.out.println("Ad : " +this.name);
		System.out.println("Telefon Numarası : " +this.telephone_number);
		System.out.println("Branş : " +this.branch);
	}
}
