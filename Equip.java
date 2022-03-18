//package Registres;

public class Equip 
{
	
	private int idEquip; // clau priniciapl
	private String nomEquip; // nom 
	
	/**
	 * constructor
	 */
	public Equip()
	{
		
	}
	
	/**
	 * metode per entrar un pilot
	 * @param idEquip
	 * @param nomEquip
	 */
	public void setEquip(int idEquip ,String nomEquip)
	{
		this.idEquip = idEquip;
		this.nomEquip = nomEquip;
	}
	/**
	 * metode que et retorna una llista de pilots
	 * @return
	 */
	public String getLlistarEquip()
	{
		String text ="";
		
		text = "Num Equip: "+ this.idEquip +" NomEquip: "+this.nomEquip;
		return text;
	}
	/**
	 * Et retorna el num del equip
	 * @return
	 */
	public int getIdEquip()
	{
		return this.idEquip;
	}
	
	/**
	 * et retorna el nom del equip
	 * @return
	 */
	public String getNomEquip()
	{
		return this.nomEquip;
	}
	
}
