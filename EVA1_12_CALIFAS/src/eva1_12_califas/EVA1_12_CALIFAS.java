/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_califas;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
String cali;
cali=califas(85);//almaceno el resultado en una variable 
        System.out.println("CALIFICACION PARA 85:  "+ cali);
        System.out.println("CALIFICACION PARA 70:  "+califas (70));//invovo dentro de otra funcion
        califas(100);//ignoro el rsultado 
    }

    public static String califas(int califa) {
        String resu = "";
        if ((califa >= 91) && (califa <= 100)) {
            resu = "A";
        } else if ((califa >= 81) && (califa <= 90)) {
            resu = "B";
        } else if ((califa >= 71) && (califa <= 80)) {
            resu = "C";
        } else {
            resu = "D";
        }
        return resu;
    }

}
