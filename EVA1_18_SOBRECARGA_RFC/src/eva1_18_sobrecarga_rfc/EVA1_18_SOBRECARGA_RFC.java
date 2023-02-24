
package eva1_18_sobrecarga_rfc;

public class EVA1_18_SOBRECARGA_RFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rfc=generarRFC("ALLISON","ALDAZ","MARTINEZ",2004,23,10);
        System.out.println(rfc);
    }
    public static String generarRFC(String nombre,String apPat,String apMat,int año,int mes,int dia){
      String apP1= apPat.charAt(0) +"";
      String apP2=apPat.charAt(1)+"";
        String apM=apMat.charAt(0)+"";
        String nom=nombre.charAt(0)+"";
        String rfc= apP1+apP2+apM+nom+año+mes+dia+"";
        return rfc;
    }
}
