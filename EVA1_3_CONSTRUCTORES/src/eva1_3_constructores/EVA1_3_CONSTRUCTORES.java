
package eva1_3_constructores;

public class EVA1_3_CONSTRUCTORES {
    public static void main(String[] args) {
        CuentaBancaria cuen1 = new  CuentaBancaria("2", 40000000,"carlos slim");
   /*  cuen1.setNomCliente("Carlos Slim");
     cuen1.setNumCuenta("1");
       cuen1.setsaldo(40000000);*/
        System.out.println("DATOS DEL CLIENTE:  ");
        String nombre=cuen1.getNomCliente();
        System.out.println(nombre);
        System.out.println(cuen1.getNumCuenta());
        System.out.println(cuen1.getsaldo());
        //-----
        CuentaBancaria cuen2=new CuentaBancaria("3", 50, "Maria");
         System.out.println("DATOS DEL CLIENTE:  ");
        System.out.println(cuen2.getNomCliente());
        System.out.println(cuen2.getNumCuenta());
        System.out.println(cuen2.getsaldo());
        //-------
         CuentaBancaria cuen3=new CuentaBancaria("4", 1000, "Jorge");
         System.out.println("DATOS DEL CLIENTE:  ");
        System.out.println(cuen3.getNomCliente());
        System.out.println(cuen3.getNumCuenta());
        System.out.println(cuen3.getsaldo());
    }
    
}
//constructores
//es un metodo que sirve para construir los objetos
//sirven para inicializar 
//es lo primero en ejecutarse
