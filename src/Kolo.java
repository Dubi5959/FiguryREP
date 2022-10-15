
public class Kolo extends Figura{
	
	final  double PI = 3.14159;

	double promien;
	
	Kolo(double promien){
		this.promien = promien;
	}
	
	
	@Override
	double Obwod() {
		
		return 2*PI*promien;
	}

	@Override
	double Pole() {
		
		return PI*promien*promien;
	}

	

	


	

}
