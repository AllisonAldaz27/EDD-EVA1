/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circuloo;

public class circulo {
   private double diametro,area,perimetro,radio,Pi;
   public circulo(){
    Pi= (float)3.1416;
    diametro=10;
    area=0;
    radio=9;
}
    public void calcularArea(){
        area=Pi*radio*radio;
        System.out.println("EL AREA DEL CIRCULO ES:  "+ area);
    }
     public void calcularPerimetro(){
        perimetro=Pi*diametro;
        System.out.println("EL PERIMETRO DEL CIRCULO ES:  "+ perimetro);
     }
     public double getRadio(){
         return radio;
     }
     public double getperimetro(){
         return perimetro;
     }
     public double getArea(){
         return area;
     }
     public double getdiametro(){
         return diametro;
     }
      public void setRadio(double valor){
        radio= valor;
     }
public void setperimetro(double valor){
        perimetro= valor;
}
public void setarea(double valor){
        area= valor;
}

public void setdiametro(double valor){
    diametro=valor;
}
}



