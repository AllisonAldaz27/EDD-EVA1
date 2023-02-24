/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_sobrecarga_2;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA1_16_SOBRECARGA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("SUMA:  "+ suma(4,5));
        System.out.println("SUMA:  "+ suma(4.0,5.0));
        System.out.println("SUMA:  "+ suma("HOLA","MUNDO!!"));
        suma();
    }
                  //firma de sum (int,int)
    public static int suma(int val1,int val2){
        return val1+val2;
    }
    //firma seria (double, double)
    public static double suma(double val1,double val2){
        return val1+val2;
    }
    //firma seria (string,string)
    public static String suma(String val1,String val2){
        return val1+val2;
    }
    //firma es (suma)
    public static void suma(){
        System.out.println( "METODO SIN PARAMETROS SUMA");
    }
}
