package Funcions;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import Objectes.*;
public class EntradaPilots {

    public static void entradaPilots(ArrayList<Pilot> listPilots, File f1) 
	{
		Scanner lector = new Scanner(System.in);
		boolean menu = false;
		String nom = "";
		String dni = "";
		do 
		{
			Pilot conductor = new Pilot();

			System.out.println("Entra el nom del pilot: ");
			nom = lector.nextLine();
			if(!nom.equalsIgnoreCase("Sortir"))
			{
				System.out.println("Entra el dni del pilot: ");
				dni = lector.nextLine();

				System.out.println("Entra la data de naixement del pilot: (dd/mm/aaaa)");
				String auxDataNaix = lector.nextLine();
				LocalDate dataNaix = converData(auxDataNaix);

				System.out.println("Entra els punts que te el pilot: ");
				int punts = lector.nextInt();
				lector.nextLine();

				System.out.println("Entra el nom del equip del pilot: ");
				String nomEquip = lector.nextLine();

				conductor.setTotPilot(dni,nom, dataNaix, punts, nomEquip);
				listPilots.add(conductor);
			}
			else menu = true;
			
		}while(!menu);
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
