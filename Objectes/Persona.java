package Objectes;

import java.time.LocalDate;

public abstract class Persona 
{
    private String dni;
    private String nom;
    private LocalDate dataNaix;

    /**
     * Metode que serveix per entrar una persona
     * @param dniEntrat
     * @param nomEntrat
     * @param dataNaix
     */
    public void setPersona(String dniEntrat,String nomEntrat,LocalDate dataNaix)
    {
        this.dni = dniEntrat;
        this.nom =nomEntrat;
        this.dataNaix = dataNaix;
    }

    /**
     * metode que et reotrna tota la info d'una persona
     * @return
     */
    public String getInfoPersona()
    {
        return this.dni +" "+this.nom +" "+this.dataNaix.getDayOfMonth()+"/"+this.dataNaix.getMonthValue()+"/"+this.dataNaix.getYear();
    }

    /**
      * metode que et retorna el nom - String
     * @return
     */
        
    public String getNom()
    {
        return this.nom;
    }
    public String getDni()
    {
        return this.dni;
    }
    
    /**
     * Metode que et retorna la data de naixament LOCALDATE
     * @return
     */
    public LocalDate getDataNaix()
    {
  	 return this.dataNaix;
    }
        


}
