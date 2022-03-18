//package Registres;
import java.time.LocalDate;
/**

Classe pilot aquesta classe hereda de la classe equip
*/
public class Pilot extends Equip
{
        // hereadar de Equip
        private String nom;
        //private String nomEquip;
        private LocalDate dataNaix;
        private int puntuacio;

        /**
         * Construcotr
         */
        public Pilot()
        {
        	super();
        }
        
        /**
         * Metode per entrar tot els metadatos d'un pilot
         * @param nomEntrat
         * @param dataNaix
         * @param punts
         */

        public void setTotPilot(String nomEntrat,LocalDate dataNaix,int punts)
        {
         this.nom = nomEntrat;
         this.dataNaix =dataNaix;
         this.puntuacio = punts;
        }
        
        /**
         * metode que et retorna el nom - String
         * @return
         */
        
        public String getNom()
        {
        	return this.nom;
        }
        
        /**
         * Metode que et retorna la data de naixament LOCALDATE
         * @return
         */
        public LocalDate getDataNaix()
        {
        	return this.dataNaix;
        }
        
        
        
        public int getPunts()
        {
        	return this.puntuacio;
        }
        
        /**
         * Metode per llistar tots els meta datos d'un o més piolts
         * @return
         */
        public String getLlistarPilot()
        {
        	String text = "";
        	
        	text = "Nom: "+ this.nom +" DataNaix "+ this.dataNaix.getDayOfMonth() +"/"+this.dataNaix.getMonthValue()+"/"+this.dataNaix.getYear()+" PUNTS: "+this.puntuacio;
        	return text;
        	
        }

}
