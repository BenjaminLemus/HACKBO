package comp1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		String a;
		while(true)
		{
		a=Leer.nextLine();
		
			if(a.equals("#"))
				{
				break;
				}
			else
			{
				
			
			if(a.equals("HELLO"))
			{
				System.out.println("Case 1: ENGLISH");
			}
			else
			{
				if(a.equals("HOLA"))
				{
					System.out.println("Case 2: SPANISH");
				}
				else
				{
					if(a.equals("HALLO"))
					{
						System.out.println("Case 3: GERMAN");
					}
					else
					{
						if(a.equals("BONJOUR"))
						{
							System.out.println("Case 4: FRENCH");
						}
						else
						{
							if(a.equals("CIAO"))
							{
								System.out.println("Case 5: ITALIAN");
							}
							else
							{
								if(a.equals("ZDRAVSTVUJTE"))
								{
									System.out.println("Case 6: RUSSIAN");
								}
								else
								{
									System.out.println("UNKNOWN");
								}
							}
						}
					}
				}
			}
	
		}
	}
}
}