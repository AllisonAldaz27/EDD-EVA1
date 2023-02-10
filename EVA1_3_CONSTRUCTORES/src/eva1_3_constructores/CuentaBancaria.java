package eva1_3_constructores;
public class CuentaBancaria {
    //atributos de la clase tienen que ser privados
   private String numCuenta;
     private double saldo;
     private String nomCliente;
     //CONSTRUCTORES
     //default y con argumentos 
     public CuentaBancaria(){//constructor default
         numCuenta="0";
         saldo=0;
         nomCliente="-_-_";
         
     }
     public CuentaBancaria(String nCuenta,double otroSaldo,String nCliente){
      numCuenta=nCuenta;
      saldo=otroSaldo;
      nomCliente=nCliente;
     }
             
             
             
             
             
     //comportamientos
     //métodos get y set
     public String getNumCuenta(){
    return numCuenta;
}
     public double getsaldo(){
    return saldo;
     }
      public String getNomCliente(){
    return nomCliente;
      }
      public void setNumCuenta(String valor){
   numCuenta=valor;
      }
        public void setsaldo(double valor){
   saldo=valor;
        }
           
    public void setNomCliente(String valor){
   nomCliente=valor;
    }
    

        
        
        
        
        
        
        
}
