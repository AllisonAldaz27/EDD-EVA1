/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_sobrecarga_areas;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA1_17_SOBRECARGA_AREAS {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("AREA DEL CIRCULO:  "+ area(5));
        System.out.println("AREA DEL TRIANGULO:  "+area(5,5));
        System.out.println("ATRA DEL TRAPECIO:  "+area(5,5,5));
    }
    public static double area(double radio){
        return Math.PI*radio*radio;
    }
    public static double area(double base,double altura){
        return (base*altura)/2.0;
    }
    public static double area(double altura,double basemayor,double basemenor){
        return altura*(basemayor+basemenor)/2.0;
    }
}
