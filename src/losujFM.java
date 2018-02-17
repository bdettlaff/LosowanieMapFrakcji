import java.util.Random;

public class losujFM {

	pokazFrakcje pokazF = new pokazFrakcje();
	pokazMapy pokazM = new pokazMapy();
	
	Random generator = new Random();
	
	String[] frakcja = new String[2];
	String mapa = new String();
	
	int numerPierwszy;
	int numerDrugi;
	int numerTrzeci;

	public void losujNumeryFrakcji()
	{
		numerPierwszy = generator.nextInt(4);
		numerDrugi = generator.nextInt(4);
		
		while(numerPierwszy==numerDrugi)
		{
			numerDrugi = generator.nextInt(4);
		}

	}
	
	public void losujNumerMapy()
	{
			numerTrzeci = generator.nextInt(12);
	}
	
	
	public String pobierzNazweMapy()
	{		
		mapa = pokazM.tablica[numerTrzeci][1].toString();
		
		return mapa;
	}

	
	public String[] pobierzNazweFrakcji()
	{		
		frakcja[0] = pokazF.tablica[numerPierwszy][1].toString();
		frakcja[1] = pokazF.tablica[numerDrugi][1].toString();
		
		return frakcja;
	}
}
