package eva1_2_clases_java;
class Persona {

    //TODO ESTO ES ENCAPSULAMIENTO
//Atributos de la clase

    private String nombre;
    private String apellido;
    private int edad;
    private boolean estadoCivil;
    //Metodos:Comportamientos
    //Lectura y escritura de atributos;
    //Metodos get --> leer,método set--> escribir
    // métodos;
    //modificador valor de retorno nombre(argumentos)(implementacion)
   //si se va a leer es "get"
    public String getNombre(){
        return nombre;
    }
    //si se asigna valor es "set"
    public void setNombre(String valor){
        nombre=valor;
        
    }
      public int getEdad(){
        return edad;
    }
    //si se asigna valor es "set"
    public void setEdad(int valor){
        edad=valor;
    }
      public String getApellido(){
        return apellido;
    }
    //si se asigna valor es "set"
    public void setApellido(String valor){
        apellido=valor;
    }
      public boolean getEstadocivil(){
        return estadoCivil;
    }
    //si se asigna valor es "set"
    public void setEstadocivil(boolean valor){
        estadoCivil=valor;
    }
    public void imprimirDatos(){
        
        System.out.println("Datos Almacenados:");
        //concatenacion
        //+suma (numeros)+ concatena   <-- se le llama sobrecarga de operadores 
        System.out.println("Nombre Completo:"+ nombre +" "+apellido);
        System.out.println("Edad:  "+edad);
        if (estadoCivil)
            System.out.println("Estado civil: casado");
        else
            System.out.println("Estado civil: soltero");
    }
    
}
