/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_alcance;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA1_13_ALCANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=100;//visible para todo lo que este dentro del main
        for (int i = 0; i < 10; i++) {//INICIO DEL CICLO FOR 
            System.out.println("x = "+ x);//visible dentro del for 
            System.out.println("i = " + i);
            System.out.println("j = " + j);//VARIABLE NO VISIBLE 
            //NO ESTA DECLARADA ANTES DE LA INSTRUCCION

            int j = 100;//APARTIR DE AQUI ES VISIBLE
            System.out.println("j = " + j);
            {
                int z=1000;
                System.out.println("z ="+ z);
            }
                            System.out.println("z ="+ z);

//TERMINA BLOQUE FOR
        }
        System.out.println("i = " + i);//NO SON VISIBLES FUERA DEL FOR
        System.out.println("j = " + j);

    }
public static void algo (){
            System.out.println("x = " + x);//no es visible en algo()

}
}
