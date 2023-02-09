
package eva1_2_clases_java;
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //clase es la receta:
        //objeto en el platillo
        //instanciacion:
        //1.Declarar la identificador para el objeto
        //2.Asignar memoria con new
        //3.Invocar su constructor
        //Persona(}--> constructor
        //Constructor -->método
        Persona perso1 = new Persona();
       // System.out.println(perso1);
       /*
         //Esta seccion es por que iniciamos con los atributos con modificador default
         perso1.nombre="Allison";
         perso1.apellido="Aldaz";
         perso1.edad=18;
         perso1.estadoCivil=false; //false es soltera
         System.out.println(perso1.nombre);*/
        perso1.setNombre("ALLISON MICHELLE");
       // System.out.println(perso1.getNombre());
        perso1.setApellido("ALDAZ MARTINEZ");
        perso1.setEdad(18);
        perso1.setEstadocivil(true);
       /* System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getEstadocivil());*/
        perso1.imprimirDatos();
        //persona2
          Persona perso2 = new Persona();
         perso2.setNombre("Azul Andrea");
         perso2.setApellido("Martinez Marquez");
         perso2.setEdad(20);
         perso2.setEstadocivil(true);
         perso2.imprimirDatos();
          
          
          
    }
}
