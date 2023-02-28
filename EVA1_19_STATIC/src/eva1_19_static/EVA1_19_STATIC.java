/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_static;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA1_19_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PI"+ Math.PI);
        System.out.println("Numero aleatorio"+Math.random());
        Utilerias Utileria=new Utilerias();
        Utilerias.Saludos();
        Utileria.OtroSaludo();
        Saludo2();
        
        
    }
    public void Saludo2(){
        System.out.println("HOLA");
    }
    
    class Utilerias{
        public void Saludo(){
            System.out.println("HOLA");
        }
        public void OtroSaludo(){
            System.out.println("otro saludo(static)");
        }
    }
    class OtraClase{
        
    }
}
