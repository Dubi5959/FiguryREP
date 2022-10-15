
public class Pieciokat extends Figura{
	
	final double SQRT5 = 2.2360;
	
	double bok;
	
	Pieciokat(double bok){
		this.bok=bok;
	}

	@Override
	double Obwod() {
		
		return 5*bok;
	}

	@Override
	double Pole() {
		
		return ((SQRT5+1)/2)*bok;
	}
	
	
}
