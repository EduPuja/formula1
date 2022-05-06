package Objectes;
public class Circuits 
{
    //variables
    private String nomCircut;
    private int numCircut;

    // !! variable que encara esta en discusio !!
    private int numVoltes;
    /**
     * Constructor buit  de cirucits
     */
    public Circuits()
    {

    }
    /**
     * Constructor v2 per crear directament un circuit
     * @param num
     * @param nom
     */
    public Circuits(int num , String nom)
    {
        this.nomCircut=nom;
        this.numCircut=num;
        this.numVoltes++;
    }
    /**
     * metode que crea un cicuit
     * @param num
     * @param nom
     */
    public void setCircuit(int num,String nom)
    {
        this.nomCircut =nom;
        this.numCircut = num;
        this.numVoltes++;
    }
    /**
     * Metode que et retorna tota la informacio de una Circuit
     * @return text
     */
    public String getInfoCiruit()
    {
        return "Num_Cicuit: "+this.numCircut +" Nom_Circuit: "+this.nomCircut;
    }

    /**
     * metode que et retorna el nom del circuit
     * @return this.nomCircuit;
     */
    public String getNomCircuti()
    {
        return this.nomCircut;
    }

    /**
     * metode que et retorna 
     * @return this.numCircuit;
     */
    public int getNumCircuit()
    {
        return this.numCircut;
    }

    
}
