package MainPrograma;
//package Formula1;
import java.util.Scanner;
//import java.util.concurrent.ExecutionException;

import Objectes.Circuits;
import Objectes.Curses;

import java.util.ArrayList;
import java.io.File;
import java.io.PrintStream;
import java.time.LocalDate;

// PACKAGES PERSONALS
import Objectes.*;
import Fitxers.*;
import Funcions.EntradaPilots;
public class MenuFormula
{

	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) 
	{
		//Scanner lector = new Scanner(System.in);
		
		//fitxerPilots Debian
		File fPilots = new File (File.separator + "home" + File.separator + "$USER" + File.separator + "formula1" + File.separator + "pilots.txt");
		
		
		
		//fitxerCircuits Debian
		File fCircuits = new File (File.separator + "home" + File.separator + "$USER" + File.separator + "formula1" + File.separator + "circuits.txt");
	
		//File fCircuits = new File ("C:" + File.separator + "fitxers" + File.separator + "circuits.txt");
		
		//fitxerCurses Debian
		File fCurses = new File (File.separator + "home" + File.separator + "$USER" + File.separator + "formula1" + File.separator + "curses.txt");
						
		
		
		ArrayList<Pilot> pilots = new ArrayList<Pilot>();
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
			int numPilots = caluclNum(fPilots);
			int numCircuits = caluclNum(fCircuits);
			int numCurses = caluclNum(fCurses);

			carregarDadesArrayListPilots(fPilots,pilots,numPilots);
			carregarDadesArrayListCurses(fCurses,curses);
			carregarDadesArrayListCircuits(fCircuits,circuits);

			//System.out.println(pilots.get(0).getLlistarPilot());
			//System.out.println(pilots.get(1).getLlistarPilot());
			
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
							int opcioEntrada = lector.nextInt();
							lector.nextLine();
							
							switch(opcioEntrada)
							{
								case 1:
										System.out.println("----------------------");
										System.out.println("    ENTRADA PILOTS    ");
										System.out.println("----------------------");
										System.out.println("");
										EntradaPilots.entradaPilots(pilots, fPilots);
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
										lector.close();
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
	/**
	 * Metode carregar dades pilots al seu arrayList
	 * @param fPilots
	 * @param pilots
	 * @param numPilots
	 */
	private static void carregarDadesArrayListPilots(File fPilots, ArrayList<Pilot> pilots, int numPilots) 
	{
		try 
		{
			Scanner lectorF = new Scanner(fPilots);
			lectorF.nextLine();
			 
			for(int i = 0; i < numPilots; i++)
			{
				Pilot conductor = new Pilot();
				String dades = lectorF.nextLine();
				
				String [] taula = dades.split("#");
					String dni = taula[0];
					String nom = taula[1];
					LocalDate dataNaix = converData(taula[2]);
					int punts = Integer.parseInt(taula[3]);
					String nomEquip = taula[4];

				conductor.setTotPilot(dni,nom, dataNaix, punts,nomEquip);
				pilots.add(conductor);
			}
			lectorF.close();
		} 
		catch (Exception e) 
		{
			System.out.println("Error: " + e);
		}
	}
	private static void carregarDadesArrayListCurses(File fCurses, ArrayList<Curses> curses) 
	{
	}
	private static void carregarDadesArrayListCircuits(File fCircuits, ArrayList<Circuits> circuits) 
	{
	}
	
	
	/**
	 * Metode que retorna el numero de files que te el fitxer
	 * @param fPilots
	 * @return
	 */

	private static int caluclNum(File f) 
	{
		try
		{
			Scanner lectorF = new Scanner(f);
			int num = Integer.parseInt(lectorF.nextLine());
			lectorF.close();
			return num;
		}
		catch(Exception error)
		{
			System.out.println("Error: " + error);
			return 0;
		}
	}
	private static LocalDate converData(String data)
	{
		String [] taula = data.split("/");
		int dia = Integer.parseInt(taula[0]);
		int mes = Integer.parseInt(taula[1]);
		int any = Integer.parseInt(taula[2]);
		return LocalDate.of(any, mes, dia);
	}
}