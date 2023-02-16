/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circuloo;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA1_5_CIRCULOO {

    public static void main(String[] args) {
        // TODO code application logic here
       circulo miCirculo=new circulo();
       miCirculo.setRadio(5);
               miCirculo.setdiametro(10);
               
               System.out.println("DATOS");
               miCirculo.calcularArea();
               miCirculo.calcularPerimetro();
    }
    
}
