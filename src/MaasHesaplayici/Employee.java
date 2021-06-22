package MaasHesaplayici;

public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {

		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	
	double tax() {
		if(this.salary < 1000) {
			return 0;
		}
		else {
			return this.salary*0.03;
		}
	}
	
	double bonus(int workHours) {
		
		double bonus = 0;
		if(workHours - 40 >0) {
			return (workHours -40)*30;
		}
		return bonus;
		
	}
	
	double raiseSalary(int hireYear){
		int year = 2021- hireYear;
		if(year < 10) {
			return (this.salary *0.5);
		}
		else if(year >9 && year <20) {
			return (this.salary *0.10);
		}else {
			return (this.salary *0.15);
		}
	}
	
	void toString(Employee employee) {
		System.out.println("Adı : " + this.name);
		System.out.println("Maaşı : " + this.salary);
		System.out.println("Çalışma Saati : " + this.workHours);
		System.out.println("Başlangıç Yılı : " + this.hireYear);
		System.out.println("Vergi "  + tax());
		System.out.println("Bonus : " + bonus(this.workHours));
		System.out.println("Maaş Artışı : " + raiseSalary(this.hireYear));
		System.out.println("Vergi ve Bonuslar ile birlikte maaş " + (this.salary + bonus(this.workHours) - tax()));
		System.out.println("Toplam Maaş : " + (this.salary+raiseSalary(this.hireYear)));
	
	}
	
	
}
