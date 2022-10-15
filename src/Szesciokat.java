
public class Szesciokat extends Figura{

	final double SQRT3 = 1.73205;
	
	double bok;

	Szesciokat(double bok){
		this.bok = bok;
	}
	
	@Override
	double Obwod() {
		
		return 6*bok;
	}

	@Override
	double Pole() {
		
		return (3*bok*bok*SQRT3)/2;
	}

}
