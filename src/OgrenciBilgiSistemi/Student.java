package OgrenciBilgiSistemi;

public class Student {
	
	Course course1;
	Course course2;
	Course course3;
	
	String name;
	String studNo;
	String classes;
	double average;
	boolean isPass;
	
	public Student(Course course1, Course course2, Course course3, String name, String studNo, String classes) {

		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.name = name;
		this.studNo = studNo;
		this.classes = classes;
		this.average = 0.0;
		this.isPass = false;
	}
	
	void addBulkExamNote(int note1,int verbalnote1,int note2,int verbalnote2,int note3,int verbalnote3) {
		
		if(note1 >= 0 && note1<=100 ) {
			this.course1.note = note1;
		}
		if(verbalnote1 >= 0 && verbalnote1<=100 ) {
			this.course1.verbalNote = verbalnote1;
		}
		if(note2 >= 0 && note2<=100 ) {
			this.course2.note = note2;
		}
		if(verbalnote2 >= 0 && verbalnote2<=100 ) {
			this.course2.verbalNote = verbalnote2;
		}
		if(note3 >= 0 && note3<=100 ) {
			this.course3.note = note3;
		}
		if(verbalnote3 >= 0 && verbalnote3<=100 ) {
			this.course3.verbalNote = verbalnote3;
		}
	}
	
	double average(int note,int vervalNote,String prefix) {
		double sum=0.0;
		if(prefix == "TRH") {
			sum = (note*0.9) +(note*0.1);
		}
		if(prefix == "FZK") {
			sum = (note*0.8) +(note*0.2);
		}
		if(prefix == "BIO") {
			sum = (note*0.7) +(note*0.3);
		}
		
		return sum;
		
	}
	void isPass() {
		this.average = (average(this.course1.note,this.course1.verbalNote,this.course1.prefix) +average(this.course2.note,this.course2.verbalNote,this.course2.prefix) + average(this.course3.note,this.course3.verbalNote,this.course3.prefix))/3.0;
		System.out.println("----------------------------");
		if(this.average > 55) {
			this.isPass = true;
			System.out.println("Hababam Sınıfı Uyanıyor");
		}else {
			System.out.println("Hababam Sınıfı Sınıfta kaldı");
		}
		printNote();
		System.out.println("Ortalamanız : " +this.average);
	}
	void printNote() {
		
		System.out.println(course1.name + " notu\t" +course1.note);
		System.out.println(course1.name + " sözlü notu\t" +course1.verbalNote);
		System.out.println(course2.name + " notu\t" +course2.note);
		System.out.println(course2.name + " sözlü notu\t" +course2.verbalNote);
		System.out.println(course3.name + " notu\t" +course3.note);
		System.out.println(course3.name + " sözlü notu\t" +course3.verbalNote);
		
	}
	
	
	
}
