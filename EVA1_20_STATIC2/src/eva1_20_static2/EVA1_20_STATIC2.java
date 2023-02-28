/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_static2;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA1_20_STATIC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Formulasgeometria formulas= new Formulasgeometria();
        System.out.println("MI PI:  "+Formulasgeometria.PI);
        System.out.println("AREA DEL TRIANGULO:  "+Formulasgeometria.areaTriangulo(5.0,10.0));
        System.out.println("VOLUMEN DE UNA ESFERA:   "+ Formulasgeometria.volumenEsfera(15));
    }
    
}
