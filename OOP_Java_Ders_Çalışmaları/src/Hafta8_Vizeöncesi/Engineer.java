package Hafta8_Vizeöncesi;

public class Engineer extends employee{
	
	Engineer (String name,String surname){
		super(name,surname);
		setJob("Muhendis");
		setAnnualPermit(30);
		setSalary(12500);
		
	}
	Engineer(String name,String surname,int salary){
		super(name,surname);
		setSalary(salary);
		if(salary>12500) {
			setJob("Yüksek Mühendis");
			setAnnualPermit(35);
			
		}
		else if(salary >15000) {
			setJob("Kıdemli Yüksek Mühendis");
			setAnnualPermit(40);
			
		}else {
			setJob("Mühendis");
			setAnnualPermit(30);
		}
	}
	public int makeRaise(double howMuch ) {
		double money =(double)(getSalary()*howMuch)+2500;
		return annualPermit;
	}


}
