package Objectes;
import java.time.LocalDate;
/**

Classe pilot aquesta classe hereda de la classe equip
*/
public class Pilot extends Persona
{
        // hereadar de Equip
        private String nomEquip;
        private int puntuacio;
        
        /**
         * Construcotr
         */
        public Pilot()
        {
         super();
        }
        
        /**
         * Metode que entra un pilot
         * @param dni
         * @param nomEntrat
         * @param dataNaix
         * @param punts
         * @param nomEquip
         */

        public void setTotPilot(String dni, String nomEntrat,LocalDate dataNaix,int punts,String nomEquip)
        {
          super.setPersona(dni, nomEntrat, dataNaix);
          this.puntuacio = punts;
          this.nomEquip = nomEquip;
        }
        
       
       
        
        /**
         * metode que et retorna un  valor
         * @return
         */
        public int getPunts()
        {
        	return this.puntuacio;
        }
        /**
         * retorna el nom del equip
         * @return
         */
        public String getNomEquip()
        {
                return this.nomEquip;
        }
        
        

}
