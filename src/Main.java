
public class Main {

	public static void main(String[] args) {
		
		int dlugosc=args[0].length();	
		
		int liczbaPara = 1;
		
		char[] tab = new char[dlugosc];
		
		for(int i=0;i<dlugosc;i++) {
			if(args[0].charAt(i)=='o' || args[0].charAt(i)=='c' || args[0].charAt(i)=='p' || args[0].charAt(i)=='s') {
				tab[i]=args[0].charAt(i);
			} else {
				System.out.println("nieprawidlowa figura");
			}
				
			
			
		}
		
		for(int j=0;j<dlugosc;j++) {
			if(tab[j]=='o') {
				double n = Double.parseDouble(args[liczbaPara]);
				Kolo kolo = new Kolo(n);
				kolo.promien=n;
				System.out.println("Obwod Kola: "+ kolo.Obwod());
				System.out.println("Pole Kola: "+ kolo.Pole());
				System.out.println();
				liczbaPara++;	
			} else if(tab[j]=='p') {
				double m = Double.parseDouble(args[liczbaPara]);
				Pieciokat pieciokat = new Pieciokat(m);
				pieciokat.bok=m;
				System.out.println("Obwod Pieciokata: "+ pieciokat.Obwod());
				System.out.println("Pole Pieciokata: "+ pieciokat.Pole());
				System.out.println();
				liczbaPara++;
			} else if(tab[j]=='s') {
				double o = Double.parseDouble(args[liczbaPara]);
				Szesciokat szesciokat = new Szesciokat(o);
				szesciokat.bok=o;
				System.out.println("Obwod Szesciokata: "+ szesciokat.Obwod());
				System.out.println("Pole Szesciokata: "+ szesciokat.Pole());
				System.out.println();
				liczbaPara++;
			} else if(tab[j]=='c') {
				double b1 = Double.parseDouble(args[liczbaPara]);
				double b2 = Double.parseDouble(args[liczbaPara+1]);
				double b3 = Double.parseDouble(args[liczbaPara+2]);
				double b4 = Double.parseDouble(args[liczbaPara+3]);
				double k = Double.parseDouble(args[liczbaPara+4]);
				if(b1==b2 && b2==b3 && b3==b4 && k==90) {
					Kwadrat kwadrat = new Kwadrat(b1,b2,b3,b4,k);
					System.out.println("Obwod Kwadratu: "+ kwadrat.Obwod());
					System.out.println("Pole Kwadratu: "+ kwadrat.Pole());
					System.out.println();
				} else if(b1==b2 && b2==b3 && b3==b4 && k!=90) { //sprawdziæ czy k¹t wiekszy od 0 i mniejszy od 180
					Romb romb = new Romb(b1,b2,b3,b4,k);
					System.out.println("Obwod Rombu: "+ romb.Obwod());
					System.out.println("Pole Rombu: "+ romb.Pole());
					System.out.println();
				} else if(k==90 && (b1==b2 && b3==b4 && b1!=b3)|| (b1==b3 && b2==b4 && b1!=b2)|| (b1==b4 && b2==b3 && b1!=b2)) {
					Prostokat prostokat = new Prostokat(b1,b2,b3,b4,k);
					System.out.println("Obwod Prostokata: "+ prostokat.Obwod());
					System.out.println("Pole Prostokata: "+ prostokat.Pole());
					System.out.println();
				}
				liczbaPara+=5;
			}
		}
		
		//System.out.println(liczbaPara);
		
		
	}

}
