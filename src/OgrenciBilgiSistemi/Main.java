package OgrenciBilgiSistemi;


public class Main {

	public static void main(String[] args) {
		

		
		Teacher t1 = new Teacher("Mahmut Hoca", "905673457678", "TRH");
		Teacher t2 = new Teacher("Graham Bell", "905673454578", "FZK");
		Teacher t3 = new Teacher("Külyutmaz", "905467893456", "BIO");
		
		Course tarih = new Course("Tarih", "101", "TRH",  t1);
		tarih.addTeacher(t1);
		
		Course fizik = new Course("Fizik", "102", "FZK",  t2);
		fizik.addTeacher(t2);
		
		Course biyoloji = new Course("Biyoloji", "103", "BIO",  t3);
		biyoloji.addTeacher(t3);
		
		Student s1 = new Student(tarih, fizik, biyoloji, "İnek Şaban", "1234","6A");
		
		//fiz note,verbalnote / tarih note,verbalnote , bio note,verbalnote
		s1.addBulkExamNote(50,50,100,100,20,20);
		s1.isPass();

		
	}

}
 