package OgrenciBilgiSistemi;

public class Course {

	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	int verbalNote;
	
	public Course(String name, String code, String prefix, Teacher teacher) {
		
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.verbalNote=0;
		this.teacher = teacher;
	}
	
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
		}
	
	}
	
	void printTeacherInfo() {
		this.teacher.print();
	}
	

	
}
