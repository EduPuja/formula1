package Objectes;
import java.time.*;
public class Curses
{
    
    private int numCursa;
    private String nomCursa;
    private LocalDate dataCursa;
    private int segons;
    
    
    /**
     * Construcotor default
     */
    public Curses()
    {

    }

    // metodes set 

    public void setCursa(int numCursa,String nom,LocalDate data, int segons)
    {
        this.numCursa= numCursa;
        this.nomCursa=nom;
        this.dataCursa=data;
        this.segons= segons;
    }


    // metodes get
    public String getInfoCursa()
    {
        return this.numCursa +" "+this.nomCursa +" "+this.dataCursa.getDayOfMonth() +"/"+this.dataCursa.getMonthValue()+"/"+this.dataCursa.getYear()+" "+this.segons;
    }

    public int getNumCursa()
    {
        return this.numCursa;
    }
    public String getNomCursa()
    {
        return this.nomCursa;
    }
    public LocalDate getData()
    {
        return this.dataCursa;
    }


    
}