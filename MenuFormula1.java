package MainProgram;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintStream;
public class MenuFormula
{

	public static void main(String[] args) 
	{
		Scanner lector = new Scanner(System.in);
		
		int opcioMenu = -1;
		
		do 
		{
			System.out.println("MAIN MENU\n");
			System.out.println("1.Entrar ");
			System.out.println("2.Llistar");
			System.out.println("3.Esborrar");
			System.out.println("4.buscar");
			System.out.println("0.Sortir");
			
			opcioMenu =lector.nextInt();
			lector.nextLine();
			switch(opcioMenu)
			{
			case 1:
				// ENTRADA
				break;
			case 2:
				// LLISTAR
				int opcioLlistar = -1;
				
				do
				{
					System.out.println("LLISTAR\n");
					System.out.println("1.Classificacio final curses");
					System.out.println("2.Classi mundial pilots");
					System.out.println("3.classi mundial constructors");
					System.out.println("0.Tornar al menu princiapl");
					opcioLlistar =lector.nextInt();
					lector.nextLine();
					
					switch(opcioLlistar)
					{
					case 1:
						// clasi final cures
						break;
					case 2:
						// 
						break;
					case 3:
						//
						break;
					case 0:
						System.out.println("Toranaràs al menu princiapl\n");
						break;
						default:
							System.out.println("No tenim aquesta opcio");
							break;
					}
				}while(opcioLlistar!=0);
				
				
				break;
			case 3:
				// ESBORRAR
				break;
			case 4:
				// BUSCAR
				break;
			case 0:
				System.out.println("Fi programa");
				lector.close();
				break;
				default:
					System.out.println("No tenim aquesta opcio");
					break;
			}
			
		}while(opcioMenu!=0);

	}

}

