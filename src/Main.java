import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		
//		System.out.println(Laskuri.laskePintaAla(2, 5));
//		System.out.println(Laskuri.laskePintaAla(3));
		
		Scanner in = new Scanner (System.in);
		
		String answer;
		double pituus, leveys, sade;
		
		System.out.println("Suorakulmio vai ympyrä?");
		answer = in.nextLine();
		
		if(answer.equalsIgnoreCase("suorakulmio"))
		{
			System.out.println("Anna pituus");
			pituus = Double.parseDouble(in.nextLine());
			
			System.out.println("Anna leveys");
			leveys = Double.parseDouble(in.nextLine());
			
			System.out.println(Laskuri.laskePintaAla(pituus, leveys));
		}
		
		else
		{
			System.out.println("Anna säde");
			sade = Double.parseDouble(in.nextLine());
			
			System.out.println(Laskuri.laskePintaAla(sade));
		}
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