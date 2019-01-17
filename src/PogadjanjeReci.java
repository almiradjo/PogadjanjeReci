import java.io.*;

public class PogadjanjeReci {

	public static void main(String[] args) throws IOException
	{
		String rec = "test"; //rec koju gadjamo
		int bodovi = rec.length()*30;
		
		//Ovde pravimo niz karaktera _, da nam sluze kao ona tabla na kojoj cemo 
		//da pokazemo koja su slova otkrivena kasnije
		char[] sakriveno = new char[rec.length()]; 
		for (int indeks = 0; indeks < sakriveno.length; indeks++)
		{
			sakriveno[indeks] = '*';
		}
		
		
		
		BufferedReader citac = new BufferedReader(new InputStreamReader(System.in));
		boolean zavrseno = false; //Da znamo kada sa igrom mozemo da stanemo
		
		do
		{
			System.out.println(sakriveno);
			System.out.println("Pogodi rec ili probaj slovo: ");
			System.out.println("Preostali broj bodova je: " + bodovi);
			String unos = citac.readLine();
		
			if (unos.length() == 0) //Korisnik unese nista, mi ga ignorisemo :D
			{
			
			} else if (unos.length() == 1) //Ako je korisnik uneo jedno slovo...
			{
				if (rec.contains(unos)) //gledamo ima li nasa rec to slovo
				{
					bodovi-=10;
					//Ako ga ima, prosetacemo se kroz celu rec, kao da je niz
					for (int indeks = 0; indeks < rec.length(); indeks++)
					{
						if (rec.toCharArray()[indeks] == unos.toCharArray()[0])
						{
							//gde nadjemo da slovo postoji, na istom mestu
							//na nasoj "tabli" unosimo to slovo
							sakriveno[indeks] = unos.toCharArray()[0];
						}
						
						if (rec.equals(String.valueOf(sakriveno)))
						{ //Ako smo nasli sva slova, smatramo da je igra zavrsena
							System.out.println("Sva slova pogodjena! :) ");
							System.out.println("Rec je bila: " + rec);
							zavrseno = true;
							break;
						}
					}
				}else 
				{  //Ako slovo ne postoji u reci, to i kazemo :*(
					bodovi-=20;
					System.out.println("Nemam slovo :( !");
				}
			} else //U slucaju da korisnik nije uneo nista, a nije uneo ni samo jedno 
				  //slovo, smatramo da je pokusao da pogodi rec, pa odmah i proverimo
			{
				if (unos.equals(rec)) //ako je unos jednak reci, pogodjeno je :) 
				{
					System.out.println("Jej :D pogodak!" );
					zavrseno = true;
				} else
				{
					bodovi-=30;
					System.out.println("Promasaj :(");
				}
			}
		 
		if(bodovi<10)
		{
			zavrseno = true;
			System.out.println("Nemate vise bodova! ");
			break;
		}
		
		}while(!zavrseno);
	}
}