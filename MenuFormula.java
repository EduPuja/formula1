//package Formula1;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintStream;
public class MenuFormula
{

	public static void main(String[] args) 
	{
		Scanner lector = new Scanner(System.in);
		
		//fitxerPilots Debian
		//File fPilots = new File (File.separator + "home" + File.separator + "$USER" + File.separator + "formula1" + File.separator + "pilots.txt");
		
		//fitxerPilots Windows
		File fPilots = new File ("C:" + File.separator + "fitxers" + File.separator + "pilots.txt");
		
		//fitxerCircuits Debian
		//File fCircuits = new File (File.separator + "home" + File.separator + "$USER" + File.separator + "formula1" + File.separator + "circuits.txt");
				
		//fitxerCircuits Windows
		File fCircuits = new File ("C:" + File.separator + "fitxers" + File.separator + "circuits.txt");
		
		//fitxerCurses Debian
		//File fCurses = new File (File.separator + "home" + File.separator + "$USER" + File.separator + "formula1" + File.separator + "curses.txt");
						
		//fitxerCurses Windows
		File fCurses = new File ("C:" + File.separator + "fitxers" + File.separator + "curses.txt");
		
		ArrayList<Pilot> pilots = new ArrayList<Pilot>();
		ArrayList<Equip> equips = new ArrayList<Equip>();
		ArrayList<Curses> curses = new ArrayList<Curses>();
		ArrayList<Circuits> circuits = new ArrayList<Circuits>();
		
		/*
		 * clasificacio final del les curses 
		 * classificació del mundial de pilots 
		 * classificació del mundial de constructors
		*/
				
		boolean menu = false;
		
		do 
		{
			System.out.println("-----------------");
			System.out.println("    MAIN MENU    ");
			System.out.println("-----------------");
			System.out.println("");
			System.out.println("1 - Entrar ");
			System.out.println("2 - Llistar");
//			System.out.println("3 - Esborrar");
//			System.out.println("4 - Buscar");
			System.out.println("0 - Sortir");
			
			int opcioMenu = lector.nextInt();
			lector.nextLine();
			switch(opcioMenu)
			{
				case 1:
						// ENTRADA
						boolean menuEntrada = false;
						
						do
						{
							System.out.println("---------------");
							System.out.println("    ENTRADA    ");
							System.out.println("---------------");
							System.out.println("");
							System.out.println("1 - Entrada pilots");
							System.out.println("2 - Entrada circuits");
							System.out.println("3 - Entrada curses");
							System.out.println("0 - Tornar al menu princiapl");
							int opcioEntrada =lector.nextInt();
							lector.nextLine();
							
							switch(opcioEntrada)
							{
								case 1:
										System.out.println("----------------------");
										System.out.println("    ENTRADA PILOTS    ");
										System.out.println("----------------------");
										System.out.println("");
										entradaPilots(pilots, fPilots);
									break;
								case 2:
										System.out.println("------------------------");
										System.out.println("    ENTRADA CIRCUITS    ");
										System.out.println("------------------------");
										System.out.println("");
										//entradaCircuits(...);
									break;
								case 3:
										System.out.println("----------------------");
										System.out.println("    ENTRADA CURSES    ");
										System.out.println("----------------------");
										System.out.println("");
										//entradaCurses(...);
									break;
								case 0:
										System.out.println("Toranaràs al menu princiapl\n");
										menuEntrada = true;
									break;
								default:
										System.out.println("No tenim aquesta opcio");
									break;
							}
						}while(!menuEntrada);
					break;
				case 2:
						// LLISTAR
						boolean menuLlistar = false;
						
						do
						{
							System.out.println("---------------");
							System.out.println("    LLISTAR    ");
							System.out.println("---------------");
							System.out.println("");
							System.out.println("1 - Classificacio final curses");
							System.out.println("2 - Classificacio mundial pilots");
							System.out.println("3 - Classificacio mundial constructors");
							System.out.println("0 - Tornar al menu princiapl");
							int opcioLlistar =lector.nextInt();
							lector.nextLine();
							
							switch(opcioLlistar)
							{
								case 1:
										System.out.println("----------------------------------");
										System.out.println("    CLASSIFICACIO FINAL CURSES    ");
										System.out.println("----------------------------------");
										System.out.println("");
										//classificacioFinalCurses(...);
									break;
								case 2:
										System.out.println("------------------------------------");
										System.out.println("    CLASSIFICACIO MUNDIAL PILOTS    ");
										System.out.println("------------------------------------");
										System.out.println("");
										//classificacioMundialPilots(...);
									break;
								case 3:
										System.out.println("------------------------------------------");
										System.out.println("    CLASSIFICACIO MUNDIAL CONSTRUCTORS    ");
										System.out.println("------------------------------------------");
										System.out.println("");
										//classificacioMundialConstructors(...);
									break;
								case 0:
										System.out.println("Toranaràs al menu princiapl\n");
										menuLlistar = true;
									break;
								default:
										System.out.println("No tenim aquesta opcio");
									break;
							}
						}while(!menuLlistar);
					break;
				case 0:
						System.out.println("Fi programa.");
						menu = true;
						lector.close();
					break;
				default:
						System.out.println("No tenim aquesta opcio");
					break;
			}
			
		}while(!menu);

	}

	private static void entradaPilots(ArrayList<Pilot> listPilots, File f1) 
	{
		Scanner lector = new Scanner(System.in);
		boolean menu = false;
		String nom = "";
		do 
		{
			System.out.println("Entra el nom del pilot: ");
			nom = lector.nextLine();
			if(!nom.equalsIgnoreCase("Sortir"))
			{

			}
			else menu = true;
			
		}while(!menu);
	}

}