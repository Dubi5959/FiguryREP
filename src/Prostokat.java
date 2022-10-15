
public class Prostokat extends Czworokat{
	
	Prostokat(double bok1, double bok2, double bok3, double bok4, double kat) {
		super(bok1, bok2, bok3, bok4, kat);
		
	}
	
	
	@Override
	double Obwod() {
		
		return bok1+bok2+bok3+bok4;
	}

	@Override
	double Pole() {
		if(bok1!=bok2) {
			return bok1*bok2;
		} else {
			return bok1*bok3;
		}
		
		
	}
}
