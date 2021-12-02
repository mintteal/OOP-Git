
public class Main 
{

	public static void main(String[] args) 
	{
		
		System.out.println(Laskuri.laskePintaAla(2, 5));
		System.out.println(Laskuri.laskePintaAla(3));

	}

}

class Laskuri
{
	
	public static double laskePintaAla(double pituus, double leveys)
	{
	return pituus*leveys;
	}
	
	public static double laskePintaAla(double sade)
	{
		return (22*sade*sade)/7;
	}
	
	
}